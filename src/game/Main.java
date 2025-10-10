package game;
import game.characters.Hero;
import game.systems.Encounter;

import java.util.*;

public class Main {
        //MAIN CODE BLOCK//
        public static void main(String[] args) {
            Hero player = new Hero();

            Scanner inputTracker = new Scanner(System.in);
            System.out.println("What is your name? ");
            String name = inputTracker.nextLine();

            player.name = name;
            player.setName(name);

            System.out.println(player.name);
            Encounter.encounter(player);
        }
}