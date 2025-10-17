package game.systems;
import game.characters.Hero;
import utils.Stylesheet;
import java.util.Scanner;


public class Navigator {
    public static void navigate(Hero player) {
        boolean nav = true;
        Scanner inputTracker = new Scanner(System.in);
        while (nav) {
            System.out.println("""
                    
                    -------------------------
                    [Main menu]
                    -------------------------
                    1: Player stats
                    2: Continue adventure
                    
                    -------------------------
                    5: Quit
                    -------------------------
                    
                    """);

            int choice = inputTracker.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("----------------------------------------");
                    System.out.println(Stylesheet.YELLOW + Stylesheet.BOLD + "These are your stats!" + Stylesheet.RESET);
                    System.out.println("----------------------------------------");
                    System.out.println(Stylesheet.YELLOW +"Name: "+player.getName()+ Stylesheet.RESET);
                    System.out.println(Stylesheet.YELLOW +"HP: "+player.getHp() + "/" + player.getMaxHp()+ Stylesheet.RESET);
                    System.out.println(Stylesheet.YELLOW +"Gold: "+player.getGold()+"g"+ Stylesheet.RESET);
                    System.out.println(Stylesheet.YELLOW +"Damage: "+player.getDmg()+ Stylesheet.RESET);
                    System.out.println(Stylesheet.YELLOW+"Weapon: " + player.getWeapon()+Stylesheet.RESET);
                    System.out.println("----------------------------------------");
                    System.out.println();
                    System.out.print(Stylesheet.BLUE+"Press ENTER to continue your adventure"+Stylesheet.RESET);
                    inputTracker.nextLine();
                    inputTracker.nextLine();
                    nav = false;
                    break;
                case 2:
                    nav = false;
                    break;
                case 5:
                    System.exit(0);
                    break;
            }
        }
    }
}