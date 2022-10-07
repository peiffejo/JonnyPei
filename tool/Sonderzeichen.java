package tool;
public class Sonderzeichen {
    
    public String[] translateArray(String sentence[]) {
        String replacedString[] = sentence;
        for(int i = 0;i < sentence.length; i++){
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

        for(int0;sentence.length();+){
            if(sentence.charAt == ('ä')){
                
            }
            if(sentence.charAt == ('Ä')){

            }
            if(sentence.charAt == ('ö')){

            }
            if(sentence.charAt == ('Ö')){

            }
            if(sentence.charAt == ('ü')){

            }
            if(sentence.charAt == ('Ü')){

            }
            if(sentence.charAt == ('ß')){

            }
        }*/
    }
    public String translateString(String sentence){
        String replacedString = sentence;
        replacedString = sentence.replace("ä", "\u00e4");
        sentence = replacedString.replace("Ä", "\u00c4");
        replacedString = sentence.replace("ö", "\u00f6");
        sentence = replacedString.replace("Ö", "\u00d6");
        replacedString = sentence.replace("ü", "\u00fc");
        sentence = replacedString.replace("Ü", "\u00dc");
        replacedString = sentence.replace("ß", "\u00df");
        return replacedString;
    }
}
