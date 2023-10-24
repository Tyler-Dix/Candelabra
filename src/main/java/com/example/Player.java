package com.example;

public final class Player extends Entity {
    private String playerName;

    public Player(String name, int health, int armorClass, int defense, int attackDice, boolean canBeAttacked, String playerName) {
        super(name, health, armorClass, defense, attackDice, canBeAttacked);
        this.playerName = playerName;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    //    public String getAttackDescription(String weaponName){
//        return "You attack the " + getEnemyName + " with your " + weaponName + "!";
//    }

//    public String getAttackDescription(String weaponName){
//        return "You defend yourself from the " + getEnemyName + " with your " + defensiveItem + ".";
//    }

//    public int getPlayerDamage(){
//        return getBaseAttack() + weapon.getAttackDamage;
//    }

}
