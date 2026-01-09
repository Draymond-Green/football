package com.example.demo.dto;

import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class  LoginForm {

    @Pattern(
            regexp = "^[a-zA-Z]{4,16}$",
            message = "아이디는 영문자와 숫자로 4~16 글자입니다"
    )
    public String loginId;

    @Pattern(
            regexp = "^(?=.*[a-zA-Z])(?=.*\\d)(?=.*[!@#$%^&*])[a-zA-Z\\d!@#$%^&*]{8,20}$" ,
            message = "비밀번호는 영문자, 숫자, 특수기호(!, @, #, $, %, ^, &, *)포함 8~20글자 입니다."
    )
    public String password;
}
