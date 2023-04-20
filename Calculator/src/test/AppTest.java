package test;

import main.App;

import static org.junit.Assert.*;

import org.junit.Test;

public class AppTest {

    @Test
    public void fivePlusSixIsEleven() {
        App app = new App();

        int result = app.add(5, 6);

        assertEquals(11, result);
    }

    @Test
    public void fiveMinusSixIsNegativeOne() {
        App app = new App();

        int result = app.subtraction(5, 6);

        assertEquals(-1, result);
    }

    @Test
    public void fiveMultiplySixIsThirty() {
        App app = new App();

        int result = app.multiplication(5, 6);

        assertEquals(30, result);
    }

    @Test
    public void sixDivideTwoIsThree() {
        App app = new App();

        int result = app.division(6, 2);

        assertEquals(3, result);
    }

    @Test
    public void fiveModuloTwoIsOne() {
        App app = new App();

        int result = app.modulo(5, 2);

        assertEquals(1, result);
    }

}
