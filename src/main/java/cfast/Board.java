package cfast;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class Board {
    // private final ArrayList<Column> columns;
    private ArrayList<Column> columns;

    // @JsonCreator
    // public Board(@JsonProperty("columns") ArrayList<Column> columns) {
    // this.columns = columns;
    // System.out.println("!!!!!!BOARD CONSTRUCTOR!!!!!! columns: " + columns);
    // }

    // Default constructor for JSON deserialization
    // public Board() {
    // }

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