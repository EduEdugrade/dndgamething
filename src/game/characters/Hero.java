package game.characters;
import game.weapons.Weapon;

import utils.Stylesheet;

public class Hero extends Character {
    public String name;
    protected int lvl = 1;
    protected int xp = 0;
        public Hero() {
            super("heroname", 100, 100, 2);
        }

    @Override
    public void attack(Character target) {
        target.takeDamage(dmg);
        System.out.println(name + " attacked " + target.name + " for " + dmg + " damage, it has " + Stylesheet.RED + target.hp + "/" + target.maxHp + Stylesheet.RESET + "hp remaining");
    }
}
