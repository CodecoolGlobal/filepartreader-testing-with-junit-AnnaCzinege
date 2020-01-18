import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class FilePartReaderTest {
    @Test
    @DisplayName("Testing fromLine is greater than toLine")
    public void testIsNumberBiggerThanOtherNumber() {
        FilePartReader filePartReader = new FilePartReader();
        assertThrows(IllegalArgumentException.class, ()->  {
            filePartReader.setup(3, 2);
        });
    }

    @Test
    @DisplayName("Testing toLine is smaller than 1")
    public void testIsNumberSmallerThan1() {
        FilePartReader filePartReader = new FilePartReader();
        assertThrows(IllegalArgumentException.class, () -> {
            filePartReader.setup(4, 0);
        });
    }

    @Test
    @DisplayName("Testing filepath does not exist")
    public void testDoesFilePathExist() {
        FilePartReader filePartReader = new FilePartReader();
        assertThrows(NullPointerException.class, () -> {
            filePartReader.read("ksjfs");
        });
    }

}