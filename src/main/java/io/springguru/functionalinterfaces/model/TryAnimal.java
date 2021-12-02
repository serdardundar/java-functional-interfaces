package io.springguru.functionalinterfaces.model;

public class TryAnimal {

    public static void main(String[] args) {
        Animal tiger = sound -> "Tiger " + sound;
        Animal dog = sound -> "Dog " + sound;
        Animal cat = sound -> "Cat " + sound;

        System.out.println(tiger.cry("roars"));
        System.out.println(dog.cry("barks"));
        System.out.println(cat.cry("meows"));
    }
}
