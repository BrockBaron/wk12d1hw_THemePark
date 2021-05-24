package attractions;

import Interfaces.IReviewed;
import Interfaces.ITicketed;

public class Dodgems extends Attraction implements IReviewed, ITicketed {

    public Dodgems(String name, int rating) {
        super(name, rating);
    }

    public double defaultPrice() {
        return 0;
    }

    public double priceFor() {
        return 0;
    }
}
