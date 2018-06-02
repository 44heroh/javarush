package task19.task1901;

/**
 * Created by User on 15.05.2018.
 */
public class Solution {
    public static void main(String[] args) {
        //это пример вывода
        ATable aTable = new ATable() {
            @Override
            public String getCurrentUserName() {
                return "Amigo";
            }

            @Override
            public String getTableName() {
                return "DashboardTable";
            }
        };

        BTable table = new TableAdapter(aTable);
        System.out.println(table.getHeaderText());
    }

    public static class TableAdapter implements BTable {
        private ATable aTable;
        public TableAdapter(ATable aTable) {
            this.aTable = aTable;
        }

        @Override
        public String getHeaderText() {
            return "[" + this.aTable.getCurrentUserName() + "] : " + this.aTable.getTableName();
        }
    }

    public interface ATable {
        String getCurrentUserName();
        String getTableName();
    }

    public interface BTable {
        String getHeaderText();
    }
}
