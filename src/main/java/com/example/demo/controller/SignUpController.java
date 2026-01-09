/*
package com.example.demo.controller;

import com.example.demo.dto.SignUpForm;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class SignUpController {

    private final SignUpService service;

    @GetMapping("/signUp")
    public String signUp(Model model) {
        model.addAttribute("form", new SignUpForm());
        return "signUpForm";
    }

    @PostMapping("/signUp")
    public String signUp(@Validated @ModelAttribute SignUpForm form, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "signUp/signUpForm";
        }

        service.signUp(form);
        return "redirect:/";
    }
}
*/
