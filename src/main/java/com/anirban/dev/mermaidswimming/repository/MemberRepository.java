package com.anirban.dev.mermaidswimming.repository;

import com.anirban.dev.mermaidswimming.model.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository extends JpaRepository<Member, Integer> {
}
