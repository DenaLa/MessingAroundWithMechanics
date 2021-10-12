package jrpgMechanics;

public class Healer extends Player{
	
	public Healer(Player p) {
		statMod(p);
		p.setMU(true);
		this.setType("Healer");
	}
	
	//Level, HP, MP, ATK, MATK, DEF, MDEF, SPD, LUCK, AIM, EVA
	public void statMod(Player p) {
		this.setHP((int)(p.getHP() * 1.6f));
		this.setAtk((int)(p.getAtk() * .1f));
		this.setMAtk((int)(p.getMAtk() * 1.1f));
		this.setDef((int)(p.getDef() * 1.3f));
		this.setMDef((int)(p.getMDef() * 1.5f));
		this.setSpd((int)(p.getSpd() * 1.1f));
	}
	
	

}
