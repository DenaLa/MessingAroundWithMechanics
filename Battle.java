package jrpgMechanics;

public class Battle {
	//Attack, Skill, Item, Defend, Flee
	
	private int turns = 0;
	
	//Basics?
	public int PDamage(Entity attacker,Entity target) {
		int damage = attacker.getAtk() * (100/(100+target.getDef()));
		return damage;
	}
	
	public int MDamage(Entity attacker,Entity target) {
		int damage = attacker.getMAtk() * (100/(100+target.getMDef()));
		return damage;
	}
			
	
	public float modAccuracy(Entity attacker, float moveAim,Entity target) {
		float modAcc = attacker.getAim() * moveAim * target.getEva();
		return modAcc;
	}

	public boolean hitOrMiss(float eAim) {
		boolean hit = true;
		float max = 1f, min = 0f;
		float choice = (float)Math.floor(Math.random()*(max-min+1)+min);
		if(eAim < choice) {
			hit = false;
		}
		else {
			hit = true;
		}
		return hit;
	}
	
	public boolean critChance(Entity e) {
		boolean crit = false;
		int max = 100, min = 0;
		int choice = (int)Math.floor(Math.random()*(max-min+1)+min);
		int modLuck = e.getLuck() + ((int)Math.floor(Math.random()*((max-90)-min+1)+min));
		if(modLuck >= choice) {
			crit = true;
		}
		else {
			crit = false;
		}
		return crit;
	}
	
	public void breakSpdTie(Entity a, Entity b) {
		int aRoll, bRoll;
		int max = 100, min = 0;
		aRoll = (int)Math.floor(Math.random()*(max-min+1)+min);
		bRoll = (int)Math.floor(Math.random()*(max-min+1)+min);
		if(aRoll > bRoll) {
			a.setSpd(a.getSpd()+1);
		}
		else if(bRoll > aRoll) {
			b.setSpd(b.getSpd() + 1);
		}
		else {
			breakSpdTie(a,b);
		}
	}
	
	//Attack
	public void attack(Entity a,Entity t) {
		int damage = PDamage(a,t);
		t.setHP(t.getHP()-damage);
	}
	
	//Skill
	public void skill(Entity a,Entity t) {
		//somehow we take... skill and put it in
	}
	
	// defend
	public int Defend(Entity e) {
		int guard = (int)(e.getDef() * 1.5f);
		return guard;
	}
	
	//item
	public void Item() {
		//invetory... item effects... figure it out....
		
	}
	
	//Flee should end the battle.
	
	
	
}//class
