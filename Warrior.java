package jrpgMechanics;

public class Warrior extends Player {
	
	
	public Warrior(Player p) {
		statMod(p);
		this.setMU(false);
		this.setType("Warrior");
	}
	
	//Level, HP, MP, ATK, MATK, DEF, MDEF, SPD, LUCK, AIM, EVA
	public void statMod(Player p) {
		this.setHP((int)(p.getHP() * 1.4f));
		this.setAtk((int)(p.getAtk() * 1.5f));
		this.setMAtk((int)(p.getMAtk() * .5f));
		this.setDef((int)(p.getDef() * 1.4f));
		this.setMDef((int)(p.getMDef() * .5f));
		this.setSpd((int)(p.getSpd() * .7f));
	}
}
