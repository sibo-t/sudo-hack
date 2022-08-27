package api;

import api.identification.IncomeClass;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IncomeClassTest {

    @Test
    void getIdNumber() {
        IncomeClass larry = new IncomeClass("8982423423","1");
        assertEquals("8982423423", larry.getIdNumber());
    }

    @Test
    void getIncomeLevel() {
        IncomeClass larry = new IncomeClass("8982423423","1");
        assertEquals("poor", larry.getIncomeLevel());
    }

    @Test
    void getIncomeLevelLower() {
        IncomeClass larry = new IncomeClass("8982423423","2");
        assertEquals("lower-middle", larry.getIncomeLevel());
    }

    @Test
    void getIncomeLevelUpper() {
        IncomeClass larry = new IncomeClass("8982423423","3");
        assertEquals("upper-middle", larry.getIncomeLevel());
    }

    @Test
    void getIncomeLevelAffluent() {
        IncomeClass larry = new IncomeClass("8982423423","4");
        assertEquals("affluent", larry.getIncomeLevel());
    }
}