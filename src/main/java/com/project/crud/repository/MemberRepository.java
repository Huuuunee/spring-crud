package com.project.crud.repository;

import com.project.crud.dto.MemberUpdateDto;
import com.project.crud.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MemberRepository extends JpaRepository<Member,Long> {
    boolean existsByUserId(String userId);
    Optional<Member> findMemberByName(String name);
}
