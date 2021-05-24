package stalls;

import Interfaces.IReviewed;
import Interfaces.ISecurity;

public class TobaccoStall extends Stall implements ISecurity, IReviewed {

    public TobaccoStall(String name, String ownerName, ParkingSpot parkingSpot) {
        super(name, ownerName, parkingSpot);
    }

    public boolean isAllowedTo() {
        return false;
    }


    public int getRating() {
        return 0;
    }
}
