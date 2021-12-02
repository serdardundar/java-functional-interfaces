package io.springguru.functionalinterfaces.model;

import java.util.function.Function;

public class AnimalFarm3 {

    public String sayHello(Function<String, String> function, String sound) {
        return function.apply(sound);
    }

    public static void main(String[] args) {

        AnimalFarm3 animalFarm = new AnimalFarm3();

        //using Anonymous class
        Function<String, String> doggyTwo = new Function<String, String>() {
            @Override
            public String apply(String t) {
                return "Doggy Two also " + t;

            }
        };

        System.out.println(animalFarm.sayHello(doggyTwo, "barks"));

    }
}
