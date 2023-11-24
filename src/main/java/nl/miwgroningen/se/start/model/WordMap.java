package nl.miwgroningen.se.start.model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/**
 * @author Seyma Kanat <s.kanat@st.hanze.nl>
 * WordMap class
 */
public class WordMap {
    private Map<String, Integer> wordMap = new HashMap<>();

    public void readFromFile(String filename) {
        File sourceFile = new File(filename);

        try (Scanner sourceReader = new Scanner(sourceFile)) {
            while (sourceReader.hasNext()) {
                String word = sourceReader.next();

                word = word.replaceAll("[^A-Za-z0-9]", "");
                if (!word.equals("")) {
                    wordMap.put(word, wordMap.getOrDefault(word, 0) + 1);
                }
            }
        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        }
    }

    public int getNrOfUniqueWords() {
        return wordMap.size();
    }

    public Iterable<String> getWordsSorted() {
        //1.Make a list
        List<String> words = new ArrayList<>();

        // make hashset for iterator
//        wordMap.keySet();
        for (String word : wordMap.keySet()) {
            words.add(word);
        }
        //crate String from hashmap save it to the list
        Collections.sort(words);

        return words;
    }

    public int getWordCount(String word) {
        return wordMap.getOrDefault(word, 0);
    }

    public List<Integer> getWordLineNrs(String word) {
        return Collections.singletonList(wordMap.get(word));
    }


}