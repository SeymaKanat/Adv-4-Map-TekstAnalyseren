package nl.miwgroningen.se.start.model;

import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Seyma Kanat <s.kanat@st.hanze.nl>
 * Purpose of the program
 */
class VakkenTest {

    @Test
    public void test1() throws FileNotFoundException {
        Vakken vakken = new Vakken();

        vakken.readFromFile("src/main/resources/vakcodes.txt");

        int ects = vakken.getVakMap().get("CS101");

        assertEquals(6, ects);
    }
    @Test
    public void test2() throws FileNotFoundException {
        Vakken vakken = new Vakken();

        vakken.readFromFile( "src/main/resources/vakcodes.txt" );

        assertFalse(vakken.getVakMap().containsKey("CS999"), "CS999 should not be in the map");

    }

//    @Test
//    public void test3() throws FileNotFoundException {
//        Vakken vakken = new Vakken();
//
//        vakken.readFromFile( "src/main/resources/vakcodes.txt" );
//
//        assertTrue(vakken.getVakMap().containsValue("10"), "10 should be in the map");
//    }
}

