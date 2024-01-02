package exercise.service;

import java.util.ArrayList;
import java.util.List;

public class Row {

    private List<String> values;

    public Row(List<String> values) {
        this.values = values;
    }

    public Row(Row leftRow, Row rightRow) {
        this.values = new ArrayList<>(leftRow.values);
        this.values.addAll(rightRow.values);
    }

    public List<String> getValues() {
        return values;
    }
}
