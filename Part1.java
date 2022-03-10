/**
 * Finds a protein within a strand of DNA represented as a string of c,g,t,a letters.
 * A protein is a part of the DNA strand marked by start and stop codons (DNA triples)
 * that is a multiple of 3 letters long.
 *
 * @author Duke Software Team 
 */
import edu.duke.*;
import java.io.*;

public class Part1 {
    public String findStopCodon(String dna, int startIndex, String stopCodon) {
        int currIndex = dna.indexOf("ATG");
        while (currIndex !=-1) {
          if ((currIndex - startIndex) % 3 == 0) {
              return currIndex;
            }
            else{
                currIndex=dna.indexOf(stopCodon, currIndex +1);
            }
        }
        return dna.length();
        }
   
     
        
    public String findGene (String dna) {
        int startIndex = dna.indexOf("ATG");
        if (startIndex == -1) {
            return "";
        }
        int taaIndex = findStopCodon(dna, startIndex, "TAA");
        int tagIndex = findStopCodon(dna, startIndex, "TAG");
        int tgaIndex = findStopCodon(dna, startIndex, "TGA");
        int tempIndex = Math.min(taaIndex, tagIndex);
        int finaldna = Math.min(tempIndex, tgaIndex);
        if (finaldna == dna.length()) {
            return "";
        }
        return dna.substring(startIndex, findna+3);
    }
    
     
    public void testfindGene(){
        String dna="aaaYYYAAAAJSYSHTAA";
        System.out.println("DNA strand is "+ dna);
        String gene=findGene(dna);
        System.out.println("Gene is "+ gene);

        dna="aaaaaATGTTTATATATTATATGaaa";
        System.out.println("DNA strand is "+ dna);
        gene=findGene(dna);
        System.out.println("Gene is "+ gene);

        dna="aaaaaATGTTTATATATTAATAGTGAaaa";
        System.out.println("DNA strand is "+ dna);
        gene=findGene(dna);
        System.out.println("Gene is "+ gene);

        dna="aaaaaATGaaaaaaaaaaaaaaaaaa";
        System.out.println("DNA strand is "+ dna);
        gene=findGene(dna);
        System.out.println("Gene is "+ gene);
    }
        
    public void testFindGene() {
    String dna = "aaaATGaaaaaTAGTG";
    while (true) {
        System.out.println("DNA strand is "+ dna);
        gene=findGene(dna);
        System.out.println("Gene is "+ gene);
        if (findGene(dna).length() == -1) {
                break;
            }
       
        }
    }
}
