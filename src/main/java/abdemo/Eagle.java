package abdemo;

public class Eagle extends Bird {
    public Eagle(String name) {
        super(name);
    }

    String eat() {
        return "an eagle eats fish";
    }

    String makeNoise() {
        return "hawww";
    }
}
