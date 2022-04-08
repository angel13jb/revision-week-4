package programweek4;

import java.util.Scanner;

public class Progem_8_SymbolTriagle {
    public static void symbolTriangel(int n){
        for(int i=0;i<=n;i++){
            for(int j=0;j<i;j++){
                System.out.print("@");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Input number of rows:");
        symbolTriangel(scanner.nextInt());
        scanner.close();
    }
}
