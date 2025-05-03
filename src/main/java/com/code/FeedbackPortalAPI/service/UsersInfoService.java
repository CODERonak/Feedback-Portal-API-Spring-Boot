package com.code.FeedbackPortalAPI.service;

import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.*;
import org.springframework.stereotype.Service;

import com.code.FeedbackPortalAPI.entity.Users;
import com.code.FeedbackPortalAPI.repository.UsersRepository;

@Service
@RequiredArgsConstructor
public class UsersInfoService implements UserDetailsService {

    private final UsersRepository usersRepository;

    @Override
    public UserDetails loadUserByUsername(String username) {
        Users user = usersRepository.findByUsername(username)
                .orElseThrow(() -> new UsernameNotFoundException("User not found"));

        return org.springframework.security.core.userdetails.User.builder()
                .username(user.getUsername())
                .password(user.getPassword())
                .roles(user.getRoles().replace("ROLE_", ""))
                .build();
    }
}