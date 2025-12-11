package com.main.services;

public class authLogin {
    public static String validateLogin(String email, String password) {
        // Validasi Input Kosong
        if (email.isEmpty() && password.isEmpty()) {
            return "EMAIL_PASSWORD_EMPTY";
        } else if (email.isEmpty()) {
            return "EMAIL_EMPTY";
        } else if (password.isEmpty()) {
            return "PASSWORD_EMPTY";
        }

        // Email & password admin yang ditentukan
        String adminEmail = "admin@gmail.com";
        String adminPassword = "admin123";

        // Pengecekan kredensial
        if (!email.equals(adminEmail) || !password.equals(adminPassword)) {
            return "INVALID_CREDENTIALS";
        }

        // Jika login sukses
        return "SUCCESS";
    }
}
