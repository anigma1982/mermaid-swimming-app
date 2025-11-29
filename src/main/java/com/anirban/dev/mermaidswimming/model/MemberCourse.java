package com.anirban.dev.mermaidswimming.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "member_course")
@AllArgsConstructor
@NoArgsConstructor
public class MemberCourse {

    @EmbeddedId
    private MemberCourseId id;

    @ManyToOne
    @MapsId("memberId")
    @JoinColumn(name = "member_id")
    private Member member;

    @ManyToOne
    @MapsId("courseId")
    @JoinColumn(name = "course_id")
    private Member course;

}
