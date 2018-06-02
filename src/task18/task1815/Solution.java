package task18.task1815;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 10.04.2018.
 */
public class Solution {
    public static class TableInterfaceWrapper implements ATableInterface {

        public String strOut123;

        ATableInterface component;

        public TableInterfaceWrapper(ATableInterface atable) {
            this.component = atable;
        }

        @Override
        public void setModel(List rows) {
            System.out.println(rows.size());
            this.component.setModel(rows);
        }

        @Override
        public String getHeaderText() {
            return this.strOut123.toUpperCase();
        }

        @Override
        public void setHeaderText(String newHeaderText) {
            this.component.setHeaderText(newHeaderText);
            this.strOut123 = newHeaderText;
        }
    }

    public interface ATableInterface {
        void setModel(List rows);

        String getHeaderText();

        void setHeaderText(String newHeaderText);
    }

    public static void main(String[] args) {
        TableInterfaceWrapper tifw = new TableInterfaceWrapper(new ATableInterface() {
            @Override
            public void setModel(List rows) {

            }

            @Override
            public String getHeaderText() {
                return null;
            }

            @Override
            public void setHeaderText(String newHeaderText) {

            }
        });
        ArrayList<String> list = new ArrayList<>();
        for(int i = 0; i < 10; i++){
            String str = String.valueOf(i);
            list.add(str);
        }
        tifw.setModel(list);
        tifw.setHeaderText("ewrewrwerwerewr");
        System.out.println(tifw.getHeaderText());
    }
}
