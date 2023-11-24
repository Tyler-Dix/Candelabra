package com.example.entities;

import com.example.entities.Entity;

public final class Player extends Entity {
    private int transformation;

    public Player(String name, int[][] position, int health, List<> inventory,
                  int baseDefense, int baseAttack, int equippedItem,
                  String dialogue, boolean hostile, int transformation) {
                    super(name, position, health, inventory, baseDefense,
                            baseAttack, equippedItem, dialogue, hostile);
                    this.transformation = transformation;
    }

    public int getTransformation() {
        return transformation;
    }

    public void setTransformation(int transformation) {
        this.transformation = transformation;
    }
}
