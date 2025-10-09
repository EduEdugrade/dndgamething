import utils.Stylesheet;
import java.util.*;

public class Main {

        //MAIN CODE BLOCK//
        public static void main(String[] args) {
            Hero player = new Hero();
            Goblin goblin = new Goblin();
            //Prompt player to make character
            //Main method that runs game
            // sub methods with different modes in game such as encounter and combat/specific event logic
            player.attack(goblin);
            System.out.println();


            while (player.hp > 0 && goblin.hp > 0) {
                player.attack(goblin);
                goblin.attack(player);
            }
        }
}