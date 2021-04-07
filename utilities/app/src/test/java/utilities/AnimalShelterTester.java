package utilities;

import org.junit.Test;
import org.junit.*;

public class AnimalShelterTester {

    @Test public void shelterTest(){
        AnimalShelter kitsAndPups = new AnimalShelter();
        Animal marko = new Animal("cat");
        Animal jeff = new Animal("dog");
        Animal josie = new Animal("dog");
        Animal julie = new Animal("cat");
        kitsAndPups.enQueue(marko);
        kitsAndPups.enQueue(jeff);
        kitsAndPups.enQueue(josie);
        kitsAndPups.enQueue(julie);
        System.out.println(kitsAndPups.Cats.front.value);






    }
}
