package by.jrr.ruslan.encoder.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class EncoderServiceTest {

    @Test
    public void decode() {
        EncoderService encoderService = new EncoderService();
        String expected = "A => 65";

        String actual=encoderService.decode('A');
        assertEquals(expected,actual);
    }

    @Test
    public void encode() {
        EncoderService encoderService = new EncoderService();
        String expected = "66 => B";
        String actual = encoderService.encode(66);
        assertEquals(expected,actual);
    }

}