package com.example.test;
import org.passay.PasswordGenerator;


public class CorrectFixedPasswordGenerator implements PasswordGeneratePolicy {

    @Override
    public String generatePassword() {
        return "abcdefgh";
    }

}
