package game.monsters;
import game.characters.Character;
import utils.Stylesheet;

public class Skeleton extends Monster {
    public Skeleton() {
        super("Skeleton", 20, 20, 1);
    }
    public void attack(Character target) {
        target.takeDamage(dmg);
        System.out.println(name + " attacked " + target.getName() + " for " + dmg + " damage, you have " + Stylesheet.RED + target.getHp() + "/" + target.getMaxHp() + Stylesheet.RESET + "hp remaining");
    }
}