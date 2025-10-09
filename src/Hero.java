import utils.Stylesheet;

public class Hero extends Character {
        public Hero() {
            super("Hero", 10, 10, 2);
        }

    @Override
    public void attack(Character enemy) {
        enemy.takeDamage(dmg);
        System.out.println(name + " attacked " + enemy.name + " for " + dmg + " damage, it has " + Stylesheet.RED + enemy.hp + "/" + enemy.maxHp + Stylesheet.RESET + "hp remaining");
    }
}
