# Mina reflektioner kring min kod.

Jag tänkte skriva om min kod från "början" då den inte uppfyller flera av dom kraven som krävdes på inlämningsuppgiften.

Min åsikt är att sikta på G först och främst, när det väl är uppnåt kan jag fokusera på att försöka uppfylla kraven för VG.

Först och främst kan jag kolla på betygskriterna under G och se vad jag kommer att behöva inkludera i min kod.
T.ex, en av de första objekten att nå för mig är att omstrukturera hur min player/enemies är uppbyggda.

# Steg 1.
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
public class Hero extends Monster {...}

