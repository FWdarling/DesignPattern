package Iterator;

public class VenueCollection {
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
    public int getLength() {
        return last;
    }
    public MenuIterator iterator() {
        return new VenueIterator(this);
    }
}
