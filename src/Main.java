import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        FilePartReader filePartReader = new FilePartReader();
        filePartReader.setup(filePartReader.getFromLine(), filePartReader.getToLine());

        FileWordAnalyzer fileWordAnalyzer = new FileWordAnalyzer(filePartReader);

        System.out.println(filePartReader.read(filePartReader.getFilePath()));
        System.out.println(fileWordAnalyzer.getWordsOrderedAlphabetically());
        System.out.println(fileWordAnalyzer.getWordsContainingSubstring("hg"));
        System.out.println(fileWordAnalyzer.getStringsWhichPalindromes());
    }
}
