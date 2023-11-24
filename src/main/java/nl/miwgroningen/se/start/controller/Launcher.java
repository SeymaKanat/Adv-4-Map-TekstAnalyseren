package nl.miwgroningen.se.start.controller;

import nl.miwgroningen.se.start.model.WordLinesMap;
import nl.miwgroningen.se.start.model.WordMap;
import nl.miwgroningen.se.start.model.WordSet;

import java.sql.SQLOutput;
import java.util.Iterator;
import java.util.List;

/**
 * @author Vincent Velthuizen <v.r.velthuizen@pl.hanze.nl>
 * <p>
 * Lees een tekst bestand in en analyseer het
 */
public class Launcher {

    public static void main(String[] args) {

//        WordLineClass
        WordLinesMap wordLinesMap = new WordLinesMap();
        wordLinesMap.readFromFile("src/main/resources/MaxHavelaar.txt");

        System.out.println("Number of unique words: " + wordLinesMap.getNrOfUniqueWords());

        System.out.println("Words in alphabetical order with line numbers:");
        for (String word : wordLinesMap.getWordsSorted()) {
            List<Integer> lineNumbers = wordLinesMap.getWordLineNrs(word);
            System.out.println(word + ": " + lineNumbers);
        }






//WordMap Class
//        WordMap wordMap = new WordMap();
//
//        wordMap.readFromFile("src/main/resources/MaxHavelaar.txt");
//
//        System.out.println("Number of unique words: " + wordMap.getNrOfUniqueWords());
//
//        System.out.println(wordMap.getNrOfUniqueWords());
//        for (String word : wordMap.getWordsSorted()) {
//            System.out.println(word);
//        }

        // Print de woorden in alfabetische volgorde met hun frequentie
//        System.out.println("Woorden in alfabetische volgorde met frequentie:");
//        Iterator<String> iterator = wordMap.getWordsSorted().iterator();
//        while (iterator.hasNext()) {
//            String word = iterator.next();
//            int count = wordMap.getWordCount(word);
//            System.out.println(word + ": " + count + " keer");
//        }

        //WordSetClass
        //        WordSet wordSet = new WordSet();
//        wordSet.readFromFile("src/main/resources/MaxHavelaar.txt");
//
//        System.out.println(wordSet.getNrOfUniqueWords());
//
//        for (String word : wordSet.getWordsSorted()) {
//            System.out.println(word);
//        }
//
    }
}
