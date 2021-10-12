package jrpgMechanics;

public class Main {

	
	public static void main(String[] args) {
		int lvl = 1;
		int hp = 100;
		int mp = 50;
		int atk = 30;
		int matk = 20;
		int def = 50;
		int mdef = 30;
		int spd = 10;
		int luck = 4;
		
		
		Player p = new Player(lvl,hp,mp,atk,matk,def,mdef,spd,luck);
		Warrior pW = new Warrior(p);
		
		System.out.println(p.getEva());
//		System.out.println(pW.getEva());
		
		
		
	}
}
