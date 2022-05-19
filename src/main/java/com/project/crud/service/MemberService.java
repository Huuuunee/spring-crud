package com.project.crud.service;

import com.project.crud.dto.MemberDto;
import com.project.crud.entity.Member;
import com.project.crud.repository.MemberRepository;
import com.project.crud.global.exception.CustomException;
import com.project.crud.global.exception.ErrorCode;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import java.util.List;

@Slf4j
@RequiredArgsConstructor
@Service
public class MemberService {

    private final MemberRepository memberRepository;

    public void signup(MemberDto memberDto){
        if(memberRepository.existsByUserId(memberDto.getUserId())) {
            throw new CustomException(ErrorCode.MEMBER_ALREADY);
        }
        Member user = memberDto.toEntity();
        memberRepository.save(user);
    }

    public List<Member> findAll(){
        System.out.println(memberRepository.findAll());
        return memberRepository.findAll();
    }

    public Member findByUserId(String userId){
        if(!memberRepository.existsByUserId(userId)){
            throw new CustomException(ErrorCode.NONE_MEMBER);
        }
        return memberRepository.findByUserId(userId);
    }
}


// memberRepository DI 받고 jpa 를 이용하여 멤버를 저장하는 로직을 짜보자