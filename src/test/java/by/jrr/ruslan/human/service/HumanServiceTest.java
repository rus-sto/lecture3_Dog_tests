package by.jrr.ruslan.human.service;

import by.jrr.ruslan.human.bean.Human;
import org.junit.Test;

import static org.junit.Assert.*;

public class HumanServiceTest {

    @Test
    public void  greet() {
        HumanService humanService=new HumanService();
        humanService.greet();
        String expected = "Hi, my name - Mike, I'm 15 years old";
        String actual = humanService.greet();
        assertEquals(expected, actual);
    }
}