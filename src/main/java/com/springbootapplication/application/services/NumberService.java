package com.springbootapplication.application.services;

import org.springframework.stereotype.Service;

@Service
public class NumberService {

    public boolean validNumber(String number) {
        try {
            System.out.println("number is " + number);
            double num = Double.parseDouble(number);
            return true;
        } catch(NumberFormatException numberFormatException) {
            System.out.println("not valid number");
            return false;
        }
    }
}
