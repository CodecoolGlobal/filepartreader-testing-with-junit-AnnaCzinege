import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class FileWordAnalyzerTest {

    @Test
    void getWordsOrderedAlphabetically() throws IOException {
        FilePartReader filePartReader = new FilePartReader();
        FileWordAnalyzer fileWordAnalyzer = new FileWordAnalyzer(filePartReader);
        assertNotEquals(filePartReader.read(filePartReader.getFilePath()), fileWordAnalyzer.getWordsOrderedAlphabetically());
    }

    @Test
    void getWordsContainingSubstring() throws IOException {
        FilePartReader filePartReader = new FilePartReader();
        FileWordAnalyzer fileWordAnalyzer = new FileWordAnalyzer(filePartReader);
        assertNotEquals(filePartReader.read(filePartReader.getFilePath()), fileWordAnalyzer.getWordsOrderedAlphabetically());
    }

    @Test
    void getStringsWhichPalindromes() throws IOException {
        FilePartReader filePartReader = new FilePartReader();
        FileWordAnalyzer fileWordAnalyzer = new FileWordAnalyzer(filePartReader);
        assertNotEquals(filePartReader.read(filePartReader.getFilePath()), fileWordAnalyzer.getWordsOrderedAlphabetically());
    }
}