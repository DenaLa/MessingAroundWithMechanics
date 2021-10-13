package jrpgMechanics;

public class Grunt extends Enemy {
	
	public Grunt() {
		this.setLVL(1);
		this.setHP(200);
		this.setMP(1000);
		this.setAtk(10);
		this.setMAtk(4);
		this.setDef(5);
		this.setMDef(5);
		this.setSpd(10);
		this.setLuck(3);
		this.setType("Grunt");
	}

}
