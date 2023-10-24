package com.example.entities;

import com.example.entities.Entity;

public abstract class Humanoid extends Entity {

    private int armorClass;

    public Humanoid(String name, int health, int armorClass, int defense, int attackDice, boolean canBeAttacked) {
        super(name, health, armorClass, defense, attackDice, canBeAttacked);
        this.armorClass = armorClass;
    }
}
