package exercise.service;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CsvReaderService {

    public static List<Row> readCsv(String filePath) throws IOException {
        List<Row> rows = new ArrayList<>();

        try (CSVParser csvParser = CSVFormat.DEFAULT.withHeader().parse(new FileReader(filePath))) {
            for (CSVRecord record : csvParser) {
                List<String> values = new ArrayList<>(record.toMap().values());
                Row row = new Row(values);
                rows.add(row);
            }
        } catch (IOException ex) {
            throw new IOException("Error reading CSV file", ex);
        }

        return rows;
    }

}
