package com.anirban.dev.mermaidswimming.model;


import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Embeddable
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MemberCourseId implements Serializable {

    @Column(name = "member_id")
    private Integer memberId;

    @Column(name = "course_id")
    private Integer courseId;

}
