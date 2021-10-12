package jrpgMechanics;

public class Thief extends Player{
	
	public Thief(Player p) {
		statMod(p);
		p.setMU(false);
		this.setType("Thief");
	}
	
	//Level, HP, MP, ATK, MATK, DEF, MDEF, SPD, LUCK, AIM, EVA
	public void statMod(Player p) {
		this.setHP((int)(p.getHP() * .8f));
		this.setAtk((int)(p.getAtk() * .8f));
		this.setMAtk((int)(p.getMAtk() * .7f));
		this.setDef((int)(p.getDef() * .6f));
		this.setMDef((int)(p.getMDef() * .6f));
		this.setSpd((int)(p.getSpd() * 1.6f));
		this.setLuck((int)(p.getLuck() * 1.2f));
		this.setEva((p.getEva() * 1.2f));
	}
	

}
