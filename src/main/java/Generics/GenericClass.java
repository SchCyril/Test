package Generics;

import java.util.ArrayList;

public class GenericClass {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Cat cat = new Cat();

//        System.out.println(animal);
//        System.out.println(cat);

        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Animal());
        animals.add(new Animal());
        animals.add(new Animal());
        animals.add(new Animal());

        ArrayList<Cat> cats = new ArrayList<>();
        cats.add(new Cat());
        cats.add(new Cat());
        cats.add(new Cat());

        ArrayList<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog());
        dogs.add(new Dog());
        dogs.add(new Dog());

        list(animals);
//        list(cats);
        list(dogs);
    }

    public static void list(ArrayList<? super Dog> animals) {
        for (Object animal: animals) {
            System.out.println(animal);
        }
    }
}
