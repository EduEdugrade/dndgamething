package game.systems;
import game.characters.Hero;
import game.monsters.Monster;

import java.util.Scanner;

import static game.systems.Navigator.navigate;


public class Combat {
    static void sleep() {
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
    public static void combat(Hero player, Monster enemy) {
        sleep();
        System.out.println("Starting Combat!");
        while (player.getHp() > 0 && enemy.getHp() > 0) {
            player.attack(enemy);
            System.out.println("------------------------------------------------------------------------");
            sleep();
            if(enemy.getHp() > 0) {
                enemy.attack(player);
                System.out.println("------------------------------------------------------------------------");
                sleep();
            }

        }
        if (player.getLvl() < 10 && player.getHp() > 0) {
            player.gainXp();
            player.lvlUp();
            player.setGold(player.getGold() + 20);
            System.out.println("you now have " + player.getGold() + "gold");
            navigate(player);
        }
    }
}