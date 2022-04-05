package com.company;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ThirdLevel {

    public static void run(){
        Scanner scanner = new Scanner(System.in);

        int[] userPredictions = new int[3];
        int[] userDice = new int[3];
        int[] userResults = new int[3];
        int[] computerPredictions = new int[3];
        int[] computerDice = new int[3];
        int[] computerResults = new int[3];
            System.out.println("---      Start game      ---");

        for (int i = 0; i < 3; i++) {

            System.out.println("Predict amount of points (2..12)");
            int userPrediction = scanner.nextInt();
            userPredictions[i] = userPrediction;
            System.out.println("User rolls the dices ...");
            int firstNumber = Dice.rollTheDice();
            int secondNumber = Dice.rollTheDice();
            int sum = firstNumber + secondNumber;
            userDice[i]=sum;
            Dice.printDice(firstNumber);
            Dice.printDice(secondNumber);
            System.out.println("On the dice fell " + sum + " points");
            int userResult = (sum) - Math.abs(sum - userPrediction) * 2;
            userResults[i]=userResult;
            System.out.println("Result is " + sum + "-abs(" + sum + "-" + userPrediction + ")*2 = " + userResult);
            Random random = new Random();
            int computerPrediction = random.nextInt(12 - 2) + 2;
            computerPredictions[i]=computerPrediction;
            System.out.println();
            System.out.println("Computer predicted " + computerPrediction);
            System.out.println("Computer rolls the dices ...");
            int firstNumberComputer = Dice.rollTheDice();
            int secondNumberComputer = Dice.rollTheDice();
            int sumComputer = firstNumberComputer + secondNumberComputer;
            computerDice[i]=sumComputer;
            Dice.printDice(firstNumberComputer);
            Dice.printDice(secondNumberComputer);
            System.out.println("On the dice fell " + sumComputer + " points");
            int computerResult = (sumComputer) - Math.abs(sumComputer - computerPrediction) * 2;
            computerResults[i]=computerResult;
            System.out.println("Result is " + sumComputer + "-abs(" + sumComputer + "-" + computerPrediction + ")*2 = " + computerResult);
            System.out.println("-------------- Current score -------------");
            System.out.println("User:"+userResult);
            System.out.println("Computer:"+computerResult);
            if (userResult > computerResult) {
                System.out.println("User is ahead by " + (userResult - computerResult) + " points!");
            } else if (computerResult > userResult) {
                System.out.println("Computer is ahead by " + (computerResult - userResult) + " points");
            } else {
                System.out.println("Points are equal!");
            }

        }


        System.out.println();
        System.out.println("------- Finish Game -------");
        System.out.println();
        System.out.println(" ROUND |           User |      Computer ");
        int counter = 0;
        for(int k = 0; k < 3; k++) {
            System.out.println("-------+----------------+----------------");
            System.out.println("       | Predicted:  " + userPredictions[counter] + "  | Predicted:  " + computerPredictions[counter]);
            System.out.println(" - " + (k+1) + " - | Dice:       " + userDice[counter] + "  | Dice:       " + computerDice[counter]);
            System.out.println("       | Result:     " + userResults[counter] + "  | Dice:       " + computerResults[counter]);
            counter++;
        }

        System.out.println("-------+----------------+----------------");

        int userTotal = Arrays.stream(userResults).sum();
        int computerTotal = Arrays.stream(computerResults).sum();
        System.out.println("Total points user:"+ userTotal+" Total points computer:"+computerTotal);

        if (userTotal > computerTotal) {
            System.out.println("User win " + (userTotal - computerTotal) + " more. Congratulations!");
        } else if (computerTotal > userTotal) {
            System.out.println("Computer win " + (computerTotal - userTotal) + " more.");
        } else {
            System.out.println("Game is tie!");
        }


    }

}
