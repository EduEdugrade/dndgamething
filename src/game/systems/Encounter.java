package game.systems;
import game.characters.Hero;
import game.monsters.*;

import java.util.*;

public class Encounter {

    //MAIN CODE BLOCK//
    public static void encounter(Hero player) {
        LinkedList<Monster> monsters = new LinkedList<>();
        monsters.add(new Goblin());
        monsters.add(new Wolf());
        monsters.add(new CaveSpider());
        monsters.add(new Bear());
        monsters.add(new Skeleton());
        monsters.add(new Zombie());
        monsters.add(new Troll());
        monsters.add(new Necromancer());

        Boss boss = new Boss();
        Monster enemy;

        Random r= new Random();
        int randomNumber = r.nextInt(101);
        //70% chance
        if(randomNumber < 70) {
            int randomMonster = r.nextInt(monsters.size()-1);
            enemy = monsters.get(randomMonster);
            System.out.println("You encountered a " + enemy.getName());
            Combat.combat(player, enemy);
        } //10% chance
        else if(randomNumber < 80) {
            System.out.println("You encountered a " + boss.getName());
            Combat.combat(player, boss);
        } //20% chance
        else if(randomNumber <= 100) {
            FriendlyEncounter.friendlyEncounter(player);
            return;
        }
        return;
    }
}