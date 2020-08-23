package by.jrr.ruslan.dog.service;

import by.jrr.ruslan.dog.bean.Dog;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DogServiceTest {

    @Test
    public void voiceTest() {
        Dog dog = new Dog("Barry", 5, "black");
        DogService dogService=new DogService();
        String expected = "Hau-hau";
        String actual=dogService.voice();
         assertEquals(expected, actual);

    }

    @Test
    public void eatTest() {
        DogService dogService=new DogService();
        dogService.eat();
        String expected = "Dog eat";
        String actual=dogService.eat();
        assertEquals(expected,actual);
    }


    @Test
    public void sleepTest() {
        DogService dogService=new DogService();
        dogService.sleep();
        String expected = "Dog sleep";
        String actual=dogService.sleep();
        assertEquals(expected,actual);
    }



}