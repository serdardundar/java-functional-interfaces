package io.springguru.functionalinterfaces.model;

import java.util.function.Function;

public class AnimalFarm2 {

    public static void main(String[] args) {

        AnimalFarm2 animalFarm = new AnimalFarm2();

        class DoggyOne implements Function<String, String> {
            public String apply(String t) {
                return "Doggy One " + t;
            }
        }

        DoggyOne doggyOne = new DoggyOne();
        System.out.println(animalFarm.sayHello(doggyOne, "barks"));

    }

    public String sayHello(Function<String, String> function, String sound) {
        return function.apply(sound);
    }
}
