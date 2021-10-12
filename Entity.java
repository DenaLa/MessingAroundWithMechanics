package jrpgMechanics;

public abstract class Entity {
	private int lvl;
	private int hp, mp;
	private int atk, matk;
	private int def, mdef;
	private int spd, luck;
	private float aim = 1.0f, eva = 0.3f;
	
	//Level, HP, MP, ATK, MATK, DEF, MDEF, SPD, LUCK, AIM, EVA
	
	//constructor
	public Entity() {
		lvl = 1;
		hp = 1;
		mp = 1;
		atk = 1;
		matk = 1;
		def = 1;
		mdef = 1;
		spd = 1;
		luck = 1;
		aim = 1f;
		eva = .3f;
	}
	
	public Entity(int lvl, int hp,int mp,int atk,int matk,int def,int mdef,int spd,int luck) {
		this.lvl = lvl;
		this.hp = hp;
		this.mp = mp;
		this.atk = atk;
		this.matk = matk;
		this.def = def;
		this.mdef = mdef;
		this.spd = spd;
		this.luck = luck;
		aim = 1f;
		eva = .3f;
	}
	
	//Get
	public int getLVL() {
		return this.lvl;
	}
	
	public int getHP() {
		return this.hp;
	}
	
	public int getMP() {
		return this.mp;
	}
	
	public int getAtk() {
		return this.atk;
	}
	
	public int getMAtk() {
		return this.matk;
	}
	
	public int getDef() {
		return this.def;
	}
	
	public int getMDef() {
		return this.mdef;
	}
	
	public int getSpd() {
		return this.spd;
	}
	
	public int getLuck() {
		return this.luck;
	}
	
	public float getAim() {
		return this.aim;
	}
	
	public float getEva() {
		return this.eva;
	}
	
	
	//Set
	
	public void setLVL(int a) {
		lvl = a;
	}
	
	public void setHP(int a) {
		hp = a;
	}
	
	public void setMP(int a) {
		mp = a;
	}
	
	public void setAtk(int a) {
		atk = a;
	}
	
	public void setMAtk(int a) {
		matk = a;
	}
	
	public void setDef(int a) {
		def = a;
	}
	
	public void setMDef(int a) {
		mdef = a;
	}
	
	public void setSpd(int a) {
		spd = a;
	}
	
	public void setLuck(int a) {
		luck = a;
	}
	
	public void setAim(float b) {
		aim = b;
	}
	
	public void setEva(float b) {
		eva = b;
	}
		

}//class
