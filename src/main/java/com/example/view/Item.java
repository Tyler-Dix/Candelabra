package com.example.view;

public abstract class Item {

    private String name;
    private String description;
    private String detailedDescription;
    private int attackValue;
    private int defenseValue;
    private String itemType;

    //**************CONSTRUCTOR*********************
    public Item(String name, String description, String detailedDescription,
                int attackValue, int defenseValue, String itemType) {
                    this.name = name;
                    this.description = description;
                    this.detailedDescription = detailedDescription;
                    this.attackValue = attackValue;
                    this.defenseValue = defenseValue;
                    this.itemType = itemType;
    }

    //**************GETTERS*********************

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getDetailedDescription() {
        return detailedDescription;
    }

    public int getAttackValue() {
        return attackValue;
    }

    public int getDefenseValue() {
        return defenseValue;
    }

    public String getItemType() {
        return itemType;
    }


    //**************SETTERS*********************

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDetailedDescription(String detailedDescription) {
        this.detailedDescription = detailedDescription;
    }

    public void setAttackValue(int attackValue) {
        this.attackValue = attackValue;
    }

    public void setDefenseValue(int defenseValue) {
        this.defenseValue = defenseValue;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }
}
