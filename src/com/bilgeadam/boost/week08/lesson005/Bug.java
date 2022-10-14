package com.bilgeadam.boost.week08.lesson005;

public class Bug extends Enemy{

	public Bug(int position) {
		super(position);
		this.hp=50;
		this.attack=2;
		// TODO Auto-generated constructor stub
	}

	@Override
	public Character summonEnemy(int position) {
		Bug bug = new Bug(position);
		return bug;
	}
	
	
	
}
