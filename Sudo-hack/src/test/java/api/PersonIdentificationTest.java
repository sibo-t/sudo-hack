package api;

import api.identification.PersonIdentification;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonIdentificationTest {

    @Test
    void getNAME() {
        PersonIdentification sam = new PersonIdentification("Samantha", "Mxeke","89827623763",33);
        String name = sam.getNAME();
        assertEquals("Samantha", name);
    }

    @Test
    void getSURNAME() {
        PersonIdentification sam = new PersonIdentification("Samantha", "Mxeke","89827623763",33);
        String surname = sam.getSURNAME();
        assertEquals("Mxeke", surname);
    }

    @Test
    void getID() {
        PersonIdentification sam = new PersonIdentification("Samantha", "Mxeke","89827623763",33);
        String id = sam.getID();
        assertEquals("89827623763", id);
    }

    @Test
    void getAge() {
        PersonIdentification sam = new PersonIdentification("Samantha", "Mxeke","89827623763",33);
        Integer age = sam.getAge();
        assertEquals(33, age);
    }
}