////////////////////////////////////////////////////////////////////
// Zhen Wei Zheng 1229141
// Jude Vensil Braceros 2011068
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

public class IntegerToRoman {
    public static String convert(int value){
        String[] thousands = {"", "M", "MM", "MMM"};  
        String[] hundreds = {"", "C", "CC", "CCC",
         "CD", "D", "DC", "DCC", "DCCC", "CM"};  
        String[] tens = {"", "X", "XX", "XXX", "XL",
         "L", "LX", "LXX", "LXXX", "XC"};  
        String[] units = {"", "I", "II", "III", "IV", "V", 
        "VI", "VII", "VIII", "IX"};  
        if (value==1000) {
            return "M";
        }
        if (value<0 && value>1000){
            return "";
        }

        return thousands[value / 1000] + 
        hundreds[(value % 1000) / 100] + 
        tens[(value % 100) / 10] + 
        units[value % 10];  
    }
}
