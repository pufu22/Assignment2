package it.unipd.mtss;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RomanPrinterTest {

    @Test
    public void testPrintZero() {
        StringBuilder three = new StringBuilder();
        assertEquals(three.toString(), RomanPrinter.print(0));
    }
    

    @Test
    public void testPrintThree() {
        StringBuilder three = new StringBuilder();
        three.append("  _____ \n");
        three.append(" |_   _|\n");
        three.append("   | |  \n");
        three.append("   | |  \n");
        three.append("  _| |_ \n");
        three.append(" |_____|\n");
        three.append("  _____ \n");
        three.append(" |_   _|\n");
        three.append("   | |  \n");
        three.append("   | |  \n");
        three.append("  _| |_ \n");
        three.append(" |_____|\n");
        three.append("  _____ \n");
        three.append(" |_   _|\n");
        three.append("   | |  \n");
        three.append("   | |  \n");
        three.append("  _| |_ \n");
        three.append(" |_____|\n");
        assertEquals(three.toString(), RomanPrinter.print(3));
    }

    @Test
    public void testPrintThousand() {
        StringBuilder thousand = new StringBuilder();
        thousand.append("  __  __ \n");
        thousand.append(" |  \\/  |\n");
        thousand.append(" | |\\/| |\n");
        thousand.append(" | |  | |\n");
        thousand.append(" | |  | |\n");
        thousand.append(" |_|  |_|\n");
        assertEquals(thousand.toString(), RomanPrinter.print(1000));
    }

    @Test
    public void testPrintAllLetters() {
        StringBuilder result = new StringBuilder();
        result.append("  _____  \n");
        result.append(" |  __ \\ \n");
        result.append(" | |  | |\n");
        result.append(" | |  | |\n");
        result.append(" | |__| |\n");
        result.append(" |_____/ \n");
        result.append("   _____ \n");
        result.append("  / ____|\n");
        result.append(" | |     \n");
        result.append(" | |     \n");
        result.append(" | |____ \n");
        result.append("  \\_____|\n");
        result.append("  _      \n");
        result.append(" | |     \n");
        result.append(" | |     \n");
        result.append(" | |     \n");
        result.append(" | |____ \n");
        result.append(" |______|\n");
        result.append(" __   __\n");
        result.append(" \\ \\ / /\n");
        result.append("  \\ V / \n");
        result.append("   > <  \n");
        result.append("  / . \\ \n");
        result.append(" /_/ \\_\\\n");
        result.append("  _____ \n");
        result.append(" |_   _|\n");
        result.append("   | |  \n");
        result.append("   | |  \n");
        result.append("  _| |_ \n");
        result.append(" |_____|\n");
        result.append(" __      __\n");
        result.append(" \\ \\    / /\n");
        result.append("  \\ \\  / / \n");
        result.append("   \\ \\/ /  \n");
        result.append("    \\  /   \n");
        result.append("     \\/    \n");
        assertEquals(result.toString(), RomanPrinter.print(664));
    }

    @Test
    public void testPrintLongestString() {
        StringBuilder result = new StringBuilder();
        result.append("  _____  \n");
        result.append(" |  __ \\ \n");
        result.append(" | |  | |\n");
        result.append(" | |  | |\n");
        result.append(" | |__| |\n");
        result.append(" |_____/ \n");
        result.append("   _____ \n");
        result.append("  / ____|\n");
        result.append(" | |     \n");
        result.append(" | |     \n");
        result.append(" | |____ \n");
        result.append("  \\_____|\n");
        result.append("   _____ \n");
        result.append("  / ____|\n");
        result.append(" | |     \n");
        result.append(" | |     \n");
        result.append(" | |____ \n");
        result.append("  \\_____|\n");
        result.append("   _____ \n");
        result.append("  / ____|\n");
        result.append(" | |     \n");
        result.append(" | |     \n");
        result.append(" | |____ \n");
        result.append("  \\_____|\n");
        result.append("  _      \n");
        result.append(" | |     \n");
        result.append(" | |     \n");
        result.append(" | |     \n");
        result.append(" | |____ \n");
        result.append(" |______|\n");
        result.append(" __   __\n");
        result.append(" \\ \\ / /\n");
        result.append("  \\ V / \n");
        result.append("   > <  \n");
        result.append("  / . \\ \n");
        result.append(" /_/ \\_\\\n");
        result.append(" __   __\n");
        result.append(" \\ \\ / /\n");
        result.append("  \\ V / \n");
        result.append("   > <  \n");
        result.append("  / . \\ \n");
        result.append(" /_/ \\_\\\n");
        result.append(" __   __\n");
        result.append(" \\ \\ / /\n");
        result.append("  \\ V / \n");
        result.append("   > <  \n");
        result.append("  / . \\ \n");
        result.append(" /_/ \\_\\\n");
        result.append(" __      __\n");
        result.append(" \\ \\    / /\n");
        result.append("  \\ \\  / / \n");
        result.append("   \\ \\/ /  \n");
        result.append("    \\  /   \n");
        result.append("     \\/    \n");
        result.append("  _____ \n");
        result.append(" |_   _|\n");
        result.append("   | |  \n");
        result.append("   | |  \n");
        result.append("  _| |_ \n");
        result.append(" |_____|\n");
        result.append("  _____ \n");
        result.append(" |_   _|\n");
        result.append("   | |  \n");
        result.append("   | |  \n");
        result.append("  _| |_ \n");
        result.append(" |_____|\n");
        result.append("  _____ \n");
        result.append(" |_   _|\n");
        result.append("   | |  \n");
        result.append("   | |  \n");
        result.append("  _| |_ \n");
        result.append(" |_____|\n");
        assertEquals(result.toString(), RomanPrinter.print(888));
    }

}
