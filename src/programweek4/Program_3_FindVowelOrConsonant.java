package programweek4;

import java.util.Scanner;

public class Program_3_FindVowelOrConsonant {
    public static void checkVowelOrConsonant(String letter){
        //checks length of String
        //if user enters more than 1 character an erroe message is printed
        if(letter.length()>1){
            System.out.println("Error-Not a single Character");
            //if user enters a symbol
        }else if(!(isItALetter(letter))){
            System.out.println("Error Not a letter.Enter uppercase or lowercase letter");

        }else if (letter.equals("a")||letter.equals("e")||letter.equals("i")||letter.equals("o")||letter.equals("u")){
            System.out.println("input letter is a vowel");
        }else{
            System.out.println("input letter is a consonant");
        }
    }
    public static boolean isItALetter(String I){
        return I.charAt(0)>96 && I.charAt(0)<123;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter any character :");
        String str=scanner.next().toLowerCase();
        checkVowelOrConsonant(str);
        scanner.close();
    }

}
