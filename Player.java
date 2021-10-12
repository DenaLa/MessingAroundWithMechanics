package jrpgMechanics;

public class Player extends Entity {
	private boolean magicuser = false;
	private String type = "";
	
	public Player() {
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
	
	
	public Player(int lvl, int hp,int mp,int atk,int matk,int def,int mdef,int spd,int luck) {
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
	
	
	public boolean getMU() {
		return magicuser;
	}
	
	
	public String getType() {
		return type;
	}
	
	public void setMU(boolean b) {
		this.magicuser = b;
	}
	
	public void setType(String s) {
		this.type = s;
	}
	
	//level up?
	//calculations are like 3 *base * (1.2/2) ???
	public void lvlUP() {
		this.setLVL(this.getLVL() + 1);
		int[] stats = new int[] {this.getHP(),this.getMP(),this.getAtk(),this.getMAtk(),this.getDef(),this.getSpd(),this.getLuck()};
		float[] fStats = new float[] {this.getEva(),this.getAim()};
		
		
		for(int i = 0;i<stats.length;i++) {
			lvlUpCalculation(stats[i]);
		}
		
		for(int i = 0;i < fStats.length; i++) {
			fLvlUpCalculation(fStats[i]);
		}
		
		
	}
	
	public void lvlUpCalculation(int a) {
		int min = 3, max = 5;
		int bonus = (int)Math.floor(Math.random()*(max-min)+min);
		a = (int)(bonus * a *(1.2/2));
	}
	
	public void fLvlUpCalculation(float a) {
		int min = 3, max = 5;
		int bonus = (int)Math.floor(Math.random()*(max-min)+min);
		a = (float)(bonus * a *(1.2/2));
	}
	
	
}//class
