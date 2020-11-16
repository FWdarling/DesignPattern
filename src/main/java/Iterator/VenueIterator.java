package iterator;

import iterator.entity.CompetitionVenue;

public class VenueIterator implements MenuIterator<CompetitionVenue>{

    private VenueCollection venue;
    private int index;

    public VenueIterator(VenueCollection Shelf) {
        this.venue = Shelf;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        if (index < venue.getLength()) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Object next() {
        CompetitionVenue Venue = venue.getVenueAt(index);
        index++;
        return Venue;
    }
}
