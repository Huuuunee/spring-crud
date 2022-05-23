package com.project.crud.entity;

import com.project.crud.dto.MemberUpdateDto;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String userId;
    private String password;
    private String name;
    private Integer age;

    public void update(MemberUpdateDto memberUpdateDto){
        this.userId = memberUpdateDto.getUserId();
        this.name = memberUpdateDto.getName();
        this.password = memberUpdateDto.getPassword();
        this.age = memberUpdateDto.getAge();
    }
}
