import utils.Stylesheet;

public class Goblin extends Monster {
    public Goblin() {
        super("Goblin", 10, 10, 1);
    }

    @Override
    public void attack(Character enemy) {
        enemy.takeDamage(dmg);
        System.out.println(name + " attacked " + enemy.name + " for " + dmg + " damage, you have " + Stylesheet.RED + enemy.hp + "/" + enemy.maxHp + Stylesheet.RESET + "hp remaining");
    }
}
