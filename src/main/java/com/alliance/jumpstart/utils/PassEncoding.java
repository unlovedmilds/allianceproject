package com.alliance.jumpstart.utils;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.alliance.jumpstart.utils.PassEncoding;


public class PassEncoding {

    private static PassEncoding passEncoding = new PassEncoding();
    public BCryptPasswordEncoder passwordEncoder;

    public static PassEncoding getInstance() {
        if (passEncoding != null)
            return passEncoding;
        return new PassEncoding();
    }

    private PassEncoding() {
        passwordEncoder = new BCryptPasswordEncoder();
    }


}