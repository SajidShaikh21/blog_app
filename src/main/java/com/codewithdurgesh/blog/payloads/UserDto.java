package com.codewithdurgesh.blog.payloads;

import jakarta.validation.constraints.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class UserDto {

    private int id;

    @NotEmpty
    @Size(min=4,message="Username must be min of 4 character")
    private String name;

    @Email(message = "Email address is not valid !!")
    private String email;

    @NotNull
    @Size(min = 3,max = 10,message = "Password must be of 3 chars and max of 10 chars !!")
    private String password;

    @NotEmpty
    private String about;



}
