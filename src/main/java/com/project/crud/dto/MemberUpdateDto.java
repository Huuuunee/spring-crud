package com.project.crud.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class MemberUpdateDto {

    private String name;
    private String password;
    private String userId;
    private Integer age;

}
