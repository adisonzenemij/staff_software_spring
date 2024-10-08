package com.apps.staff_software_spring.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.apps.staff_software_spring.service.auth.JwtDto;
import com.apps.staff_software_spring.service.auth.LoginDto;
import com.apps.staff_software_spring.util.JwtUtil;

@RestController
@RequestMapping(value = "/api/auth")
public class AuthController {
    private final AuthenticationManager authenticationManager;
    private final JwtUtil jwtUtil;

    @Autowired
    public AuthController(
        AuthenticationManager authenticationManager,
        JwtUtil jwtUtil
    ) {
        this.authenticationManager = authenticationManager;
        this.jwtUtil = jwtUtil;
    }

    @PostMapping(value = "/header")
    public ResponseEntity<Void> login(@RequestBody LoginDto loginDto) {
        UsernamePasswordAuthenticationToken login = new UsernamePasswordAuthenticationToken(
            loginDto.getCdLogin(), loginDto.getCdPassword()
        );

        Authentication authentication = this.authenticationManager.authenticate(login);

        System.out.println(authentication.isAuthenticated());
        System.out.println(authentication.getPrincipal());

        String jwt = this.jwtUtil.create(loginDto.getCdLogin());

        return ResponseEntity.ok().header(HttpHeaders.AUTHORIZATION, jwt).build();
    }

    @PostMapping(value = "/json")
    public ResponseEntity<JwtDto> jwt(@RequestBody LoginDto loginDto) {
        UsernamePasswordAuthenticationToken login = new UsernamePasswordAuthenticationToken(
            loginDto.getCdLogin(), loginDto.getCdPassword()
        );

        Authentication authentication = this.authenticationManager.authenticate(login);
        System.out.println("authentication: " + authentication);

        if (!authentication.isAuthenticated()) {
            return ResponseEntity.status(401).build();
        }

        String jwt = this.jwtUtil.create(loginDto.getCdLogin());

        JwtDto jwtResponse = new JwtDto(jwt);

        return ResponseEntity.ok(jwtResponse);
    }
}
