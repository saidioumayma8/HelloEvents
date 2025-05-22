package org.budgetmanager.helloevents.Config;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import org.antlr.v4.runtime.misc.NotNull;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;


@Component
@RequiredArgsConstructor
public class JwtAuthentificationFilter extends OncePerRequestFilter {

    private final JwtService jwtService;
    @Override
    protected void doFilterInternal(
            @NotNull HttpServletRequest request,
            @NotNull HttpServletResponse response,
            @NotNull FilterChain filterChain


            ) throws ServletException, IOException {

        final String authoheader = request.getHeader("Authorization");
        final String jwt;
        final String userEmail;
        if (authoheader == null || !authoheader.startsWith("Bearer ")) {
            filterChain.doFilter(request, response);
            jwt = authoheader.substring(7)
            return jwtService.extractUsername(jwt);
        }

    }
}
