package game.systems;
import game.characters.Character;
import game.characters.Hero;
import utils.Stylesheet;
import game.weapons.*;
import java.util.Random;
import java.util.Scanner;


public class FriendlyEncounter {
    static String[] friendlyEvents = {"Blacksmith", "Chest", "Inn"};

    public static void friendlyEncounter(Hero player) {
        boolean inFriendlyEvent = true;
        Scanner inputTracker = new Scanner(System.in);
        Random r = new Random();

        int randomEvent = r.nextInt(friendlyEvents.length);


        String friendlyEvent = friendlyEvents[randomEvent];
        while (inFriendlyEvent) {

            switch (friendlyEvent) {
                case "Blacksmith":
                    System.out.println("You encounter a Blacksmith!");
                    System.out.println("Hi there, I'm a blacksmith, got some weapons for sale that will help you deal some more damage!");
                    System.out.println("Got 3 swords available!");
                    System.out.println("1. [Iron sword] Price: " + Stylesheet.YELLOW + Stylesheet.BOLD + "15g" + Stylesheet.RESET);
                    System.out.println("2. [Rune Scimitar] Price: " + Stylesheet.YELLOW + Stylesheet.BOLD + "50g" + Stylesheet.RESET);
                    System.out.println(Stylesheet.BOLD + "3. [THE SWORD OF " + Stylesheet.RESET + Stylesheet.RED + Stylesheet.BOLD + "DOOM" + Stylesheet.RESET + Stylesheet.BOLD + " AND " + Stylesheet.RESET + Stylesheet.RED + Stylesheet.BOLD + "DESPAIR!" + Stylesheet.RESET + Stylesheet.BOLD + "]" + Stylesheet.RESET + "Price:" + Stylesheet.YELLOW + Stylesheet.BOLD + "200g" + Stylesheet.RESET);
                    System.out.println("4. Return to adventure");
                    int inputBlacksmith = inputTracker.nextInt();
                    switch (inputBlacksmith) {
                        case 1:
                            if (player.getGold() >= 15) {
                                System.out.println(player.getGold() + "gold");
                                player.setGold(player.getGold()-15);
                                player.setWeapon(new IronSword());
                                System.out.println("Thanks for your business! Now get out!");
                                System.out.println(player.getGold() + "gold");
                            } else {
                                System.out.println("You don't have enough money for that, get out!");
                            }

                            break;
                        case 2:
                            if (player.getGold() >= 50) {
                                player.setGold(-50);
                                player.setWeapon(new RuneScimitar());
                                System.out.println("Thanks for your business! Now get out!");
                            } else {
                                System.out.println("You don't have enough money for that, get out!");
                            }

                            break;
                        case 3:
                            if (player.getGold() >= 200) {
                                player.setGold(-200);
                                player.setWeapon(new TheSwordOfDoomAndDespair());
                                System.out.println("Thanks for your business! Now get out!");
                            } else {
                                System.out.println("You don't have enough money for that, get out!");
                            }

                            break;
                        case 4:
                            inFriendlyEvent = false;
                    }
                    break;

                case "Chest":
                    int oldGold = player.getGold();

                    System.out.println("You got some gold!");
                    player.setGold(player.getGold() + 60);
                        System.out.println();
                        System.out.println("----------------------------------------");
                        System.out.println(Stylesheet.YELLOW + "Gold " + oldGold + " → " + player.getGold() + Stylesheet.RESET);
                        System.out.println("----------------------------------------");
                        System.out.println();


                    System.out.println("Press enter key to continue...");
                    inputTracker.nextLine();
                    inFriendlyEvent = false;
                    break;
                case "Inn":
                    System.out.println("You find an inn! You can stay here for the night and heal");
                    System.out.println("Press enter to rest...");
                    inputTracker.nextLine();
                    player.heal();
                    System.out.println("You awake feeling refreshed and healed to full hp!");
                    System.out.println("Press enter key to continue your adventure...");
                    inputTracker.nextLine();
                    inFriendlyEvent = false;
                    break;
            }
        }
    }
}
