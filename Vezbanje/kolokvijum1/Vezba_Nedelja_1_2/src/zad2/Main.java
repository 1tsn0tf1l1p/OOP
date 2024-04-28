package zad2;

public class Main {
    public static void main(String[] args) {

        Dog d1 = new Dog("Pedja", "Labrador");
        Dog d2 = new Dog("Marko", "Doberman");

        d1.setName("Zoran");

        d2.setBreed("Rotvajler");

        System.out.println(d1.getName()+" "+ d1.getBreed());
        System.out.println(d2.getName()+" "+ d2.getBreed());

    }

}
