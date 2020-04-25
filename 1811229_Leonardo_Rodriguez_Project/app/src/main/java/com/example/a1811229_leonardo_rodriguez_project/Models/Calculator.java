package com.example.a1811229_leonardo_rodriguez_project.Models;

import com.example.a1811229_leonardo_rodriguez_project.R;
import java.util.Random;

public class Calculator {
    public int giveMeRandomNumber() {
        Random rand = new Random();
        return rand.nextInt(9 - 0 + 1) + 0;
    }
    public char giveMeRandomOperator() {
        Random rand = new Random();
        int randomOperator = rand.nextInt(4 - 1 + 1) + 1;
        char operator = ' ';

        switch (randomOperator) {
            case 1: {
                operator = '+';
                break;
            }
            case 2: {
                operator = '-';
                break;
            }
            case 3: {
                operator = '*';
                break;
            }
            case 4: {
                operator = '/';
                break;
            }
        }
        return operator;
    }
}
