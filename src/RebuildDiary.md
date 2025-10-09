# Mina reflektioner kring min kod.

Jag tänkte skriva om min kod från "början" då den inte uppfyller flera av dom kraven som krävdes på inlämningsuppgiften.

Min avsikt är att sikta på G först och främst, när det väl är uppnåt kan jag fokusera på att försöka uppfylla kraven för VG.

Först och främst kan jag kolla på betygskriterna under G och se vad jag kommer att behöva inkludera i min kod.
T.ex, en av de första objekten att nå för mig är att omstrukturera hur min player/enemies är uppbyggda.

# Steg 1. (Godkänt 1. Klassstruktur och OOP-koncept - 2. Obligatoriska klasser)
---Character(Abstract)

------Character(Abstract)>Monster(Abstract)

---------Monster(Abstract)>Boss(Concrete)

---Character(Abstract)>Hero(Concrete)

Character behöver enligt detta egenskaperna som både Monster, Boss, och Hero vill ärva.
Dessa egenskaperna skulle då vara HP, Dmg, en attack() method.

Pseudokod och sånt här nere:

public abstract class Character {...}
public abstract class Monster extends Character {...}
public class Boss extends Monster {...}
public class Hero extends Character {...}

**Character egenskaper som alla vill dela:**

Attack(), hp, dmg.

**Monster egenskaper:**

Namn

**Boss egenskaper:**

En override attack() method för 2x damage funktionalitet.

**Hero egenskaper:**

XP och en override attack() method för weapondmgbonuis funktionalitet.

# Steg 2. (3. Funktionalitet)
Hero börjar vid lvl 1, max lvl 10. 100xp = lvl up.

Varje level behöver 300xp t.ex.

om lvl 10 nås vinner man.

Stridssystem är turbaserat, vad jag hade innan bör fungera.

Encounter system kan implementeras likt vad jag hade.

Boss special attack är likt vad jag hade med min dnd-class specifika attack.
