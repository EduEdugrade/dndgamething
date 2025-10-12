package game.weapons;

public class Weapon {
    protected String name;
    protected int dmg;

    public Weapon(String name, int dmg) {
        this.name = name;
        this.dmg = dmg;
    }

    public int getDmg() {
        return this.dmg;
    }

    public String getName() {
        return this.name;
    }
}
