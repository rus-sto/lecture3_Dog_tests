package by.jrr.ruslan.human.bean;

import org.junit.Test;

import static org.junit.Assert.*;

public class HumanTest {

    @Test
    public void getName() {
        Human human=new Human();
        human.setName("Mike");
        human.setAge(15);
        String expected = "Mike";
        String actual = human.getName();
        assertEquals(expected, actual);
    }

    @Test
    public void getAge() {
        Human human=new Human();
        human.setName("Mike");
        human.setAge(15);
        int expected = 15;
        int actual = human.getAge();
        assertEquals(expected, actual);
    }

    @Test
    public void testEqualsTrue() {
        Human human1=new Human();
        human1.setName("Mike");
        human1.setAge(15);
        Human human2=new Human();
        human2.setName("Mike");
        human2.setAge(15);
        boolean expected = true;
        boolean actual = human1.equals(human2);
        assertEquals(expected, actual);
    }
    @Test
    public void testEqualsFalse() {
        Human human1=new Human();
        human1.setName("Mike");
        human1.setAge(15);
        Human human2=new Human();
        human2.setName("Mike");
        human2.setAge(16);
        boolean expected = false;
        boolean actual = human1.equals(human2);
        assertEquals(expected, actual);
    }
    @Test
    public void testHashCode() {
        Human human=new Human();
        human.setName("Mike");
        human.setAge(15);
        int expected = 74346106;
        int actual = human.hashCode();
        assertEquals(expected, actual);
    }

    @Test
    public void testToString() {
        Human human=new Human();
        human.setName("Mike");
        human.setAge(15);
        String expected = "Human{name='Mike', age=15}";
        String actual = human.toString();
        assertEquals(expected, actual);
    }
}