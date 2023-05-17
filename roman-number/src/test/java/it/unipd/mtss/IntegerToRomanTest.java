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
    public void testConvertZero(){
        assertEquals(IntegerToRoman.convert(0),"");

        try(MockedStatic<IntegerToRoman> converter = 
        Mockito.mockStatic(IntegerToRoman.class)) {
            converter.when(() -> IntegerToRoman.convert(0))
            .thenReturn("");
            assertEquals(IntegerToRoman.convert(0),"");
        }

        assertEquals(IntegerToRoman.convert(0),"");
    }

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
    public void testConvertFour(){
        assertEquals(IntegerToRoman.convert(4),"IV");

        try(MockedStatic<IntegerToRoman> converter = 
        Mockito.mockStatic(IntegerToRoman.class)) {
            converter.when(() -> IntegerToRoman.convert(4))
            .thenReturn("IV");
            assertEquals(IntegerToRoman.convert(4),"IV");
        }

        assertEquals(IntegerToRoman.convert(4),"IV");
    }

    @Test
    public void testConvertSix(){
        assertEquals(IntegerToRoman.convert(6),"VI");

        try(MockedStatic<IntegerToRoman> converter = 
        Mockito.mockStatic(IntegerToRoman.class)) {
            converter.when(() -> IntegerToRoman.convert(6))
            .thenReturn("VI");
            assertEquals(IntegerToRoman.convert(6),"VI");
        }

        assertEquals(IntegerToRoman.convert(6),"VI");
    }
    
    @Test
    public void testConvertNine(){
        assertEquals(IntegerToRoman.convert(9),"IX");

        try(MockedStatic<IntegerToRoman> converter = 
        Mockito.mockStatic(IntegerToRoman.class)) {
            converter.when(() -> IntegerToRoman.convert(9))
            .thenReturn("IX");
            assertEquals(IntegerToRoman.convert(9),"IX");
        }

        assertEquals(IntegerToRoman.convert(9),"IX");
    }

    @Test
    public void testConvert(){
        assertEquals(IntegerToRoman.convert(11),"XI");

        try(MockedStatic<IntegerToRoman> converter = 
        Mockito.mockStatic(IntegerToRoman.class)) {
            converter.when(() -> IntegerToRoman.convert(11))
            .thenReturn("XI");
            assertEquals(IntegerToRoman.convert(11),"XI");
        }

        assertEquals(IntegerToRoman.convert(11),"XI");
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

    @Test
    public void testConvertLongestString(){
        assertEquals(IntegerToRoman.convert(888),"DCCCLXXXVIII");

        try(MockedStatic<IntegerToRoman> converter = 
        Mockito.mockStatic(IntegerToRoman.class)) {
            converter.when(() -> IntegerToRoman.convert(888))
            .thenReturn("DCCCLXXXVIII");
            assertEquals(IntegerToRoman.convert(888),"DCCCLXXXVIII");
        }

        assertEquals(IntegerToRoman.convert(888),"DCCCLXXXVIII");
    }

    @Test
    public void testConvertMoreThanThousand(){
        assertEquals(IntegerToRoman.convert(1001),"MI");

        try(MockedStatic<IntegerToRoman> converter = 
        Mockito.mockStatic(IntegerToRoman.class)) {
            converter.when(() -> IntegerToRoman.convert(1001))
            .thenReturn("MI");
            assertEquals(IntegerToRoman.convert(1001),"MI");
        }

        assertEquals(IntegerToRoman.convert(1001),"MI");
    }
    
}
