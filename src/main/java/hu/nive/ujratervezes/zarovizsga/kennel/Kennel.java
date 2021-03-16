package hu.nive.ujratervezes.zarovizsga.kennel;

import java.util.ArrayList;
import java.util.List;

public class Kennel {

    private List<Dog> dogs = new ArrayList<>();

    public void addDog(Dog dog){
        dogs.add(dog);
    }

    public List<Dog> getDogs() {
        return dogs;
    }


    public void feedAll() {
        for (Dog dog : dogs){
            dog.feed();
        }
    }

    public Dog findByName(String name) {
        Dog result = null;
        for (Dog dog : dogs){
            if(dog.getName().equals(name)) {
                result = dog;
            }else{
                throw new IllegalArgumentException("Dog not found with this name!");
            }
        }
        return result;
    }

    public void playWith(String name, int hours) {
        for (Dog dog : dogs){
            if(dog.getName().equals(name)) {
                dog.play(hours);
            }
        }
    }

    public List<String> getHappyDogNames(int minHappiness){
        List<String> names = new ArrayList<>();
        for (Dog dog : dogs){
            if(dog.getHappiness() > minHappiness) {
                names.add(dog.getName());
            }
        }
        return names;
    }

}
