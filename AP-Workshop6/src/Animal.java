public abstract class Animal {
    protected String name;
    protected String age;

    public Animal(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public abstract void show ();
}
