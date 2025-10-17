package game;
import game.characters.Hero;
import game.systems.Encounter;

import java.util.*;

public class Main {
        //MAIN CODE BLOCK//
        public static void main(String[] args) {
            Hero player = new Hero();
            boolean gameRunning = true;
            Scanner inputTracker = new Scanner(System.in);
            System.out.println("What is your name? ");
            String name = inputTracker.nextLine();
            player.setName(name);

            while (gameRunning) {
                if(player.getLvl() >= 10) {
                    System.out.println("You win the game!");
                    gameRunning = false;
                }

                else if(player.getHp() < 1) {
                    System.out.println("You lose the game!");
                    gameRunning = false;
                } else {
                    Encounter.encounter(player);
                }


            }
        }
}