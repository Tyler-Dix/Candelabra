public class Animal extends Entity{

    private boolean isQuadrupedal;
    private boolean hasFur;
    private boolean hasTeeth;

    public Animal(String name, int health, int armorClass, int defense, int attackDice, boolean canBeAttacked, boolean isQuadrupedal, boolean hasFur, boolean hasTeeth) {
        super(name, health, armorClass, defense, attackDice, canBeAttacked);
        this.isQuadrupedal = isQuadrupedal;
        this.hasFur = hasFur;
        this.hasTeeth = hasTeeth;
    }

}
