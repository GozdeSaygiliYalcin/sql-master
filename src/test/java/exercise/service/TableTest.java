package exercise.service;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TableTest {

    @Test
    public void testOrderByDescUsers() {

        // Users Data
        Table sortedUsersTable = getSortedUsersTable();

        List<String> expectedOrder = Arrays.asList("5", "4", "3", "2", "1");

        List<String> actualOrder = new ArrayList<>();
        for (Row row : sortedUsersTable.getRows()) {
            actualOrder.add(row.getValues().get(2));
        }

        assertEquals(expectedOrder, actualOrder);
    }

    private static Table getSortedUsersTable() {
        List<String> usersColumnNames = Arrays.asList("email", "name", "user_id");
        List<Row> usersRows = Arrays.asList(
                new Row(Arrays.asList("manuel@foo.de", "manuel", "2")),
                new Row(Arrays.asList("andre@bar.de", "andre", "1")),
                new Row(Arrays.asList("swen@foo.de", "swen", "3")),
                new Row(Arrays.asList("paul@foo.de", "paul", "5")),
                new Row(Arrays.asList("lydia@bar.de", "lydia", "4"))
        );

        Table usersTable = new Table(usersRows, usersColumnNames);

        return usersTable.orderByDesc("user_id");
    }

}