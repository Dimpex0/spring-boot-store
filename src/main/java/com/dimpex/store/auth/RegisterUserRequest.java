package com.dimpex.store.auth;

import com.dimpex.store.users.Lowercase;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class RegisterUserRequest {
    @NotBlank(message = "Name is required")
    @Size(max = 255, message = "Name must be less than 255  characters")
    private String name;

    @NotBlank
    @Email
    @Lowercase(message = "email must be lowercase")
    private String email;

    @NotBlank
    @Size(min = 6)
    private String password;
}
