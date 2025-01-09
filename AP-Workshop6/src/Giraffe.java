public class Giraffe extends Mammal implements Prey{
    private String feature;
    public Giraffe(String name, String age, String runSpeed, String feature) {
        super(name, age, runSpeed);
        this.feature = feature;
    }

    public String getFeature() {
        return feature;
    }

    public void show (){
        System.out.println("name: " + name + ", age: " + age + ", speed : " + runSpeed + ", " + feature);
    }
    public String getName(){
        return this.name;
    }
}
