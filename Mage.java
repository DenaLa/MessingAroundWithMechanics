package jrpgMechanics;

public class Mage extends Player{

	public Mage(Player p) {
		statMod(p);
		p.setMU(true);
		this.setType("Mage");
	}
	
	//Level, HP, MP, ATK, MATK, DEF, MDEF, SPD, LUCK, AIM, EVA
	public void statMod(Player p) {
		this.setHP((int)(p.getHP() * 1.3f));
		this.setAtk((int)(p.getAtk() * .3f));
		this.setMAtk((int)(p.getMAtk() * 1.4f));
		this.setDef((int)(p.getDef() * .5f));
		this.setMDef((int)(p.getMDef() * 1.4f));
		this.setSpd((int)(p.getSpd() * .6f));
	}
	
	
}
