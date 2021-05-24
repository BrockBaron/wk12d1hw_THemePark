package attractions;

import Interfaces.IReviewed;
import Interfaces.ISecurity;

public class Playground extends Attraction implements ISecurity, IReviewed {

    public Playground(String name, int rating) {
        super(name, rating);
    }

    public boolean isAllowedTo() {
        return false;
    }
}
