package com.eduardo.greeting;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * @author EduardoGiacomini <carloseduardo.diasgiacomini@gmail.com>
 *
 */
public class GreetingTest {
    private Greeting greetingResponder;

    public GreetingTest() {
        this.greetingResponder = new Greeting();
    }

    @Test
    public void shouldAnswerWithGoodMorning() {
        String greeting = this.greetingResponder.getGreeting(6);
        assertEquals("Good Morning", greeting);
    }

    @Test
    public void shouldAnswerWithGoodAfternoon() {
        String greeting = this.greetingResponder.getGreeting(13);
        assertEquals("Good Afternoon", greeting);
    }

    @Test
    public void shouldAnswerWithGoodNight() {
        String greeting = this.greetingResponder.getGreeting(22);
        assertEquals("Good Night", greeting);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldAnswerWithIllegalArgumentException() {
        this.greetingResponder.getGreeting(25);
    }
}
