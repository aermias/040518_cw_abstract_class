package abdemo;

public class Cheetah extends Feline {
    public Cheetah(String name) {
        super(name);
    }

    String eat() {
        return "a cheetah eats gazelle";
    }

    String makeNoise() {
        return "purrr";
    }
}
