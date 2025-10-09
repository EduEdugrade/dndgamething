import java.util.Random;

public class Boss extends Monster {
    public Boss(String name, int hp, int maxHp, int dmg) {
        super(name, hp, maxHp, dmg);
    }
    Random rand= new Random();

    @Override public void attack(Character enemy) {

        if(rand.nextInt(101) >= 70) {
            enemy.takeDamage(dmg*2);
        } else {
            enemy.takeDamage(dmg);
        }
    }
}
