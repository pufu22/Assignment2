package it.unipd.mtss;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.validator.PublicClassValidator;
import org.mockito.MockedStatic;
import org.mockito.Mockito;

public class IntegerToRomanTest {

    @Test
    public void testConvertOne(){
        assertEquals(IntegerToRoman.convert(1),"I");

        try(MockedStatic<IntegerToRoman> converter = 
        Mockito.mockStatic(IntegerToRoman.class)) {
            converter.when(() -> IntegerToRoman.convert(1))
            .thenReturn("I");
            assertEquals(IntegerToRoman.convert(1),"I");
        }

        assertEquals(IntegerToRoman.convert(1),"I");
    }
    
    @Test 
    public void testConvertThousand(){
        assertEquals(IntegerToRoman.convert(1000),"M");

        try(MockedStatic<IntegerToRoman> converter = 
        Mockito.mockStatic(IntegerToRoman.class)) {
            converter.when(() -> IntegerToRoman.convert(1000))
            .thenReturn("M");
            assertEquals(IntegerToRoman.convert(1000),"M");
        }

        assertEquals(IntegerToRoman.convert(1000),"M");
    }

    @Test
    public void testConvertCentinaia(){
        assertEquals(IntegerToRoman.convert(100),"C");

        try(MockedStatic<IntegerToRoman> converter = 
        Mockito.mockStatic(IntegerToRoman.class)) {
            converter.when(() -> IntegerToRoman.convert(100))
            .thenReturn("C");
            assertEquals(IntegerToRoman.convert(100),"C");
        }

        assertEquals(IntegerToRoman.convert(100),"C");
    }

    @Test
    public void testConvertDecine(){
        assertEquals(IntegerToRoman.convert(10),"X");

        try(MockedStatic<IntegerToRoman> converter = 
        Mockito.mockStatic(IntegerToRoman.class)) {
            converter.when(() -> IntegerToRoman.convert(10))
            .thenReturn("X");
            assertEquals(IntegerToRoman.convert(10),"X");
        }

        assertEquals(IntegerToRoman.convert(10),"X");
    }

    
}
