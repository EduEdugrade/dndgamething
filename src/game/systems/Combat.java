package game.systems;
import game.characters.Character;
import game.characters.Hero;
import game.monsters.Monster;
import game.weapons.Weapon;

public class Combat {

    public static void combat(Hero player, Monster enemy) {
        while (player.getHp() > 0 && enemy.getHp() > 0) {
            player.attack(enemy);
            if(enemy.getHp() > 0) {
                enemy.attack(player);
            }
        }
    }
}