package abdemo;

public class Fox extends Canine {
    public Fox(String name) {
        super(name);
    }

    String eat() {
        return "a fox eats sheep";
    }

    String makeNoise() {
        return "";
    }
}
