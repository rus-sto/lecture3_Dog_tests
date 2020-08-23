package by.jrr.ruslan.dog.bean;

import org.junit.Test;

import static org.junit.Assert.*;

public class DogTest {

    @Test
    public void getName() {
        Dog dog = new Dog("Barry", 5, "black");
        String expected = "Barry";
        String actual = dog.getName();
        assertEquals(expected, actual);
    }



    @Test
    public void getAge() {
        Dog dog = new Dog();
        dog.setName("Barry");
        dog.setAge(5);
        dog.setColor("black");
        int expected = 5;
        int actual = dog.getAge();
        assertEquals(expected, actual);
    }



    @Test
    public void getColor() {
        Dog dog = new Dog();
        dog.setName("Barry");
        dog.setAge(5);
        dog.setColor("black");
        String expected = "black";
        String  actual = dog.getColor();
        assertEquals(expected, actual);
    }


    @Test
    public void testEqualsTrue() {
        Dog dog1 = new Dog("Barry", 5, "black");
        Dog dog2 = new Dog("Barry", 5, "black");
        boolean expected = true;
        boolean actual = dog1.equals(dog2);
        assertEquals(expected, actual);
    }
    @Test
    public void testEqualsFalse() {
        Dog dog1 = new Dog("Barry", 6, "black");
        Dog dog2 = new Dog("Barry", 5, "black");
        boolean expected = false;
        boolean actual = dog1.equals(dog2);
        assertEquals(expected, actual);
    }

    @Test
    public void testHashCode() {
        Dog dog = new Dog("Barry", 5, "black");
        int expected = 1425371123;
        int actual =dog.hashCode();
        assertEquals(expected, actual);
    }

    @Test
    public void testToString() {
        Dog dog = new Dog("Barry", 5, "black");
        String expected ="Dog{name='Barry', age=5, color='black'}" ;
        String actual = dog.toString();
        assertEquals(expected, actual);
    }
}