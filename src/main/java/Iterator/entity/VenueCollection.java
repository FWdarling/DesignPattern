package iterator.entity;

import iterator.Aggregate;
import iterator.MenuIterator;
import iterator.VenueIterator;
import iterator.entity.CompetitionVenue;

public class VenueCollection implements Aggregate {

    private CompetitionVenue[] venues;
    private int last = 0;

    public VenueCollection(int maxsize) {
        this.venues = new CompetitionVenue[maxsize];
    }

    public CompetitionVenue getVenueAt(int index) {
        return venues[index];
    }

    public void appendVenue(CompetitionVenue Venue) {
        this.venues[last] = Venue;
        last++;
    }
    /**
     * 返回数组索引的最后一位
     * @return
     */
    public int getLength() {
        return last;
    }

    public MenuIterator iterator() {
        return new VenueIterator(this);
    }
}
