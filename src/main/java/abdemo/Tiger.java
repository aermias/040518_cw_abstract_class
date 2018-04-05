package abdemo;

public class Tiger extends Feline {
    public Tiger(String name) {

        super(name);
    }

    String eat() {
        return "a tiger eats cattle";
    }

    String makeNoise() {
        return "rawr";
    }
}
