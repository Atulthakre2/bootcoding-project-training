package com.bootcoding.project.utils;

import java.util.Random;

public class OTPGenerator {

    final static int MAX = 999999;
    final static int MIN = 100000;
    static Random random = new Random();

    public static int getRandomOTP() {
        int number = random.nextInt(MAX - MIN);
        int otp = MIN + number;

        return otp;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            OTPGenerator.getRandomOTP();
        }
    }

}
