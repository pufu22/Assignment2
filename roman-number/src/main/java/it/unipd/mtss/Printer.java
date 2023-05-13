package it.unipd.mtss;

public class Printer {
    public static String print(int num){
        return printAsciiArt(Converter.convert(num));
        }
    /**
     * @param romanNumber
     * @return
     */
    private static String printAsciiArt(String romanNumber) {
        StringBuilder result = new StringBuilder();
        // Cicla su ogni carattere del numero romano
        for (int i = 0; i < romanNumber.length(); i++) {
            char c = romanNumber.charAt(i);
            // Aggiungi l'ASCII art corrispondente al carattere
            switch (c) {
                case 'I':
                    result.append("  _____ \n");
                    result.append(" |_   _|\n");
                    result.append("   | |  \n");
                    result.append("   | |  \n");
                    result.append("  _| |_ \n");
                    result.append(" |_____|\n");
                    break;
                case 'V':
                    result.append(" __      __\n");
                    result.append(" \\ \\    / /\n");
                    result.append("  \\ \\  / / \n");
                    result.append("   \\ \\/ /  \n");
                    result.append("    \\  /   \n");
                    result.append("     \\/    \n");
                    break;
                case 'X':
                    result.append(" __   __\n");
                    result.append(" \\ \\ / /\n");
                    result.append("  \\ V / \n");
                    result.append("   > <  \n");
                    result.append("  / . \\ \n");
                    result.append(" /_/ \\_\\\n");
                    break;
                case 'L':
                    result.append("  _      \n");
                    result.append(" | |     \n");
                    result.append(" | |     \n");
                    result.append(" | |     \n");
                    result.append(" | |____ \n");
                    result.append(" |______|\n");
                    break;
                case 'C':
                    result.append("   _____ \n");
                    result.append("  / ____|\n");
                    result.append(" | |     \n");
                    result.append(" | |     \n");
                    result.append(" | |____ \n");
                    result.append("  \\_____|\n");
                    break;
                case 'D':
                    result.append("  _____  \n");
                    result.append(" |  __ \\ \n");
                    result.append(" | |  | |\n");
                    result.append(" | |  | |\n");
                    result.append(" | |__| |\n");
                    result.append(" |_____/ \n");
                    break;
                case 'M':
                    result.append("  __  __ \n");
                    result.append(" |  \\/  |\n");
                    result.append(" | |\\/| |\n");
                    result.append(" | |  | |\n");
                    result.append(" | |  | |\n");
                    result.append(" |_|  |_|\n");
                    break;
                default:
                    throw new IllegalArgumentException("Invalid Roman numeral: " + c);
            }
        }
        return result.toString();
    }
    
}
