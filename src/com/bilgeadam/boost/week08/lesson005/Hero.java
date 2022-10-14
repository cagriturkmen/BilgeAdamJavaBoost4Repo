package com.bilgeadam.boost.week08.lesson005;

public class Hero extends Ally{

	private static Hero instance;
	
	private Hero() {
		super();
		this.attack=10;
		this.hp=1000;
		this.position=0;
	}
	
	public static Hero getInstance() {
		if(instance==null) {
			instance = new Hero();
		}
		return instance;
	}

	@Override
	public Character summonAlly() {		
		return getInstance();
	}

	
	

}
