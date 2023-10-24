package com.example.items;

public abstract class Weapon {
    private String weaponName;
    private int attackDamage;
    private boolean canParry;
    private boolean isTwoHanded;
    private boolean isRanged;

    public Weapon(String weaponName, int attackDamage, boolean canParry, boolean isTwoHanded, boolean isRanged) {
        this.weaponName = weaponName;
        this.attackDamage = attackDamage;
        this.canParry = false;
        this.isTwoHanded = false;
        this.isRanged = false;
    }

    public String getWeaponName() {
        return weaponName;
    }

    public int getAttackDamage() {
        return attackDamage;
    }

    public boolean isCanParry() {
        return canParry;
    }

    public boolean isTwoHanded() {
        return isTwoHanded;
    }

    public boolean isRanged() {
        return isRanged;
    }

    public void setCanParry(boolean canParry) {
        this.canParry = canParry;
    }

    public void setTwoHanded(boolean twoHanded) {
        isTwoHanded = twoHanded;
    }

    public void setRanged(boolean ranged) {
        isRanged = ranged;
    }
}
