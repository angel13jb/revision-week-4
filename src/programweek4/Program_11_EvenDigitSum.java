package programweek4;

import java.util.Scanner;

public class Program_11_EvenDigitSum {
    public static int getEvenDigitSum(int number){
        if(number<0){
            return-1;
        }
        int lastDigit=0;
        int evenDigitsum=0;
        while(number!=0){
            lastDigit=number%10;
            if(lastDigit%2==0){
                evenDigitsum+=lastDigit;
            }
            number=number/10;
        }
        return evenDigitsum;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter any number:");
        int a=scanner.nextInt();
        int result=getEvenDigitSum(a);
        System.out.println("The sum of even digits is:"+result);
        scanner.close();
    }
}
