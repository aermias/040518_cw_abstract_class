package abdemo;

public class Panther extends Feline {
    public Panther(String name) {
        super(name);
    }

    String eat() {
        return "a panther eat rabbits";
    }

    String makeNoise() {
        return "purrr";
    }
}
