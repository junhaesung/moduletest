package com.haeseong.module.controller;

import com.haeseong.module.dto.MemberResponse;
import com.haeseong.module.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequiredArgsConstructor
public class MemberController {
    private final MemberService memberService;

    @GetMapping("/members")
    public List<MemberResponse> getMembers() {
        return memberService.getMembers().stream()
                .map(MemberResponse::from)
                .collect(Collectors.toList());
    }
}
