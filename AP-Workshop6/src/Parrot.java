public class Parrot extends Bird implements Prey{
    private String feature;
    public Parrot(String name, String age, String flyHeight, String feature) {
        super(name, age, flyHeight);
        this.feature = feature;
    }

    public String getFeature() {
        return feature;
    }
    @Override
    public void show (){
        System.out.println("name: " + name + ", age: " + age + ", high of fly : " + flyHeight + ", " + feature);
    }
    public String getName(){
        return this.name;
    }
}
