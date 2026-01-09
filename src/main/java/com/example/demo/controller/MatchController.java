package com.example.demo.controller;

import com.example.demo.dto.MatchTotalDto;
import com.example.demo.service.match.MatchService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/match")
public class MatchController {

    private final MatchService service;

    @GetMapping("/{matchId}")
    public String getMatchTotal(@PathVariable Long matchId, Model model) {
        MatchTotalDto match = service.getMatchTotal(matchId);
        model.addAttribute("match", match);
        return "match";
    }


    @GetMapping("/{stadiumId}/matches")
}
