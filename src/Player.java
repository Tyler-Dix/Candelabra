package src;

public final class Player extends Entity {
    private String playerName;


    public Player(String name, int health, int armorClass, int defense, int attackDice, boolean canBeAttacked) {
        super(name, health, armorClass, defense, attackDice, canBeAttacked);
    }

    public String getAttackDescription(String weaponName){
        return "You attack the " + getEnemyName + " with your " + weaponName + "!";
    }

    public String getAttackDescription(String weaponName){
        return "You defend yourself from the " + getEnemyName + " with your " + defensiveItem + ".";
    }

    public int getPlayerDamage(){
        return getBaseAttack() + weapon.getAttackDamage;
    }

}
