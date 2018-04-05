package abdemo;

public class Dog extends Canine {
    public Dog(String name) {
        super(name);
    }

    String eat() {
        return "a dog eats dog food";
    }

    String makeNoise() {
        return "woof";
    }
}
