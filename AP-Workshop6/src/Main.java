import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Parrot("Brazilian parrot", "10", "50", "can speak"));
        animals.add(new Parrot("green parrot", "2", "90", "eats nuts"));
        animals.add(new Eagle("Asian eagle", "8","10" , "eagle vision"));
        animals.add(new Cheetah("cheetah", "12","120" , "fastest animal"));
        animals.add(new Giraffe("giraffe", "3","5" , "tallest animal"));

        for (Animal a : animals) {
            a.show();
            Cheetah c = new Cheetah("cheetah", "11", "110", "fastest");
            c.hunt((Parrot) animals.get(0));

        }
    }
}
