package com.smu.mscda;

import org.junit.Test;

import static com.smu.mscda.App.GenerateCapital;
import static com.smu.mscda.App.capitalizeAndGenerateMD5;
import static org.junit.Assert.*;

public class StringProcessorTest {

    @Test
    public void testCapitalizeAndGenerateMD5() {
        // Test hex string
        String result = capitalizeAndGenerateMD5("hello");
        assertEquals("8b1a9953c4611296a827abf8c47804d7", result);
    }

    @Test
    public void testGenerateCapital() {
        assertEquals("Deepakk", GenerateCapital("deepakk"));
    }
}
