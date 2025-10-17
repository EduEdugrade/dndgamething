package game.weapons;

import utils.Stylesheet;

public class TheSwordOfDoomAndDespair extends Weapon {
    public TheSwordOfDoomAndDespair() {
        super(Stylesheet.BOLD + "3. [THE SWORD OF " + Stylesheet.RESET + Stylesheet.RED + Stylesheet.BOLD + "DOOM" + Stylesheet.RESET + Stylesheet.BOLD + " AND " + Stylesheet.RESET + Stylesheet.RED + Stylesheet.BOLD + "DESPAIR!" + Stylesheet.RESET + Stylesheet.BOLD + "]" + Stylesheet.RESET + "Price:" + Stylesheet.YELLOW + Stylesheet.BOLD + "200g" + Stylesheet.RESET, 50);
    }
}