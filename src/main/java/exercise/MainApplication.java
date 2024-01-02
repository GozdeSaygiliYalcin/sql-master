package exercise;

import exercise.service.CsvReaderService;
import exercise.service.Row;
import exercise.service.Table;

import java.io.IOException;
import java.util.List;

public class MainApplication {
    public static void main(String[] args) {

        try {
            List<Row> purchasesRows = CsvReaderService.readCsv("src/main/resources/purchases.csv");
            List<Row> usersRows = CsvReaderService.readCsv("src/main/resources/users.csv");

            Table purchasesTable = new Table(purchasesRows, purchasesRows.get(0).getValues());
            Table usersTable = new Table(usersRows, usersRows.get(0).getValues());

            // Sorting
            Table sortedPurchasesTable = purchasesTable.orderByDesc("ad_id");
            printTable(sortedPurchasesTable);

            // Inner Join
            Table joinedTable = purchasesTable.innerJoin(usersTable, "user_id", "user_id");
            printTable(joinedTable);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void printTable(Table table) {
        System.out.println("Table Data:");
        for (String columnName : table.getColumnNames()) {
            System.out.print(columnName + " | ");
        }
        System.out.println();

        for (Row row : table.getRows()) {
            for (String value : row.getValues()) {
                System.out.print(value + " | ");
            }
            System.out.println();
        }
        System.out.println();
    }
}




