package game.monsters;
import game.characters.Character;
import utils.Stylesheet;

public abstract class Monster extends Character {
    public Monster(String name, int hp, int maxHp, int dmg) {
        super(name, hp, maxHp, dmg);
    }
    public abstract void attack(Character target);
}
