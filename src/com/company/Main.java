package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number = (int)(Math.random()*100);
        System.out.println(number);
        int ans = number + 1;
        int shoot_counter=1;
        char option;
        Scanner scan = new Scanner(System.in);
        while(ans!=number)
        {
            System.out.println("Zgadnij liczbe 0-100: ");
            ans = scan.nextInt();
            if(ans>number){
                System.out.println("Za duzo. ");
            }
            else if(ans<number) {
                System.out.println("Za malo. ");
            }
            else if(ans == number) {
                System.out.println("Trafiles, Liczba prob:" + shoot_counter + "! chcesz grac jeszcze raz?(Y/N)");
                option = scan.next().charAt(0);
                if(option=='y'){
                    shoot_counter = 1;
                    number = (int)(Math.random()*100);
                    ans = number+1;
                    continue;
                }
                else
                    break;
            }
            shoot_counter = shoot_counter + 1;
        }
    }
}
