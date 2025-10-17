package game.monsters;
import utils.Stylesheet;
import game.characters.Character;
import java.util.Random;

public class Boss extends Monster {
    public Boss() {
        super(Stylesheet.RED+Stylesheet.BOLD+"FIVE HUNDRED FIFTY FOUR KOBOLDS!!!"+Stylesheet.RESET, 55, 55, 4);
    }


    @Override public void attack(Character target) {
        Random r= new Random();

        if(r.nextInt(101) >= 70) {
            target.takeDamage(dmg*2);
            System.out.println(name + "  critically attacked!!! " + target.getName() + " for " + dmg*2 + " damage, you have " + Stylesheet.RED + target.getHp() + "/" + target.getMaxHp() + Stylesheet.RESET + "hp remaining");
        } else {
            target.takeDamage(dmg);
            System.out.println(name + " attacked " + target.getName() + " for " + dmg + " damage, you have " + Stylesheet.RED + target.getHp() + "/" + target.getMaxHp() + Stylesheet.RESET + "hp remaining");
        }
    }
}
