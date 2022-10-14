package com.bilgeadam.boost.week08.lesson005;

public class Lion extends Enemy{

	public Lion(int position) {
		super(position);
		this.attack=15;
		this.hp=100;
		// TODO Auto-generated constructor stub
	}

	@Override
	public Character summonEnemy(int position) {	
		Lion lion = new Lion(position);
		return lion;
	}
	
	
	
}
