package com.project.crud.repository;

import com.project.crud.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository extends JpaRepository<Member,Long> {
    boolean existsByUserId(String userId);
    Member findByUserId(String userId);
}
