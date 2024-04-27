package ar.edu.utn.frc.tup.lciii;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.InputMismatchException;

import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    private final InputStream systemIn = System.in;
    private final PrintStream systemOut = System.out;

    private ByteArrayInputStream testIn;
    private ByteArrayOutputStream testOut;

    @BeforeEach
    public void setUpOutput() {
        testOut = new ByteArrayOutputStream();
        System.setOut(new PrintStream(testOut));
    }

    @AfterEach
    public void restoreSystemInputOutput() {
        System.setIn(systemIn);
        System.setOut(systemOut);
    }

    @Test
    public void testCase1() {
        final String testString = "true" + System.lineSeparator() +
                "false" + System.lineSeparator();
        final String testOutput = "true" + System.lineSeparator() +
                "false" + System.lineSeparator() +
                "false" + System.lineSeparator() +
                "true" + System.lineSeparator() +
                "false" + System.lineSeparator() +
                "true" + System.lineSeparator();
        provideInput(testString);
        App.main(new String[0]);
        assertEquals(testOutput, getOutput());
    }

    @Test
    public void testCase2() {
        final String testString = "true" + System.lineSeparator() +
                "true" + System.lineSeparator();
        final String testOutput = "true" + System.lineSeparator() +
                "true" + System.lineSeparator() +
                "false" + System.lineSeparator() +
                "false" + System.lineSeparator() +
                "true" + System.lineSeparator() +
                "true" + System.lineSeparator();
        provideInput(testString);
        App.main(new String[0]);
        assertEquals(testOutput, getOutput());
    }

    @Test
    public void testCase3() {
        final String testString = "false" + System.lineSeparator() +
                "false" + System.lineSeparator();
        final String testOutput = "false" + System.lineSeparator() +
                "false" + System.lineSeparator() +
                "true" + System.lineSeparator() +
                "true" + System.lineSeparator() +
                "false" + System.lineSeparator() +
                "false" + System.lineSeparator();
        provideInput(testString);
        App.main(new String[0]);
        assertEquals(testOutput, getOutput());
    }

    @Test
    public void testCase4() {
        final String testString = "verdadero" + System.lineSeparator() +
                "falso" + System.lineSeparator();
        provideInput(testString);
        assertThrows(InputMismatchException.class, () ->
            App.main(new String[0]));
    }

    @Test
    public void testCase5() {
        final String testString = "FALSE" + System.lineSeparator() +
                "False" + System.lineSeparator();
        final String testOutput = "false" + System.lineSeparator() +
                "false" + System.lineSeparator() +
                "true" + System.lineSeparator() +
                "true" + System.lineSeparator() +
                "false" + System.lineSeparator() +
                "false" + System.lineSeparator();
        provideInput(testString);
        App.main(new String[0]);
        assertEquals(testOutput, getOutput());
    }

    private void provideInput(String data) {
        testIn = new ByteArrayInputStream(data.getBytes());
        System.setIn(testIn);
    }

    private String getOutput() {
        return testOut.toString();
    }
}
