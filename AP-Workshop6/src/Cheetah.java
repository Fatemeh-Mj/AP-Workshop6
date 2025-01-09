public class Cheetah extends Mammal implements Hunter {
    private String feature;

    public Cheetah(String name, String age, String runSpeed, String feature) {
        super(name, age, runSpeed);
        this.feature = feature;
    }

    public String getFeature() {
        return feature;
    }

    @Override
    public void show() {
        System.out.println("name: " + name + ", age: " + age + ", speed : " + runSpeed + ", " + feature);
    }

    @Override
    public void hunt(Prey prey) {
        System.out.println(this.name + " hunted " + prey.getName());

    }
}
