
/**
 * Write a description of Part3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Part3 {
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
    
    public int countGenes(String dna)
    {
        int count=0;
        int startIndex=0;
        while(true){
            startIndex=dna.indexOf("ATG",startIndex);
            if(startIndex!=-1){
                startIndex+=3;
                count++;
            }
            else
            return count;

        }
    }
    
    public void testCountGenes()
    {
        int count=countGenes("ATGTAAGTGAATCCTAGT");
        System.out.println("The count is "+count);
    }

    public void testprintGenes(String dna){
        System.out.println("DNA strand is "+ dna);
        printGenes(dna);
    }

    public void printAll(String dna){
        int index=0;
        while(true){
            int startIndex=dna.indexOf("ATG",index);
            if(startIndex!=-1)
            System.out.println("start:" + startIndex);
            index+=startIndex+3;
            if(startIndex ==-1){
                System.out.println("");
                break;
            }
        }
    }
}
