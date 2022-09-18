package com.example.bookstore_user.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ForgotPasswordDTO {
    private String emailAddress;
    private String newPassword;
}
