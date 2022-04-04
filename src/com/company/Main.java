package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //------------------------------ Level 1 ---------------------------
        System.out.println("---      Start game      ---");
        System.out.println("Predict amount of points (2..12)");
        Scanner scanner = new Scanner(System.in);
        int userPrediction = scanner.nextInt();
        System.out.println("User rolls the dices ...");
        int firstNumber = Dice.rollTheDice();
        int secondNumber = Dice.rollTheDice();
        int sum = firstNumber+secondNumber;
        Dice.printDice(firstNumber);
        Dice.printDice(secondNumber);
        System.out.println("On the dice fell "+sum+" points");
        int result = (sum)-Math.abs(sum-userPrediction)*2;
        System.out.println("Result is "+sum+"-abs("+sum+"-"+userPrediction+")*2 = "+result);
        if(result>0){
            System.out.println("User wins!");
        }else{
            System.out.println("User loses!");
        }






    }


}
