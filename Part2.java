
/**
 * Write a description of Part2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Part2 {
    public int howMany(String stringa, String stringb){
        int count = 0;
        int first = stringb.indexOf(stringa);
        if (first > -1) {
            count += 1;
        while (stringb.indexOf(stringa, first) != -1 && first != -1) {
            count +=1;
            first = stringb.indexOf(stringa, first+stringa.length());
        }
        count = count -1;
        }
        else {
            count=0;
        }
        return count;
    }
    
    public void testHowMany(){
        String stringa = "ATGAAATAGATGAACC";
        String stringb = "CD";
        howMany(stringa,stringb);
        if (howMany(stringa,stringb) == 0) {
            System.out.println("No occurrence was found");
        }
        else{
            System.out.println("Last Count is: " + howMany(stringa,stringb));
        }
        stringa = "AA";
        stringb = "ATAAAA";
        howMany(stringa,stringb);
        if (howMany(stringa,stringb) == 0) {
            System.out.println("No occurrence was found");
        }
        else{
            System.out.println("Last Count is: " + howMany(stringa,stringb));
        }
        stringa = "AA";
        stringb = "ATABTA";
        howMany(stringa,stringb);
        if (howMany(stringa,stringb) == 0) {
            System.out.println("No occurrence was found");
        }
        else{
            System.out.println("Last Count is: " + howMany(stringa,stringb));
        }
        stringa = "GAA";
        stringb = "ATGAACGAATTGAATC";
        howMany(stringa,stringb);
        if (howMany(stringa,stringb) == 0) {
            System.out.println("No occurrence was found");
        }
        else{
            System.out.println("Last Count is: " + howMany(stringa,stringb));
        }
        }
}


    
    
    
   
