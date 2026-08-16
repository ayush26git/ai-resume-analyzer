package com.ayushs.resume_analyzer.service;
import io.jsonwebtoken.Jwts;
  import io.jsonwebtoken.security.Keys;

import org.springframework.stereotype.Service;

  import javax.crypto.SecretKey;
import java.nio.charset.StandardCharsets;
   import java.util.Date;

@Service
public class JwtService {

    private final String secret =
            "my-super-secret-key-for-resume-analyzer-2026";

    private final long expirationTime = 1000 * 60 * 60;

    public String generateToken(String email) {
        SecretKey key = Keys.hmacShaKeyFor(
                secret.getBytes(StandardCharsets.UTF_8)
        );
        return Jwts.builder()
                .subject(email)
                .issuedAt(new Date())
                .expiration(new Date(System.currentTimeMillis() + expirationTime))
                .signWith(key)
                .compact();
    }
}
