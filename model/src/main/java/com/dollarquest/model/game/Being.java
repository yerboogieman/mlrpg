package com.dollarquest.model.game;

import java.util.Collection;

/**
 * Created by eric on 6/22/16.
 */
public abstract class Being {

	private int hitPoints;

	private int defenseRating;

	private int attackRating;

	private Collection<Item> inventory;

	public abstract void attack(Being being);

	public int getHitPoints() {
		return hitPoints;
	}

	public void setHitPoints(int hitPoints) {
		this.hitPoints = hitPoints;
	}

	public int getDefenseRating() {
		return defenseRating;
	}

	public void setDefenseRating(int defenseRating) {
		this.defenseRating = defenseRating;
	}

	public int getAttackRating() {
		return attackRating;
	}

	public void setAttackRating(int attackRating) {
		this.attackRating = attackRating;
	}

	public void setInventory(Collection<Item> inventory) {
		this.inventory = inventory;
	}

	public Collection<Item> getInventory() {
		return inventory;
	}
}
