package org.example.dbauth.domain.enums;

public enum UserAccountRole {
    USER, ADMIN;

    public String key() {
        return "ROLE_%s".formatted(name());
    }
}