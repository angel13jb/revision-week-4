package programweek4;

import java.util.Scanner;

public class Program_4_DigitSumChallenge {
    public static int sumDigits(int number){
        if(number>=10){
            int digit,sum=0;
            while (number>0){
                //find the last digit of the given number
                digit=number%10;
                //add last digit to the variabel sum
                sum=sum+digit;
                //removes the last digit from the number
                number=number/10;
            }
            return sum;
        }else{
            //return-1 for negative numbers and one number return -1
            return -1;
        }
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter number=:");
        int result=sumDigits(scanner.nextInt());
        System.out.println("sum of number digits is:"+result);
        //closing the scanner object
        scanner.close();
    }
}
