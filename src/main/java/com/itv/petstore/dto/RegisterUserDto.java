package com.itv.petstore.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class RegisterUserDto {
    private Integer id;
    @Size(min=4,max=10, message="first name length should have min 4 and max 10")
    @NotNull @NotEmpty
    private String firstname;

    @NotNull @NotEmpty
    private String lastname;

    @NotNull @NotEmpty
    private String email;

    @NotNull @NotEmpty
    private String password;

    @NotNull @NotEmpty
    private String confirmpassword;

    @NotNull @NotEmpty
    private String mobile;
}