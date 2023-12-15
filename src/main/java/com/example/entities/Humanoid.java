package com.example.entities;

import com.example.entities.Entity;

import java.util.List;

public abstract class Humanoid extends Entity {

    private int armorClass;

    public Humanoid(String name, int[][] position, int health, List<String> inventory, int baseDefense, int baseAttack, int equippedItem, String dialogue, boolean hostile, int armorClass) {
        super(  name, position, health,
                inventory, baseDefense,
                baseAttack, equippedItem,
                dialogue, hostile);
        this.armorClass = armorClass;
    }
}
