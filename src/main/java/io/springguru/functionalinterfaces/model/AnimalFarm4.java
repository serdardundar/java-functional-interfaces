package io.springguru.functionalinterfaces.model;

import java.util.function.Function;

public class AnimalFarm4 {

    public String sayHello(Function<String, String> function, String sound) {
        return function.apply(sound);
    }

    public static void main(String[] args) {

        AnimalFarm4 animalFarm = new AnimalFarm4();

        //using Lambda Expression
        Function<String, String> doggyTwo = t -> "Doggy Three also " + t;

        System.out.println(animalFarm.sayHello(doggyTwo, "barks"));

    }
}
