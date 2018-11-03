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
}