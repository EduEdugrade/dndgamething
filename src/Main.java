import utils.Stylesheet;
import java.util.*;

class Location {
    String name;
    String[] enemies;

    Location(String name, String[] enemies) {
        this.name = name;
        this.enemies = enemies;
    }
}

class Player {
        String name;
        String vocation;
        int maxhp;
        int maxxp;
        int xp;
        int hp;
        int dmg;
        int lvl;
        int gold;
    Player() {
        this.name = "You";
        this.vocation ="Peasant";
        this.lvl = 1;
        this.maxhp = 15;
        this.maxxp = 15;
        this.xp = 0;
        this.hp = 10;
        this.dmg = 2;
        this.gold = 0;

    }
}

class EnemyCharacter {
    String name;
    int lvl;
    int maxhp;
    int hp;
    int dmg;
    EnemyCharacter(String name, int lvl, int maxhp, int hp, int dmg) {
        this.name = name;
        this.lvl = lvl;
        this.maxhp = maxhp;
        this.hp = hp;
        this.dmg = dmg;
    }
}


    public class Main {

    static Map<String,String[]> enemies = Map.of(
            "Forest", new String[]{"goblin","Wolf"},
            "Cave", new String[]{"Cave spider","Bear"},
            "Graveyard", new String[]{"Skeleton", "Zombie"},
            "Dungeon", new String[]{"Necromancer", "Troll"},
            "Nybro", new String[]{"Dragon", "Dragon"}
    );

        static Player myPlayer = new Player();
        static EnemyCharacter myEnemy = new EnemyCharacter("greg500",1,1,1,1);
        static String[] vocations = {"Gandalf", "Barbarian", "Druid", "Paladin", "Fighter", "Ranger", "Cleric", "Rogue", "Sorcerer", "Warlock", "Wizard"};
        static String[] locations = {"Forest", "Cave", "Graveyard", "Dungeon", "Nybro", "Village"};
        static String[] villageLocations = {"Blacksmith", "Temple", "Inn", "Adventure"};
        static boolean isRunning = true;

        static void sleep() {
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        static void bigSleep() {
            try {
                Thread.sleep(600);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        static void playerAttack() {
            myEnemy.hp = myEnemy.hp - myPlayer.dmg;
        }

        static void enemyAttack() {
            myPlayer.hp = myPlayer.hp - myEnemy.dmg;
        }
        static void enemyLuckyAttack() {
            myPlayer.hp = myPlayer.hp - myEnemy.dmg + 1;
        }

        static void playerHeal() {
            myPlayer.hp = myPlayer.maxhp;
        }
        static void playerSpecial() {
            myEnemy.hp = myEnemy.hp - myPlayer.dmg*2;
            switch (myPlayer.vocation) {
                case "Barbarian":
                    System.out.println(Stylesheet.BOLD+Stylesheet.PURPLE+"YOU HIT THEM REALLY REALLY HARD!!!");
                    break;
                case "Druid":
                    System.out.println(Stylesheet.PURPLE+"I dunno man, your flowers really hurt them or smth idk lol");
                    break;
                case "Paladin":
                    System.out.println(Stylesheet.BOLD+Stylesheet.PURPLE+"YOU USED DIVINE SMITE!!!");
                    break;
                case "Fighter":
                    System.out.println(Stylesheet.BOLD+Stylesheet.PURPLE+"YOU USED ADRENALINE SURGE TO HIT THEM TWICE!");
                    break;
                case "Ranger":
                    System.out.println(Stylesheet.BOLD+Stylesheet.PURPLE+"YOUR WOLF COMPANION MAULED YOUR ENEMY!");
                    break;
                case "Cleric":
                    System.out.println(Stylesheet.BOLD+Stylesheet.PURPLE+"YOUR GOD BLESSES YOUR STRIKE!");
                    break;
                case "Rogue":
                    System.out.println(Stylesheet.BOLD+Stylesheet.PURPLE+"YOU GOT A CRITICAL HIT!");
                    break;
                    case "Sorcerer":
                        System.out.println(Stylesheet.BOLD+Stylesheet.PURPLE+"YOU CAST MAGIC MISSILE!");
                        break;
                        case "Warlock":
                            System.out.println(Stylesheet.BOLD+Stylesheet.PURPLE+"YOU CAST ELDRITCH BLAST!");
                            break;
                            case "Wizard":
                                System.out.println(Stylesheet.BOLD+Stylesheet.PURPLE+"YOU CAST FIREBALL!!! ");
                                break;
            }
        }

        //MAIN CODE BLOCK//
        public static void main(String[] args) {
            Scanner inputTracker = new Scanner(System.in);
            String inputName;
            int inputVocation;
            int inputLocation;
            int inputVillageLocation = 0;
            int inputBlacksmith;
            Boolean inVillage = false;
            Random rand= new Random();

            //CHARACTER NAMING//
            System.out.println(
                    Stylesheet.BLUE +
                            """
                                    You are a peasant, you are tired of being a peasant, you wanna go on an adventure and stop being a peasant! 
                                                        You're gonna kill a dragon or something!
                                    """
                            + Stylesheet.RESET
            );
            System.out.println("What is your name? ");
            inputName = inputTracker.nextLine();
            //CHARACTER NAMING

            //CHARACTER CLASS CHOICE//
            System.out.println("""
                    Choose your class!
                    1: Barbarian
                    2: Druid
                    3: Paladin
                    4: Fighter
                    5: Ranger
                    6: Cleric
                    7: Rogue
                    8: Sorcerer
                    9: Warlock
                    10: Wizard
                    """);
            inputVocation = inputTracker.nextInt();
            myPlayer.vocation = vocations[inputVocation];
            myPlayer.name = inputName;
            myPlayer.gold = 0;



            //CLASS CHOICE//

            //CHARACTER CREATION END//

            //LOCATION PICKER

            while (isRunning && inVillage == false) {
                if(myPlayer.hp < 0) {
                    System.out.println(Stylesheet.RED +"YOU ARE DEAD, PRESS CTRL + F5 TO CONTINUE!"+ Stylesheet.RESET);
                } else if(myPlayer.hp > 0) {
            System.out.println("""
                    Choose where to go!
                    1: Forest [Recommended lvl 1]
                    2: Cave [Recommended lvl 3]
                    3: Graveyard [Recommended lvl 6]
                    4: Dungeon [Recommended lvl 9]
                    5: Nybro [Recommended lvl 12]
                    6: Village [Safe]
                    7: QUIT
                    """);

            inputLocation = inputTracker.nextInt();

            int fiftyPercent = rand.nextInt(2);

            String selectedLocation = locations[inputLocation - 1];
            String[] currentEnemies = enemies.get(selectedLocation);
            if(selectedLocation.equals("Village")) {
                inVillage = true;
            }

            //COMBAT LOOP//




                if (!selectedLocation.equals("Village")) {


                    myEnemy = new EnemyCharacter(currentEnemies[fiftyPercent], 2*inputLocation, 6* myEnemy.lvl*inputLocation,6 * myEnemy.lvl*inputLocation,2*inputLocation);

                    String myCharacterName = Stylesheet.GREEN + myPlayer.name + " the " + myPlayer.vocation + Stylesheet.BOLD + " [LvL " + myPlayer.lvl + "]" + Stylesheet.RESET;
                    String myEnemyName = Stylesheet.RED + myEnemy.name + Stylesheet.BOLD + " [LvL " + myEnemy.lvl + "]" + Stylesheet.RESET;

                    if (myEnemy.hp > 0) {
                    System.out.println("Starting battle!");
                        sleep();
                    System.out.println("------------------------------------------------------------------------");
                        System.out.print(myCharacterName);System.out.print(" vs ");System.out.println(myEnemyName);
                    System.out.println("------------------------------------------------------------------------");


                    while (myPlayer.hp > 0 && myEnemy.hp > 0) {
                        int lucky = rand.nextInt(3);
                        int enemyLucky = rand.nextInt(4);
                        if(lucky==1){
                            playerSpecial();
                            System.out.println(myEnemyName + " took " + myPlayer.dmg*2 + " damage, it now has " + Stylesheet.RED + myEnemy.hp + "/" + myEnemy.maxhp + Stylesheet.RESET + "hp remaining");
                            sleep();
                        } else {
                            playerAttack();
                            System.out.println(myCharacterName + " attacked " + myEnemyName + " for " + myPlayer.dmg + " damage, it now has " + Stylesheet.RED + myEnemy.hp + "/" + myEnemy.maxhp + Stylesheet.RESET + "hp remaining");
                            sleep();
                        }


                        System.out.println("------------------------------------------------------------------------");

                        if (myEnemy.hp > 0) {
                            if(enemyLucky==1){
                                enemyLuckyAttack();
                                System.out.println(myEnemyName + " attacked " + myCharacterName + " for " + myEnemy.dmg + " damage, you have " + Stylesheet.RED + myPlayer.hp + "/" + myPlayer.maxhp + Stylesheet.RESET + "hp remaining");
                                sleep();
                            } else {
                                enemyAttack();
                                System.out.println(myEnemyName + " attacked " + myCharacterName + " for " + myEnemy.dmg + " damage, you have " + Stylesheet.RED + myPlayer.hp + "/" + myPlayer.maxhp + Stylesheet.RESET + "hp remaining");
                                sleep();
                            }


                            System.out.println("------------------------------------------------------------------------");
                        }
                    }



                    if (myPlayer.hp > 0) {
                        int thirtyPercent = rand.nextInt(3);
                        int goldFound = rand.nextInt(10);
                        myPlayer.gold = myPlayer.gold +goldFound;
                        int newGold = myPlayer.gold + goldFound;
                        System.out.println("Wow, you found "+Stylesheet.YELLOW + Stylesheet.BOLD +goldFound+ Stylesheet.RESET+" gold, you now have "+Stylesheet.YELLOW+newGold+Stylesheet.RESET+" gold!");
                        //Old stats
                        int oldLvl = myPlayer.lvl;
                        int oldDmg = myPlayer.dmg;
                        int oldHp = myPlayer.maxhp;
                        System.out.println(Stylesheet.GREEN + myCharacterName + " wins!" + Stylesheet.RESET);
                        if (thirtyPercent == 0) {
                        myPlayer.lvl = myPlayer.lvl + 1;
                        myPlayer.dmg = myPlayer.dmg + 1;
                        myPlayer.maxhp = myPlayer.maxhp + 5;
                        myPlayer.hp = myPlayer.maxhp;
                        System.out.println();
                        System.out.println(Stylesheet.YELLOW + Stylesheet.BOLD + "You leveled up! You feel stronger!" + Stylesheet.RESET);
                        System.out.println(Stylesheet.YELLOW +"Oh, and you're healed :)" + Stylesheet.RESET);
                        System.out.println("----------------------------------------");
                        System.out.println(Stylesheet.YELLOW + "Lvl " + oldLvl + " → " + myPlayer.lvl + Stylesheet.RESET);
                        System.out.println(Stylesheet.YELLOW + oldDmg + " dmg → " + myPlayer.dmg + " dmg" + Stylesheet.RESET);
                        System.out.println(Stylesheet.YELLOW + oldHp + " hp → " + myPlayer.maxhp + " hp" + Stylesheet.RESET);
                        System.out.println("----------------------------------------");
                        System.out.println();
                        }
                    }
                    else System.out.println(Stylesheet.RED +"YOU ARE DEAD, PRESS CTRL + F5 TO CONTINUE!"+ Stylesheet.RESET);
                }
            } else while (inVillage) { {
                    System.out.println("""
                    You arrive at the village, there appears to be a some places that could be useful!
                    1: Blacksmith, will sell you weapons.
                    2: Temple, the gods blessings could be useful on your adventure. Also for a fee, apparently.
                    3: An Inn, spending the night there could give you time to tend to your wounds.
                    4: Continue on your adventure
                    """);
                    inputVillageLocation = inputTracker.nextInt();
                    String villageLocation = villageLocations[inputVillageLocation - 1];

                    switch (villageLocation) {
                        case "Blacksmith":
                            System.out.println("Hi there, I'm the village blacksmith, got some weapons for sale that will help you deal some more damage!");
                            System.out.println("Don't worry about your class or anything, I'm sure if you hold a sword the right way it'll cast some spells!");
                            System.out.println("Got 3 swords available!");
                            System.out.println("1. [Iron sword] Price: "+Stylesheet.YELLOW+Stylesheet.BOLD+"15g"+Stylesheet.RESET);
                            System.out.println("2. [Long sword] Price: "+Stylesheet.YELLOW+Stylesheet.BOLD+"50g"+Stylesheet.RESET);
                            System.out.println(Stylesheet.BOLD+"3. [THE SWORD OF "+Stylesheet.RESET+Stylesheet.RED+Stylesheet.BOLD+"DOOM"+Stylesheet.RESET+Stylesheet.BOLD+" AND "+Stylesheet.RESET+Stylesheet.RED+Stylesheet.BOLD+"DESPAIR!"+Stylesheet.RESET+Stylesheet.BOLD+"]"+Stylesheet.RESET+ "Price:"+Stylesheet.YELLOW+Stylesheet.BOLD+"200g"+Stylesheet.RESET);
                            System.out.println("4. Return to village");
                            inputBlacksmith = inputTracker.nextInt();
                            switch (inputBlacksmith) {
                                case 1:
                                    if (myPlayer.gold >= 15) {
                                        System.out.println(myPlayer.gold+"gold"+" "+myPlayer.dmg+"dmg");
                                        myPlayer.gold -= 15;
                                        myPlayer.dmg = myPlayer.dmg + 1;
                                        System.out.println("Thanks for your business! Now get out!");
                                        System.out.println(myPlayer.gold+"gold"+" "+myPlayer.dmg+"dmg");
                                    } else {
                                        System.out.println("You don't have enough money for that, get out!");
                                    }
                                    inVillage = true;
                                    break;
                                    case 2:
                                        if (myPlayer.gold >= 50) {
                                            myPlayer.gold -= 50;
                                            myPlayer.dmg = myPlayer.dmg + 3;
                                            System.out.println("Thanks for your business! Now get out!");
                                        } else {
                                            System.out.println("You don't have enough money for that, get out!");
                                        }
                                        inVillage = true;
                                        break;
                                        case 3:
                                            if (myPlayer.gold >= 200) {
                                                myPlayer.gold -= 200;
                                                myPlayer.dmg = myPlayer.dmg + 12;
                                                System.out.println("Thanks for your business! Now get out!");
                                            } else {
                                                System.out.println("You don't have enough money for that, get out!");
                                            }
                                            inVillage = true;
                                            break;
                                case 4:
                                    inVillage = true;
                            }
                            break;

                            case "Temple":
                                System.out.println("Hello there, I'm the village priest, I got some blessings for sale if you're interested!");
                                System.out.println("If you're lucky enough they might do something!");
                                int thirty = rand.nextInt(3);
                                if (myPlayer.gold >= 10) {
                                    myPlayer.gold -= 10;
                                    int oldLvl = myPlayer.lvl;
                                    int oldDmg = myPlayer.dmg;
                                    int oldHp = myPlayer.maxhp;
                                    if (thirty == 1) {
                                        myPlayer.lvl = myPlayer.lvl + 1;
                                        myPlayer.dmg = myPlayer.dmg + 1;
                                        myPlayer.maxhp = myPlayer.maxhp + 5;
                                        myPlayer.hp = myPlayer.maxhp;
                                        //Level up message
                                        System.out.println();
                                        System.out.println(Stylesheet.YELLOW + Stylesheet.BOLD + "You leveled up! You feel stronger!" + Stylesheet.RESET);
                                        System.out.println("----------------------------------------");
                                        System.out.println(Stylesheet.YELLOW + "Lvl " + oldLvl + " → " + myPlayer.lvl + Stylesheet.RESET);
                                        System.out.println(Stylesheet.YELLOW + oldDmg + " dmg → " + myPlayer.dmg + " dmg" + Stylesheet.RESET);
                                        System.out.println(Stylesheet.YELLOW + oldHp + " hp → " + myPlayer.maxhp + " hp" + Stylesheet.RESET);
                                        System.out.println("----------------------------------------");
                                    }
                                }
                                break;
                        case "Inn":

                            System.out.println("We got some open rooms, some sleep might make you feel better, want one?");
                            myPlayer.hp = myPlayer.maxhp;
                            break;
                            case "Adventure":
                                System.out.println("You return to your adventure");
                                inVillage = false;
                    }

                }
        }}
    }}}