package nl.miwgroningen.se.start.controller;

import nl.miwgroningen.se.start.model.WordSet;

/**
 * @author Vincent Velthuizen <v.r.velthuizen@pl.hanze.nl>
 * <p>
 * Lees een tekst bestand in en analyseer het
 */
public class Launcher {

    public static void main(String[] args) {
        WordSet wordSet = new WordSet();

        wordSet.readFromFile("src/main/resources/MaxHavelaar.txt");

        System.out.println(wordSet.getNrOfUniqueWords());

        for (String word : wordSet.getWordsSorted()) {
            System.out.println(word);
        }
    }
}
