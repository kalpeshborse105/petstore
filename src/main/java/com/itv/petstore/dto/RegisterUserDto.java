package com.itv.petstore.dto;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
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
    @com.itv.petstore.validators.mobile
    private String mobile;
    @Min (value=10000,message="minimum salary should be 10000")
    @Max (value=10000,message="minimum salary should be 10000")
    private long salary;

}