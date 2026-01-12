package com.example.demo.controller;

import com.example.demo.service.match.MatchService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequiredArgsConstructor
@Controller
@RequestMapping("/stadium")
public class StadiumController {

    private final MatchService matchService;

/*    @GetMapping("/{id}")
    public String*/
}
