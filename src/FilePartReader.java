import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class FilePartReader {
    private String filePath;
    private int fromLine;
    private int toLine;

    public FilePartReader() {
        filePath = "files/testFile.txt";
        fromLine = 1;
        toLine = 7;
    }


    public void setup(Integer fromLine, Integer toLine) {
        if (toLine < fromLine) throw new IllegalArgumentException("toLine is smaller than fromLine");
        if (toLine < 1) throw new IllegalArgumentException("toLine is smaller than 1");
    }

    public String read(String filePath) throws IOException {
        ClassLoader classLoader = getClass().getClassLoader();
        InputStream inputStream = classLoader.getResourceAsStream(filePath);
        return readFromInputStream(inputStream);
    }

    private String readFromInputStream(InputStream inputStream)
            throws IOException {
        StringBuilder resultStringBuilder = new StringBuilder();
        try (BufferedReader br
                     = new BufferedReader(new InputStreamReader(inputStream))) {
            String line;
            int counter = 1;
            while ((line = br.readLine()) != null && counter < toLine+1) {
                resultStringBuilder.append(line).append("\n");
                counter++;
            }
        }
        return resultStringBuilder.toString();
    }

    public String getFilePath() {
        return filePath;
    }

    public int getFromLine() {
        return fromLine;
    }

    public int getToLine() {
        return toLine;
    }
}
