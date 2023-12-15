package com.example.entities;

import java.util.List;

public abstract class Entity {
    private String name;
    private int position[][];
    private int health;
    private List<> inventory;
    private int baseDefense;
    private int baseAttack;
    private int equippedItem;
    private String dialogue;
    private boolean hostile = false;

    //**************CONSTRUCTOR*********************
    public Entity(String name, int[][] position, int health,
                  List<String> inventory, int baseDefense, int baseAttack,
                  int equippedItem, String dialogue, boolean hostile) {
                    this.name = name;
                    this.position = position;
                    this.health = health;
                    this.inventory = inventory;
                    this.baseDefense = baseDefense;
                    this.baseAttack = baseAttack;
                    this.equippedItem = equippedItem;
                    this.dialogue = dialogue;
                    this.hostile = hostile;
    }


    //**************GETTERS*********************
    public String getName() {
        return name;
    }

    public int[][] getPosition() {
        return position;
    }

    public int getHealth() {
        return health;
    }

    public List<> getInventory() {
        return inventory;
    }

    public int getBaseDefense() {
        return baseDefense;
    }

    public int getBaseAttack() {
        return baseAttack;
    }

    public int getEquippedItem() {
        return equippedItem;
    }

    public String getDialogue() {
        return dialogue;
    }

    public boolean isHostile() {
        return hostile;
    }

    //**************SETTERS*********************


    public void setName(String name) {
        this.name = name;
    }

    public void setPosition(int[][] position) {
        this.position = position;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setInventory(List<> inventory) {
        this.inventory = inventory;
    }

    public void setBaseDefense(int baseDefense) {
        this.baseDefense = baseDefense;
    }

    public void setBaseAttack(int baseAttack) {
        this.baseAttack = baseAttack;
    }

    public void setEquippedItem(int equippedItem) {
        this.equippedItem = equippedItem;
    }

    public void setDialogue(String dialogue) {
        this.dialogue = dialogue;
    }

    public void setHostile(boolean hostile) {
        this.hostile = hostile;
    }
}
