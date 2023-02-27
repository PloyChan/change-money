package org.example;

import java.util.ArrayList;
import java.util.List;

public class MoneyChange {
    public static void calculateChange(int change) {
        int fiveHundred = 0, hundred = 0, fiveTens = 0, twenty = 0, ten = 0, one = 0;
        System.out.println("Change: " + change);

        while (change > 0) {
            if (change % 500 == 0) {
                change = change - 500;
                fiveHundred++;
            }
            else if (change % 100 == 0) {
                change = change - 100;
                hundred++;
            } else if (change % 50 == 0) {
                change = change - 50;
                fiveTens++;
            } else if (change % 20 == 0) {
                change = change - 20;
                twenty++;
            } else if (change % 10 == 0) {
                change = change - 10;
                ten++;
            } else if (change % 1 == 0) {
                change = change - 1;
                one++;
            }
        }
        if(fiveHundred > 0){
            System.out.println("500x" + fiveHundred);
        }
        if(hundred > 0){
            System.out.println("100x" + hundred);
        }
        if(fiveTens> 0){
            System.out.println("50x" + fiveTens);
        }
        if(twenty > 0){
            System.out.println("20x" + twenty);
        }
        if(ten > 0){
            System.out.println("10x" + ten);
        }
        if(one > 0){
            System.out.println("1x" + one);
        }
    }
}
