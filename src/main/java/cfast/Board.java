package cfast;

import java.util.ArrayList;
import org.springframework.data.annotation.Id;
import lombok.Data;

@Data
public class Board {

    @Id
    private String id;

    // private final ArrayList<Column> columns;
    private ArrayList<Column> columns;

    public ArrayList<Column> getColumns() {
        return this.columns;
    }

    @Override
    public String toString() {
        if (null != columns) {
            return getClass().getSimpleName() + "[columns=" + this.columns.toString() + "]";
        } else {
            return "NULL";
        }
    }
}