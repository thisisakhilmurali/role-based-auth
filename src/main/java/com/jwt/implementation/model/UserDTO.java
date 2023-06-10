package com.jwt.implementation.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {

	private String firstName;

	private String lastName;

	private String password;

    private String email;

    private String role;
    
}

