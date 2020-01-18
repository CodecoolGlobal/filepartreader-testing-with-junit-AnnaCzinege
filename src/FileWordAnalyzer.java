import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FileWordAnalyzer {
    private FilePartReader filePartReader;

    public FileWordAnalyzer(FilePartReader filePartReader) {
        this.filePartReader = filePartReader;
    }

    public List getWordsOrderedAlphabetically () throws IOException {
        String data = filePartReader.read(filePartReader.getFilePath());
        List<String> words = Arrays.asList(data.split("\\s+"));
        Collections.sort(words);
        return words;
    }

    public List getWordsContainingSubstring (String subString) throws IOException {
        String data = filePartReader.read(filePartReader.getFilePath());
        List<String> words = Arrays.asList(data.split("\\s+"));
        List<String> wordsWithSubString = new ArrayList<>();
        for (String word : words) {
            if (word.contains(subString)) {
                wordsWithSubString.add(word);
            }
        }
        Collections.sort(wordsWithSubString);
        return wordsWithSubString;
    }

    public List getStringsWhichPalindromes () throws IOException {
        String data = filePartReader.read(filePartReader.getFilePath());
        List<String> words = Arrays.asList(data.split("\\s+"));
        List<String> palindromeWords = new ArrayList<>();
        for (String word : words) {
            boolean broken = false;
            int i = 0;
            int j = word.length() - 1;
            while (i < j) {
                if (word.charAt(i) != word.charAt(j)) {
                    broken = true;
                    break;
                }
                ++i;
                --j;
            }
            if (!broken) {
                palindromeWords.add(word);
            }
        }
        return palindromeWords;
    }
}
