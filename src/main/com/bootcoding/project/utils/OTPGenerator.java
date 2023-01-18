package com.bootcoding.project.utils;

import java.util.Random;

public class OTPGenerator {
    //999999
    //100000
 static    Random random= new Random();
 static final int Max=999999;
 static final int MIN=100000;

    public static int getOTP(){
        return MIN+random.nextInt(Max-MIN);
        //int otp=random.nextInt();;
     //   return otp;

    }

    public static void main(String[] args) {
        int otp=OTPGenerator.getOTP();
        System.out.println(otp);
    }
}
