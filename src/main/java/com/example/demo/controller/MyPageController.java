package com.example.demo.controller;

import com.example.demo.dto.MyMatchDto;
import com.example.demo.login.Login;
import lombok.RequiredArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;
import java.time.YearMonth;
import java.util.List;

@Controller
@RequestMapping("/myPage")
@RequiredArgsConstructor
public class MyPageController {
/*
    private final MatchService222 service;

    @GetMapping("/myMatch")
    public String myMatch(
            @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate date,
            @RequestParam @DateTimeFormat(pattern = "yyyy-MM") YearMonth month,
            @Login Long memberId,
            Model model
    ) {
        if (date != null) {
            List<MyMatchDto> matches = service.getMyMatchByMemberIdAndDate(memberId, date);
            model.addAttribute("matches", matches);
        } else {
            YearMonth now = YearMonth.now();
            if (month == null || month.isAfter(now.plusMonths(1))) {
                month= now;
            }
            List<MyMatchDto> matches = service.getMyMatchByMemberIdAndDate(memberId, month.atDay(1), month.atEndOfMonth());
            model.addAttribute("matches", matches);
        }

        return "myPage/myMatch";
    }*/
}
