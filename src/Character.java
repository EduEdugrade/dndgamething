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

    public void attack(Character enemy) {
        enemy.takeDamage(dmg);
    }
}
