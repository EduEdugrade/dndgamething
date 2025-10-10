package game.monsters;
import game.characters.Character;

public abstract class Monster extends Character {
    public Monster(String name, int hp, int maxHp, int dmg) {
        super(name, hp, maxHp, dmg);
    }
}
