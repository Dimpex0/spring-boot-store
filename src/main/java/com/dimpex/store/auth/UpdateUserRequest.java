package com.dimpex.store.auth;

import lombok.Data;

@Data
public class UpdateUserRequest {
    private String name;
    private String email;
}
