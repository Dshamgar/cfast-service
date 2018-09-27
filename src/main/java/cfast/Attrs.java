package cfast;

import lombok.Data;

@Data
public class Attrs {
    private String fill;

    /*
     * public Attrs(String fill) { this.fill = fill; }
     */

    public String getFill() {
        return fill;
    }

    public void setFill(String fill) {
        this.fill = fill;
    }

    @Override
    public String toString() {
        if (null != fill) {
            return getClass().getSimpleName() + "[attrs.fill=" + this.fill + "]";
        } else {
            return "NULL";
        }
    }
}
