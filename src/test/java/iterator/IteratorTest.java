package Iterator;


import org.junit.Test;

public class IteratorTest {

    @Test
    public static void main(String[] args) {
        ManCollection manCollection=new ManCollection(5);
        manCollection.appendMan(new SportsMan("Healy",20));
        manCollection.appendMan(new SportsMan("Gerald ",21));
        manCollection.appendMan(new SportsMan("Trice ",56));
        manCollection.appendMan(new SportsMan("Yennefa ",45));
        manCollection.appendMan(new SportsMan("Kant ",18));

        MenuIterator it=manCollection.iterator();
        while (it.HasNext()) {
            SportsMan man = (SportsMan) it.Next();
            System.out.println(man.GetName());
        }

        VenueCollection venueCollection=new VenueCollection(5);
        venueCollection.appendVenue(new CompetitionVenue("sand trap"));
        venueCollection.appendVenue(new CompetitionVenue("grasslands"));
        venueCollection.appendVenue(new CompetitionVenue("pools"));
        venueCollection.appendVenue(new CompetitionVenue("track and field"));
        venueCollection.appendVenue(new CompetitionVenue("ice rink"));


        MenuIterator its=venueCollection.iterator();
        while (its.HasNext()) {
            CompetitionVenue venue = (CompetitionVenue) its.Next();
            System.out.println(venue.GetName());
        }


    }
}
