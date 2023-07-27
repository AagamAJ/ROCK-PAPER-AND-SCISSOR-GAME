//Rock-Paper-Scissor Game Using Java

package com.company;

import java.lang.Math;
import java.util.Scanner;

public class Project_02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number of your choice with the Reference:\n Enter 1 for Rock \n Enter 2 for Paper \n Enter 3 for Scissor");

        int n = 0;
        int loss = 0;
        int win = 0;
        do {
            int a = sc.nextInt();
            switch (a) {
                case 1 -> System.out.println("Your choice is Rock");
                case 2 -> System.out.println("Your choice is Paper");
                case 3 -> System.out.println("Your choice is Scissor");
            }
            int pc = (int) (Math.random() * (3 - 1 + 1) + 1);
//            System.out.println(pc);
            switch (pc) {
                case 1 -> System.out.println("PC has chosen Rock");
                case 2 -> System.out.println("PC has chosen Paper");
                case 3 -> System.out.println("PC has chosen Scissor");
            }

            if (pc == a) {
                System.out.println("No Result");
            } else if ((pc == 1 && a == 3) || (pc == 2 && a == 1) || (pc == 3 && a == 2)) {
                System.out.println("PC Wins!");
                loss++;
            } else {
                System.out.println("You Win!");
                win++;
            }
            n++;

            if (n!=5) {
                System.out.println("Lets Play Again");
            }
        }
        while (n != 5);
        System.out.println("OOPS! No more Chances Left");

        System.out.println("\n\nFinal Result:");

        if (win == loss) {
            System.out.println("The Series is Drawn");
        }
        else if (win>loss) {
            System.out.println("YOU WON the Series");
        }
        else {
            System.out.println("PC WON the Series");
        }
    }
}
