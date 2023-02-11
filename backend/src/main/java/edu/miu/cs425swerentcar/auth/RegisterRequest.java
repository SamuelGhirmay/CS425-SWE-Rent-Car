package edu.miu.cs425swerentcar.auth;

import lombok.*;
import org.springframework.web.bind.annotation.RequestMapping;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@RequestMapping
public class RegisterRequest {
    private String userName;
    private String email;
    private String password;
}
