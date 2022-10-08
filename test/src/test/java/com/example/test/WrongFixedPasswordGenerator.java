package com.example.test;

public class WrongFixedPasswordGenerator implements PasswordGeneratePolicy{

    @Override
    public String generatePassword() {
        return "aabb";
    }

}
