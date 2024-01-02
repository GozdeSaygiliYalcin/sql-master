package exercise.service;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CsvReaderServiceTest {

    @Test
    public void testReadCsv() {
        String testFilePath = "src/main/resources/purchases.csv";

        try {
            List<Row> result = CsvReaderService.readCsv(testFilePath);
            assertNotNull(result);
            assertFalse(result.isEmpty());

        } catch (IOException e) {
            fail("IOException occurred during the test: " + e.getMessage());
        }
    }
}