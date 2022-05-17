package week3.subject4.ex5;

import java.util.ArrayList;

public class AnimalTest {

    public static void main(String[] args) {
        Animal hAnimal = new Human();
        Animal tAnimal = new Tiger();
        Animal eAnimal = new Eagle();
        ArrayList<Animal> animalList = new ArrayList<Animal>();
        animalList.add(hAnimal);
        animalList.add(tAnimal);
        animalList.add(eAnimal);
        AnimalTest test = new AnimalTest();
        test.testDownCasting(animalList);
    }

    public void testDownCasting(ArrayList animalList) {
        for (Animal a : animalList){
            if (a instanceof Animal) {
                Animal c = (Animal)a;
            }

        }

    }
}
