package io.springguru.functionalinterfaces.model;

public class AnimalFarm {

    public static void main(String[] args) {

        var animalFarm = new AnimalFarm();

        Animal tiger = sound -> "Hi, Tiger " + sound;
        System.out.println(animalFarm.sayHello(tiger, "ROARR"));
    }

    public String sayHello(Animal animal, String sound) {
        return animal.cry(sound);
    }
}
