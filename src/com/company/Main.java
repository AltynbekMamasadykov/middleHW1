package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //------------------------------ Level 1 ---------------------------
//        System.out.println("---      Start game      ---");
//        System.out.println("Predict amount of points (2..12)");
//        Scanner scanner = new Scanner(System.in);
//        int userPrediction = scanner.nextInt();
//        System.out.println("User rolls the dices ...");
//        int firstNumber = Dice.rollTheDice();
//        int secondNumber = Dice.rollTheDice();
//        int sum = firstNumber+secondNumber;
//        Dice.printDice(firstNumber);
//        Dice.printDice(secondNumber);
//        System.out.println("On the dice fell "+sum+" points");
//        int result = (sum)-Math.abs(sum-userPrediction)*2;
//        System.out.println("Result is "+sum+"-abs("+sum+"-"+userPrediction+")*2 = "+result);
//        if(result>0){
//            System.out.println("User wins!");
//        }else{
//            System.out.println("User loses!");
//        }

        //----------------------------------- Level 2 ---------------------------------


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
        int userResult = (sum)-Math.abs(sum-userPrediction)*2;
        System.out.println("Result is "+sum+"-abs("+sum+"-"+userPrediction+")*2 = "+userResult);
        Random random = new Random();
        int computerPrediction = random.nextInt(12-2)+2;
        System.out.println();
        System.out.println("Computer predicted "+computerPrediction);
        System.out.println("Computer rolls the dices ...");
        int firstNumberComputer = Dice.rollTheDice();
        int secondNumberComputer = Dice.rollTheDice();
        int sumComputer = firstNumberComputer+secondNumberComputer;
        Dice.printDice(firstNumberComputer);
        Dice.printDice(secondNumberComputer);
        System.out.println("On the dice fell "+sumComputer+" points");
        int computerResult = (sumComputer)-Math.abs(sumComputer-computerPrediction)*2;
        System.out.println("Result is "+sumComputer+"-abs("+sumComputer+"-"+computerPrediction+")*2 = "+computerResult);
        if(userResult>computerResult){
            System.out.println("User win "+(userResult-computerResult)+" more.\nCongratulations!");
        }else if(computerResult>userResult){
            System.out.println("Computer win "+(computerResult-userResult)+" more.");
        }else{
            System.out.println("Game is tie!");
        }






    }


}
