package game.characters;
import game.weapons.RustySword;
import game.weapons.Weapon;

import utils.Stylesheet;

public class Hero extends Character {
    protected String name;
    protected int lvl = 1;
    protected int xp = 0;
    protected Weapon weapon;

    public Hero() {
        super("heroname", 100, 100, 2);
        this.weapon = new RustySword();
    }

    @Override
    public void attack(Character target) {
        target.takeDamage(dmg + weapon.getDmg());
        System.out.println(getName() + " attacked " + target.name + " for " + (dmg+weapon.getDmg()) + " damage, it has " + Stylesheet.RED + target.hp + "/" + target.maxHp + Stylesheet.RESET + "hp remaining");
    }

    public void gainXp() {
        xp = xp + 101;
    }

    public void lvlUp() {
        int oldLvl = lvl;
        int oldDmg = dmg;
        int oldHp = maxHp;
        System.out.println(Stylesheet.GREEN + getName() + " wins!" + Stylesheet.RESET);
        if (xp > 100) {
            lvl = lvl + 1;
            dmg = dmg + 1;
            maxHp = maxHp + 5;
            hp = maxHp;
            System.out.println();
            System.out.println(Stylesheet.YELLOW + Stylesheet.BOLD + "You leveled up! You feel stronger!" + Stylesheet.RESET);
            System.out.println(Stylesheet.YELLOW + "Oh, and you're healed :)" + Stylesheet.RESET);
            System.out.println("----------------------------------------");
            System.out.println(Stylesheet.YELLOW + "Lvl " + oldLvl + " → " + lvl + Stylesheet.RESET);
            System.out.println(Stylesheet.YELLOW + oldDmg + " dmg → " + dmg + " dmg" + Stylesheet.RESET);
            System.out.println(Stylesheet.YELLOW + oldHp + " hp → " + maxHp + " hp" + Stylesheet.RESET);
            System.out.println("----------------------------------------");
            System.out.println();
        }
    }
}