package vertrag;

import java.math.BigDecimal;
import java.util.Date;

public interface Verkaufsobjekt {
    BigDecimal getPreis();
    Date getInspektionsdatum();
    int getSeriennummer();
}