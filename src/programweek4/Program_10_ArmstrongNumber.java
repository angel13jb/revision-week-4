package programweek4;

import java.util.Scanner;

public class Program_10_ArmstrongNumber {
    public static void isArmStrongNumber(int num){
        int number,temp,total=0;
        number=num;
        while (num!=0){
            temp=num%10;
            total=total+temp*temp*temp;
            num/=10;
        }
        if(total==number){
            System.out.println(number+"is an Armstrong number");
        }else{
            System.out.println(number+"is not an Armstrong number");
        }
    }

    public static void main(String[] args) {
        //scanner declaration
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter any number:");
        int a= scanner.nextInt();
        isArmStrongNumber(a);
        scanner.close();
    }
}
