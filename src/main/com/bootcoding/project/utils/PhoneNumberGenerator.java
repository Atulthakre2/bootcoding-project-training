package com.bootcoding.project.utils;

import java.util.Random;

public class PhoneNumberGenerator {
    static Random random= new Random();
    static final long Max=9999999999l;
    static final long MIN=9800000000l;

    public static long getPhone(){
        return MIN+random.nextLong(Max-MIN);
        //int otp=random.nextInt();;
        //   return otp;

    }

    public static void main(String[] args) {
        long PhoneNumber=PhoneNumberGenerator.getPhone();
        System.out.println(PhoneNumber);
    }
}

