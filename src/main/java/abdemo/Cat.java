package abdemo;

public class Cat extends Feline {
    public Cat(String name) {
        super(name);
    }

    String eat() {
        return "a cat eats fish";
    }

    String makeNoise() {
        return "meow";
    }
}