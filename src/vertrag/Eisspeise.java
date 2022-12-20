package vertrag;

import java.time.Duration;
import java.util.Collection;

public interface Eisspeise {
    Hersteller getHersteller();
    Collection<Allergen> getAllergene();
    Halterung getHalterung();
    int getNaehrwert();
}
