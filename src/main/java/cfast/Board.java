package cfast;

import java.util.ArrayList;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import lombok.Data;

@Data
public class Board {

    @Id
    public ObjectId _id;

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

    // ObjectId needs to be converted to string
    public String get_id() {
        return _id.toHexString();
    }

    public void set_id(ObjectId _id) {
        this._id = _id;
    }
}