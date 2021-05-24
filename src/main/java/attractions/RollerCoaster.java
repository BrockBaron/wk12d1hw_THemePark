package attractions;

import Interfaces.IReviewed;
import Interfaces.ISecurity;
import Interfaces.ITicketed;

public class RollerCoaster  extends Attraction implements ISecurity, IReviewed, ITicketed {

    public RollerCoaster(String name, int rating) {
        super(name, rating);
    }

    public boolean isAllowedTo() {
        return false;
    }

    public double defaultPrice() {
        return 0;
    }

    public double priceFor() {
        return 0;
    }
}
