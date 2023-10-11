package src;

public abstract class Entity {
    private String name;
    private int health;
    private int defense;
    private int baseAttack;
    private boolean canBeAttacked;

    public Entity(String name, int health, int armorClass, int defense, int attackDice, boolean canBeAttacked) {
        this.name = name;
        this.health = health;
        this.defense = defense;
        this.baseAttack = attackDice;
        this.canBeAttacked = false;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }


    public int getDefense() {
        return defense;
    }

    public int getBaseAttack() {
        return baseAttack;
    }
}
