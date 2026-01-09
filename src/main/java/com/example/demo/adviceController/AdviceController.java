package com.example.demo.adviceController;

import com.example.demo.ex.NoMatchException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class AdviceController {

    @ExceptionHandler(NoMatchException.class)
    public String noMatchHandle(NoMatchException e) {
        return "redirect:/";
    }
}
