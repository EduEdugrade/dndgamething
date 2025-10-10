package game.monsters;
import utils.Stylesheet;
import game.characters.Character;
import java.util.Random;

public class Boss extends Monster {
    public Boss() {
        super("Boss enemy", 50, 50, 2);
    }
    Random r= new Random();

    @Override public void attack(Character target) {

        if(r.nextInt(101) >= 70) {
            System.out.println(name + "  critically attacked!!! " + target.getName() + " for " + dmg*2 + " damage, you have " + Stylesheet.RED + target.getHp() + "/" + target.getMaxHp() + Stylesheet.RESET + "hp remaining");
            target.takeDamage(dmg*2);
        } else {
            System.out.println(name + " attacked " + target.getName() + " for " + dmg + " damage, you have " + Stylesheet.RED + target.getHp() + "/" + target.getMaxHp() + Stylesheet.RESET + "hp remaining");
            target.takeDamage(dmg);
        }
    }
}
