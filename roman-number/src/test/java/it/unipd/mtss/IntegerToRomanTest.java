package it.unipd.mtss;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;
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
    


}
