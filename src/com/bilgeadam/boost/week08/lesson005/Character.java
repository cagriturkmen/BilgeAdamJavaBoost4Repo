package com.bilgeadam.boost.week08.lesson005;

public abstract class Character {

	protected int hp;
	protected int attack;
	protected int position;
	
	public Character() {
		
	}
	

	public Character(int position) {
		this.position = position;
	}


	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getAttack() {
		return attack;
	}

	public void setAttack(int attack) {
		this.attack = attack;
	}

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

	@Override
	public String toString() {
		return "Character [hp=" + hp + ", attack=" + attack + ", position=" + position + "]";
	}
	
	
	
}
