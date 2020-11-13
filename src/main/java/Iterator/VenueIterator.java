package iterator;

import iterator.entity.CompetitionVenue;
import iterator.entity.VenueCollection;

public class VenueIterator implements MenuIterator<CompetitionVenue>{

    private VenueCollection venue;
    private int index;

    public VenueIterator(VenueCollection Shelf) {
        this.venue = Shelf;
        this.index = 0;
    }

    @Override
    public boolean HasNext() {
        if (index < venue.getLength()) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Object Next() {
        CompetitionVenue Venue = venue.getVenueAt(index);
        index++;
        return Venue;
    }
}
