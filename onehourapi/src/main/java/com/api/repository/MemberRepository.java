package com.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.repository.entity.Member;

public interface MemberRepository extends JpaRepository<Member, Long>{
}
