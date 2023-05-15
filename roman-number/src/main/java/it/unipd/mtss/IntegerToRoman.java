////////////////////////////////////////////////////////////////////
// Zhen Wei Zheng 1229141
// Jude Vensil Braceros 2011068
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

public class IntegerToRoman {

    private static String convertCentinaia(int centinaia){
        switch (centinaia)
        {
            case 1:
                return "C";
                
            case 2:
                return "CC";
                
            case 3:
            return "CCC";
                
            case 4:
            return "CD";
                
            case 5:
            return "D";
                
            case 6:
            return "DC";
                
            case 7:
            return "DCC";
                
            case 8:
            return "DCCC";
                
            case 9:
            return "CM";
            default:
                return "";
        }
    }

    private static String convertDecine(int decine){
        switch (decine)
        {
            case 1:
                return "X";
                
            case 2:
                return "XX";
                
            case 3:
                return "XXX";
                
            case 4:
                return "XL";
                
            case 5:
                return "L";
                
            case 6:
                return "LX";
                
            case 7:
                return "LXX";
                
            case 8:
                return "LXXX";
                
            case 9:
                return "XC";
            default:
                return "";
        }
    }

    private static String convertUnita(int unita){
        switch (unita)
        {
            case 1:
                return "I";
                
            case 2:
                return "II";
                
            case 3:
                return "III";
                
            case 4:
                return "IV";
                
            case 5:
                return "V";
                
            case 6:
                return "VI";
                
            case 7:
                return "VII";
                
            case 8:
                return "VIII";
                
            case 9:
                return "IX";
            default:
                return "";    
        }
    }
    public static String convert(int value){
        if (value==1000) {
            return "M";
        }


        int unita;
        int decine;
        int centinaia;

        centinaia=value/100;
        decine=(value-(centinaia*100))/10;
        unita=(value-(centinaia*100)-(decine*10));
        

        

        
        return 
        convertCentinaia(centinaia)+
        convertDecine(decine)+
        convertUnita(unita);
    }
}
