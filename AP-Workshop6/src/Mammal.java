public abstract class Mammal extends Animal{
    protected String runSpeed;

    public Mammal(String name, String age, String runSpeed) {
        super(name, age);
        this.runSpeed = runSpeed;
    }

    public String getRunSpeed() {
        return runSpeed;
    }
}
