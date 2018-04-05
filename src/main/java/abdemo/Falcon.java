package abdemo;

public class Falcon extends Bird {
    public Falcon(String name) {
        super(name);
    }

    String eat() {
        return "a falcon eats pigeons";
    }

    String makeNoise() {
        return "hawww";
    }
}
