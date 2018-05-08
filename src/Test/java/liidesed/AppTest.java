package liidesed;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void bmi() {
        assertEquals(21.6,bmi(180,70),0.1);
    }
    double bmi;

    private double bmi(int i, int i1) {
        bmi = i1/Math.pow((i/100.0), 2);
        return bmi;
    }
}