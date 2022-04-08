package programweek4;

import java.util.Scanner;

public class Program_2_MinAndMaxNumbers {
    public static void findMinAndMaxNumbers(){
        //scanner declaration for reading input from console
        Scanner scanner=new Scanner(System.in);
        int min=0;
        int max=0;
        boolean first=true;
        //while loop
        while (true){
            System.out.println("Enter number:");
            boolean isAnInt=scanner.hasNextInt();
            if(isAnInt){
                int number= scanner.nextInt();
                if(first){
                    min=number;
                    max=number;
                }
                if(number>max){
                    max=number;
                }
                if(number<min){
                    min=number;
                }
            }else{
                break;
            }
            scanner.nextLine();//handel input
        }
        System.out.println("Min="+min+",Max="+max);
        scanner.close();
    }

    public static void main(String[] args) {
        findMinAndMaxNumbers();
    }
}
