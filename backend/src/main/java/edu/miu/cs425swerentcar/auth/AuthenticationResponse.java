package edu.miu.cs425swerentcar.auth;

import lombok.*;
import org.springframework.web.bind.annotation.RequestMapping;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@RequestMapping
public class AuthenticationResponse {

    private String token;
}
