package com.anirban.dev.mermaidswimming.repository;

import com.anirban.dev.mermaidswimming.model.MemberCourse;
import com.anirban.dev.mermaidswimming.model.MemberCourseId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface MemberCourseRepository extends JpaRepository<MemberCourse, MemberCourseId> {

    List<MemberCourse> findByMemberId(Integer memberId);
    List<MemberCourse> findByCourseId(Integer courseId);
    boolean existsByMemberIdAndCourseId(Integer memberId, Integer courseId);
}
