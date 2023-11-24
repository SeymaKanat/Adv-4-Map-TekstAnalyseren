package nl.miwgroningen.se.start.model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/**
 * @author Seyma Kanat <s.kanat@st.hanze.nl>
 * WordLinesMap class
 */
public class WordLinesMap {
    private Map<String, List<Integer>> wordmap = new HashMap<>();

    public void readFromFile(String filename) {
        File sourceFile = new File(filename);

        try {
            Scanner scanner = new Scanner(new File(filename));

            int lineNumber = 0;
            while (scanner.hasNextLine()) {
                lineNumber++;
                String line = scanner.nextLine();
                String[] words = line.split("\\s+");

                for (String word : words) {
                    word = word.replaceAll("[^a-zA-Z]", "").toLowerCase();

                    if (!wordmap.containsKey(word)) {
                        wordmap.put(word, new ArrayList<>());
                    }
                    List<Integer> lineNumbers = wordmap.get(word);
                    lineNumbers.add(lineNumber);
                }
                lineNumber++;
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + filename);
        }
    }

    public int getNrOfUniqueWords() {
        return wordmap.size();
    }

    public Iterable<String> getWordsSorted() {
        List<String> sortedWords = new ArrayList<>(wordmap.keySet());
        Collections.sort(sortedWords);
        return sortedWords;
    }

    public List<Integer> getWordLineNrs(String word) {
        return wordmap.getOrDefault(word.toLowerCase(), Collections.emptyList());
    }
}


