package jrpgMechanics;

public class Enemy extends Entity{
	private String type = "";
	
	
	public Enemy() {
		this.setLVL(1);
		this.setHP(1);
		this.setMP(1);
		this.setAtk(1);
		this.setMAtk(1);
		this.setDef(1);
		this.setMDef(1);
		this.setSpd(1);
		this.setLuck(1);
		type = "Basic";
	}
	
	
	public Enemy(int lvl, int hp,int mp,int atk,int matk,int def,int mdef,int spd,int luck) {
		this.setLVL(lvl);
		this.setHP(hp);
		this.setMP(mp);
		this.setAtk(atk);
		this.setMAtk(matk);
		this.setDef(def);
		this.setMDef(mdef);
		this.setSpd(spd);
		this.setLuck(luck);
	}
	
	
	public String getType() {
		return type;
	}
	
	public void setType(String s) {
		this.type = s;
	}

}
