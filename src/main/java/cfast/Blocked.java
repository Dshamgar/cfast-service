package cfast;

import lombok.Data;

@Data
public class Blocked {
    private int blockedIndex = 0;
    private int blockedColumn = 0;
    private int yBlockedIndex = 0;
    private int yBlockedColumn = 0;

    @Override
    public String toString() {
        return getClass().getSimpleName() + "[blocked.blockedIndex=" + this.blockedIndex + ", "
                + "blocked.blockedColumn=" + this.blockedColumn + ", " + "blocked.yBlockedIndex=" + this.yBlockedIndex
                + ", " + "blocked.yBlockedColumn=" + this.yBlockedColumn + "]";
    }

    public int getBlockedIndex() {
        return blockedIndex;
    }

    public void setBlockedIndex(int blockedIndex) {
        this.blockedIndex = blockedIndex;
    }

    public int getYBlockedIndex() {
        return yBlockedIndex;
    }

    public void setYBlockedIndex(int yBlockedIndex) {
        this.yBlockedIndex = yBlockedIndex;
    }

    public int getBlockedColumn() {
        return blockedColumn;
    }

    public void setBlockedColumn(int blockedColumn) {
        this.blockedColumn = blockedColumn;
    }

    public int getYBlockedColumn() {
        return yBlockedColumn;
    }

    public void setYBlockedColumn(int yBlockedColumn) {
        this.yBlockedColumn = yBlockedColumn;
    }

}