package abdemo;

public abstract class Animal {
    protected String name;
    abstract String eat();
    abstract String makeNoise();

    protected Animal(String name) {
        this.name = name;
    }
}
