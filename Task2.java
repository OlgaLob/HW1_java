package HW1;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args){
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите год: ");
        int year = iScanner.nextInt();

        System.out.println(checkYear(year));
        iScanner.close();
    }
    static boolean checkYear(int year){
        if (year%400!=0 & year%100==0 ^ year % 4!=0){
            return false;
        }  else {
            return true;
        }
    }
}
