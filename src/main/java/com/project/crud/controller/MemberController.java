package com.project.crud.controller;

import com.project.crud.dto.MemberDto;
import com.project.crud.entity.Member;
import com.project.crud.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class MemberController {

    private final MemberService memberService;

    @PostMapping("/signup")
    public void signup(@RequestBody MemberDto member){
        memberService.signup(member);
    }

    @GetMapping()
    public List<Member> findAll(){
        return memberService.findAll();
    }
}
