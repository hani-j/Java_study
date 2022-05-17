<<<<<<< HEAD
package week3.subject4.ex3;

import java.util.ArrayList;

public class AnimalTest {
    public static void main(String[] args) {
        Animal hAnimal = new Human();
        Animal tAnimal = new Tiger();
        Animal eAnimal = new Eagle();
        AnimalTest test = new AnimalTest();
        test.moveAnimal(hAnimal);
        test.moveAnimal(tAnimal);
        test.moveAnimal(eAnimal);
        ArrayList<Animal> animalList = new ArrayList<Animal>();
        animalList.add(hAnimal);
        animalList.add(tAnimal);
        animalList.add(eAnimal);
        for(Animal animal : animalList) {
            animal.move();
        }
    }
    public void moveAnimal(Animal animal) {
        animal.move();
    }
}
=======
package week3.subject4.ex3;

import java.util.ArrayList;

public class AnimalTest {
    public static void main(String[] args) {
        Animal hAnimal = new Human();
        Animal tAnimal = new Tiger();
        Animal eAnimal = new Eagle();
        AnimalTest test = new AnimalTest();
        test.moveAnimal(hAnimal);
        test.moveAnimal(tAnimal);
        test.moveAnimal(eAnimal);
        ArrayList<Animal> animalList = new ArrayList<Animal>();
        animalList.add(hAnimal);
        animalList.add(tAnimal);
        animalList.add(eAnimal);
        for(Animal animal : animalList) {
            animal.move();
        }
    }
    public void moveAnimal(Animal animal) {
        animal.move();
    }
}
>>>>>>> cdc1ad2d2b62ce326919794251ba36959e4a6689
