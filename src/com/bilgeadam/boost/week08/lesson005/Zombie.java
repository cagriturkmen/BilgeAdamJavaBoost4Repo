package com.bilgeadam.boost.week08.lesson005;

public class Zombie extends Enemy{

	public Zombie(int position) {
		super(position);
		this.hp=300;
		this.attack=7;
		// TODO Auto-generated constructor stub
	}

	@Override
	public Character summonEnemy(int position) {
		
		Zombie zombie = new Zombie(position);
		
		return zombie;
	}
	
	
	
}
