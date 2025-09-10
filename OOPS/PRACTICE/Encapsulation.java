package PRACTICE;

import java.util.Scanner;

public class Encapsulation {

    private int Account_balance;
    private int upi_pin=3348;
    public void setBalance(int balance){
        Scanner sc=new Scanner(System.in);
        System.out.print("Please enter UPI PIN: ");
        int pin=sc.nextInt();
        if(pin==upi_pin){
            Account_balance=balance;
            System.out.println("Congratulations! Your account is credited with: "+Account_balance);
        }
        else{
            System.out.println("Salary not credited");
        }
    }
}