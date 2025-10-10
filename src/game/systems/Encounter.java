package game.systems;
import game.characters.Hero;
import game.monsters.Goblin;
import game.monsters.Boss;

import java.util.*;

public class Encounter {

    //MAIN CODE BLOCK//
    public static void encounter(Hero player) {
        Goblin enemy = new Goblin();
        Boss boss = new Boss();

        Random r= new Random();
        int randomNumber = r.nextInt(101);
        if(randomNumber < 70) {
            System.out.println("Regular fight!");
            Combat.combat(player, enemy);
            //70% chance
        } else if(randomNumber < 80) {
            System.out.println("Boss fight!");
            Combat.combat(player, boss); //10% chance
        } else if(randomNumber < 100) {
            System.out.println("Friendly Encounter!");
            //Friendly encounter 20% chance
        }

    }
}