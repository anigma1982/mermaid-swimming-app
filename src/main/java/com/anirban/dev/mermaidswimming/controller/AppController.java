package com.anirban.dev.mermaidswimming.controller;

import com.anirban.dev.mermaidswimming.model.Centre;
import com.anirban.dev.mermaidswimming.model.Job;
import com.anirban.dev.mermaidswimming.model.Member;
import com.anirban.dev.mermaidswimming.repository.CentreRepository;
import com.anirban.dev.mermaidswimming.repository.JobRepository;
import com.anirban.dev.mermaidswimming.repository.MemberRepository;
import com.anirban.dev.mermaidswimming.service.MemberService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import java.util.List;
import java.util.Optional;

@Controller
public class AppController {

    private final CentreRepository centreRepository;
    private final MemberRepository memberRepository;
    private final MemberService memberService;
    private final JobRepository jobRepository;


    public AppController(CentreRepository centreRepository, MemberRepository memberRepository, MemberService memberService, JobRepository jobRepository) {
        this.centreRepository = centreRepository;
        this.memberRepository = memberRepository;
        this.memberService = memberService;
        this.jobRepository = jobRepository;
    }

    private void addGalleryImagesToModel(Model model){
        List<String> galleryImages = List.of(
          "/images/swim1.jpeg",
          "/images/swim2.jpeg",
          "/images/swim3.jpeg",
          "/images/swim4.jpeg",
          "/images/swim5.jpeg",
          "/images/swim6.jpeg"
        );
        model.addAttribute("galleryImages", galleryImages);
    }

    @GetMapping("/login")
    public String login() {return "login";}

    @GetMapping({"/home"})
    public String home(Model model){
        model.addAttribute("centres", List.of());
        addGalleryImagesToModel(model);
        return "home";
    }

    @PostMapping("/home/search")
    public String searchCentres(@RequestParam Integer zip, Model model){
        List<Centre> centres = centreRepository.findByZip(zip);
        model.addAttribute("centres", centres);
        model.addAttribute("searchedZip", zip);
        addGalleryImagesToModel(model);
        return "home";
    }

    @GetMapping("/register")
    public String showRegisterForm(Model model){
        model.addAttribute("member", new Member());
        return "register";
    }

    @PostMapping("/register")
    public String processRegistration(@ModelAttribute Member member, RedirectAttributes redirectAttributes){
        Member registeredMember = memberService.registerMember(member);
        redirectAttributes.addFlashAttribute("successMessage", "Welcome! Your Member Id is "+ registeredMember.getId() +
                "Please keep it safe for future reference");
        return "redirect:/register";
    }

    @GetMapping("/modify")
    public String showModifyPage(Model model){
        model.addAttribute("member", new Member());
        model.addAttribute("memberFound", false);
        return "modify";
    }

    @PostMapping("/modify/search")
    public String searchMember(@RequestParam Integer memberId, Model model){
        Optional<Member> memberOpt = memberRepository.findById(memberId);
        if(memberOpt.isPresent()){
            model.addAttribute("member", memberOpt.get());
            model.addAttribute("memberFound", true);
        } else {
            model.addAttribute("member", new Member());
            model.addAttribute("memberFound", false);
            model.addAttribute("errorMessage", "Member ID not found");
        }
        return "modify";
    }

    @PostMapping("/modify/update")
    public String updateMember(@ModelAttribute("member") Member member, Model model){
        try {
            if (member.getId() == null || !memberRepository.existsById(member.getId())) {
                model.addAttribute("errorMessage", "Member not found");
                return "modify";
            }

            memberRepository.save(member);
            model.addAttribute("successMessage", "Member Updated successfully!");
            model.addAttribute("memberFound", false);
        } catch (Exception exception){
            model.addAttribute("errorMessage","Error updating member:" + exception.getMessage());
            model.addAttribute("memberFound", true);
        }
            return "modify";
    }

    @GetMapping("/about")
    public String about(Model model){
        addGalleryImagesToModel(model);
        return "about";
    }

    @GetMapping("/careers")
    public String showCareerPage(Model model) {
        List<Job> jobs = jobRepository.findAll();
        model.addAttribute("jobs", jobs);
        System.out.println("Jobs count: "+ jobs.size());
        return "careers";
    }

    @GetMapping("/courses")
    public String showCoursesPage(Model model){
        model.addAttribute("members", memberService.getAllMembers());
        return "courses";
    }




}
