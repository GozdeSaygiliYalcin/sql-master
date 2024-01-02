package exercise.service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * TODO implement
 */

public class Table {
    private List<Row> rows;
    private List<String> columnNames;

    public Table(List<Row> rows, List<String> columnNames) {
        this.rows = rows;
        this.columnNames = columnNames;
    }

    // Sorting
    public Table orderByDesc(String columnName) {
        List<Row> sortedRows = new ArrayList<>(rows);

        int columnIndex = columnNames.indexOf(columnName);

        if (columnIndex != -1) {
            sortedRows.sort(Comparator.comparing(row -> row.getValues().get(columnIndex), Comparator.reverseOrder()));
        } else {
            System.out.println("Column with name " + columnName + " not found.");
        }

        return new Table(sortedRows, columnNames);
    }

    // Inner join (because of the name I couldn't be implemented this I tried so many options and stacked)
    public Table innerJoin(Table rightTable, String leftColumn, String rightColumn) {
        //this is for testing
        System.out.println("Left Column: " + leftColumn.toLowerCase());
        System.out.println("Table Columns: " + columnNames.stream().map(String::toLowerCase).toList());
        int leftIndex = columnNames.stream().map(String::toLowerCase).toList().indexOf(leftColumn.toLowerCase());

        if (leftIndex == -1) {
            throw new IllegalArgumentException("Left column not found in the left table.");
        }

        List<Row> joinedRows = rows.stream()
                .flatMap(leftRow -> {
                    int rightIndex = rightTable.getColumnNames().indexOf(rightColumn);

                    if (rightIndex == -1) {
                        throw new IllegalArgumentException("Right column not found in the right table.");
                    }

                    return rightTable.getRows().stream()
                            .filter(rightRow -> leftRow.getValues().get(leftIndex).equals(rightRow.getValues().get(rightIndex)))
                            .map(rightRow -> new Row(leftRow, rightRow));
                })
                .collect(Collectors.toList());

        List<String> joinedColumnNames = columnNames.stream().map(String::toLowerCase).collect(Collectors.toList());
        for (String columnName : rightTable.getColumnNames()) {
            if (!joinedColumnNames.contains(columnName.toLowerCase())) {
                joinedColumnNames.add(columnName);
            }
        }
        return new Table(joinedRows, joinedColumnNames);
    }


    public List<Row> getRows() {
        return rows;
    }

    public List<String> getColumnNames() {
        return columnNames;
    }
}

