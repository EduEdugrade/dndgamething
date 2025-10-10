package game.characters;

public abstract class Character {
    protected String name;
    protected int hp;
    protected int maxHp;
    protected int dmg;

    public Character(String name, int hp, int maxHp, int dmg) {
        this.name = name;
        this.hp = hp;
        this.maxHp = maxHp;
        this.dmg = dmg;
    }

    public void takeDamage(int dmg) {
        hp = hp - dmg;
    }

    public String getName() {
        return name;
    };
    public int getHp() {
        return hp;
    };
    public int getMaxHp() {
        return maxHp;
    };
    public int getDmg() {
        return dmg;
    };

    public void setName(String inputName) {
        this.name = inputName;
    }

    public abstract void attack(Character target);
}
