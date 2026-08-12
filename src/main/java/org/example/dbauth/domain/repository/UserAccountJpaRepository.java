package org.example.dbauth.domain.repository;

import org.example.dbauth.domain.entity.UserAccountEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserAccountJpaRepository extends JpaRepository<UserAccountEntity, Long> {
}
