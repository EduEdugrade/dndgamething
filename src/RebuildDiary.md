# Mina reflektioner kring min kod.

Jag tänkte skriva om min kod från "början" då den inte uppfyller flera av dom kraven som krävdes på inlämningsuppgiften.

Min avsikt är att sikta på G först och främst, när det väl är uppnåt kan jag fokusera på att försöka uppfylla kraven för VG.

Först och främst kan jag kolla på betygskriterna under G och se vad jag kommer att behöva inkludera i min kod.
T.ex, en av de första objekten att nå för mig är att omstrukturera hur min player/enemies är uppbyggda.

# Steg 1. (Godkänt 1. Klassstruktur och OOP-koncept - 2. Obligatoriska klasser)
---game.characters.Character(Abstract)

------game.characters.Character(Abstract)>game.monsters.Monster(Abstract)

---------game.monsters.Monster(Abstract)>game.monsters.Boss(Concrete)

---game.characters.Character(Abstract)>game.characters.Hero(Concrete)

game.characters.Character behöver enligt detta egenskaperna som både game.monsters.Monster, game.monsters.Boss, och game.characters.Hero vill ärva.
Dessa egenskaperna skulle då vara HP, Dmg, en attack() method.

Pseudokod och sånt här nere:

public abstract class game.characters.Character {...}
public abstract class game.monsters.Monster extends game.characters.Character {...}
public class game.monsters.Boss extends game.monsters.Monster {...}
public class game.characters.Hero extends game.characters.Character {...}

**game.characters.Character egenskaper som alla vill dela:**

Attack(), hp, dmg.

**game.monsters.Monster egenskaper:**

Namn

**game.monsters.Boss egenskaper:**

En override attack() method för 2x damage funktionalitet.

**game.characters.Hero egenskaper:**

XP och en override attack() method för weapondmgbonuis funktionalitet.

# Steg 2. (3. Funktionalitet)
game.characters.Hero börjar vid lvl 1, max lvl 10. 100xp = lvl up.

Varje level behöver 300xp t.ex.

om lvl 10 nås vinner man.

Stridssystem är turbaserat, vad jag hade innan bör fungera.

game.systems.Encounter system kan implementeras likt vad jag hade.

game.monsters.Boss special attack är likt vad jag hade med min dnd-class specifika attack.


# Steg något!

