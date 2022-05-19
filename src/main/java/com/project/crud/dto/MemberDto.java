package com.project.crud.dto;

import com.project.crud.entity.Member;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MemberDto {
    private String userId;
    private String password;
    private String name;
    private Integer age;

    public Member toEntity(){
        return Member.builder()
                .userId(userId)
                .password(password)
                .name(name)
                .age(age)
                .build();
    }

}
