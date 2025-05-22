package org.budgetmanager.helloevents.Config;


import io.jsonwebtoken.Claims;
import org.springframework.stereotype.Service;

@Service
public class JwtService {

    public String extractUsername(String token) {
        return null;
    }

    private Claims extractClaims(String token) {
        return null;
    }
}
