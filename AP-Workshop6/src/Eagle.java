public class Eagle extends Bird implements Hunter{
    private String feature;
    public Eagle(String name, String age, String flyHeight, String feature) {
        super(name, age, flyHeight);
        this.feature = feature;
    }

    public String getFeature() {
        return feature;
    }

    @Override
    public void show() {
        System.out.println("name: " + name + ", age: " + age + ", high of fly : " + flyHeight + ", " + feature);
    }

    @Override
    public void hunt(Prey prey) {
        System.out.println(this.name + " hunted " + prey.getName());
    }
}
