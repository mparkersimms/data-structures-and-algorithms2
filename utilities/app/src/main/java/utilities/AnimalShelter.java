package utilities;

import java.util.NoSuchElementException;

public class AnimalShelter {
    Queue Dogs;
    Queue Cats;
    static int rosterNumber = 0;

    public AnimalShelter() {
        Dogs = new Queue();
        Cats = new Queue();
    }


    public void enQueue(Animal animal) {
        if (animal.type.equals("dog")) {
            animal.rosterNum = rosterNumber;
            Dogs.enQueue(animal);
            rosterNumber++;
        }
        if (animal.type.equals("cat")) {
            animal.rosterNum = rosterNumber;
            Cats.enQueue(animal);
            rosterNumber++;
        }
    }
    public Object deQueue(String type) {
        if (type.equals("dog")) {
            return Dogs.deQueue();
        } else if (type.equals("cat")) {
            return Cats.deQueue();
        } else {
            throw new NoSuchElementException();
        }
    }
    public Object findSmallestRosterNumber() {
        System.out.println(Dogs.front.value);
        return Dogs.peek();

    }
    public String toString() {

        return "Dogs Queue = " + Dogs.toString() + "Cats Queue = " + Cats.toString();
    }
}
