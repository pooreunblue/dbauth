package org.example.dbauth.service;

import lombok.RequiredArgsConstructor;
import org.example.dbauth.domain.repository.UserAccountJpaRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class UserAccountService {
    private final UserAccountJpaRepository userAccountJpaRepository;
}