package org.example;
public class App 
{
    public static void main( String[] args )
    {
        int price;
        int moneyRec;
        int change = 0;

        price = Integer.valueOf(args[0]);
        moneyRec = Integer.valueOf(args[1]);

        if(price <= moneyRec){
            change = moneyRec - price;
            MoneyChange.calculateChange(change);
        }
    }
}
