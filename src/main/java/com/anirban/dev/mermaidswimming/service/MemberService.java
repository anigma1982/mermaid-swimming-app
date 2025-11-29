package com.anirban.dev.mermaidswimming.service;

import com.anirban.dev.mermaidswimming.model.Member;
import com.anirban.dev.mermaidswimming.repository.MemberRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class MemberService {
    private final MemberRepository memberRepository;

    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    public List<Member> getAllMembers(){
        return memberRepository.findAll();
    }

    public Member getMemberById(Integer id){
        return memberRepository.findById(id).orElse(null);
    }

    public Member registerMember(Member member){
        return memberRepository.save(member);
    }
}
