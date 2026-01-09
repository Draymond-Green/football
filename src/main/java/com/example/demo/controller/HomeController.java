package com.example.demo.controller;

import com.example.demo.domain.enums.Region;
import com.example.demo.dto.HomeResponse;
import com.example.demo.dto.MatchSummaryDto;
import com.example.demo.service.match.MatchService;
import lombok.RequiredArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequiredArgsConstructor
public class HomeController {

    private final MatchService service;

    /*@GetMapping("/")
    public String home(@Login MemberLoginDto memberDto, Model model) {
        if (memberDto == null) {
            return "home";
        }

        model.addAttribute(memberDto);
        return "loginHome";
    }*/

    @GetMapping("/")
    public String home(@RequestParam(required = false) @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate date, @RequestParam(required = false) Region region, Model model) {
        HomeResponse response = service.getMatchSummaryByDateAndRegion(date, region);

        model.addAttribute("date", response.date());
        model.addAttribute("matches", response.matches());
        model.addAttribute("dateList", response.dates());

        return "home";
    }
}
