package abdemo;

public class Wolf extends Canine {
    public Wolf(String name) {
        super(name);
    }

    String eat() {
        return "a wolf eats deer";
    }

    String makeNoise() {
        return "howl";
    }
}
