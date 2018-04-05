package abdemo;

public class Main {
    public static void main(String[] args) {
        // Birds
        Dove dovey = new Dove("Dovey");
        Eagle eggo = new Eagle("Eggo");
        Falcon falco = new Falcon("Falco");

        // Canines
        Dog snoop = new Dog("Snoop");
        Fox fox = new Fox("Fox");
        Wolf wolf = new Wolf("Wolf");

        // Felines
        Cat kat = new Cat("Kat");
        Panther sassy = new Panther("Sassy");
        Tiger tigris = new Tiger("Tigris");
        Cheetah chessy = new Cheetah("Chessy");

        Animal[] animals = new Animal[]{dovey, eggo, falco, snoop, fox, wolf, kat, sassy, tigris, chessy};

        for (Animal a : animals) {
            System.out.println(a.eat());
        }
    }
}
