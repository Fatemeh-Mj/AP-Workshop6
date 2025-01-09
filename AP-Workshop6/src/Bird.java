public abstract class Bird extends Animal{
    protected String flyHeight;

    public Bird(String name, String age, String flyHeight) {
        super(name, age);
        this.flyHeight = flyHeight;
    }

    public String getFlyHeight() {
        return flyHeight;
    }
}
