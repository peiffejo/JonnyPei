public class Sonderzeichen {
    
    public String[] translate(String sentence[]) {
        String replacedString[] = sentence;
        for(int i = 0; i<sentence.length; i++){
        replacedString[i] = sentence[i].replace("ä", "\u00e4");
        sentence[i] = replacedString[i].replace("Ä", "\u00c4");
        replacedString[i] = sentence[i].replace("ö", "\u00f6");
        sentence[i] = replacedString[i].replace("Ö", "\u00d6");
        replacedString[i] = sentence[i].replace("ü", "\u00fc");
        sentence[i] = replacedString[i].replace("Ü", "\u00dc");
        replacedString[i] = sentence[i].replace("ß", "\u00df");
        }


return replacedString;
/* 

        for(int i=0; i<sentence[i].length(); i++){
            if(sentence[i].charAt(i) == ('ä')){
                
            }
            if(sentence[i].charAt(i) == ('Ä')){

            }
            if(sentence[i].charAt(i) == ('ö')){

            }
            if(sentence[i].charAt(i) == ('Ö')){

            }
            if(sentence[i].charAt(i) == ('ü')){

            }
            if(sentence[i].charAt(i) == ('Ü')){

            }
            if(sentence[i].charAt(i) == ('ß')){

            }
        }*/
    }
}
