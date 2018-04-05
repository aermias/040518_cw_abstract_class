package abdemo;

public class Dove extends Bird {
    public Dove(String name) {
        super(name);
    }

    String eat() {
        return "a dove eats seeds";
    }

    String makeNoise() {
        return "burrr";
    }
}
