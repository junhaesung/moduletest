package com.haeseong.module.dto;

import com.haeseong.module.domain.Member;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class MemberResponse {
    private Integer id;
    private String name;

    private MemberResponse(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public static MemberResponse from(Member member) {
        Integer id = member.getId();
        String name = member.getName();
        return new MemberResponse(id, name);
    }
}
