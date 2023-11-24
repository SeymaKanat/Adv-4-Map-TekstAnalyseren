package nl.miwgroningen.se.start.model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/**
 * @author Seyma Kanat <s.kanat@st.hanze.nl>
 * Purpose of the program
 */
public class Vakken {
    Map<String, Integer> vakMap = new HashMap<String,Integer>();

    public Vakken() {
        super();
    }
    public void readFromFile(String filename) throws FileNotFoundException {
        File sourceFile = new File(filename);
        try(Scanner sourceReader = new Scanner(new File(filename))){
            while(sourceReader.hasNext()){
                String vakcode = sourceReader.next();
                int ects = sourceReader.nextInt();
                vakMap.put(vakcode, ects);
            }

        }

    }
    public Map<String, Integer> getVakMap() {
        return vakMap;
    }
    public void printAlleVakcodes() {
        System.out.println("Lijst van alle vakcodes:");
        for (String vakcode : vakMap.keySet()) {
            System.out.println(vakcode);
        }
    }

    public void printAlleECTSWaardes() {
        System.out.println("Lijst van alle ECTS waardes:");
        for (int ects : vakMap.values()) {
            System.out.println(ects);
        }
    }

    public void printSomAlleECTS(){
        int som = 0;
        for (int ects : vakMap.values()) {
            som += ects;
        }
        System.out.println("Som van alle ECTS waardes: " + som);
    }

    public void printKeyValuePairs() {
        System.out.println("Key-Value paren:");
        for (Map.Entry<String, Integer> entry : vakMap.entrySet()) {
            System.out.println("(" + entry.getKey() + ", " + entry.getValue() + ")");
        }
        System.out.println();
    }

    public void printGesorteerdOpVakcodes() {
        System.out.println("Vakcodes en ECTS, gesorteerd op vakcodes:");
        List<String> sortedVakcodes = new ArrayList<>(vakMap.keySet());
        Collections.sort(sortedVakcodes);
        for (String vakcode : sortedVakcodes) {
            System.out.println(vakcode + ": " + vakMap.get(vakcode));
        }
        System.out.println();
    }








}

