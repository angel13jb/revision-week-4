package programweek4;

import java.util.Scanner;

public class Program_6_NumberTriangel {
    public static void numTriangle(int n){
        for(int i=0;i<=n;i++){
            for(int j=0;j<i;j++){
                System.out.print(j+1);
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        //scanner declaration for readig input from console
        Scanner scanner=new Scanner(System.in);
        System.out.println("input number of rows:");
        //calls static method
        numTriangle(scanner.nextInt());
        //closing the scanner object
        scanner.close();
    }
}
