package iterator;


import iterator.entity.CompetitionVenue;
import iterator.entity.SportsMan;
import org.junit.Test;

public class IteratorTest {

    @Test
    public void iteratortest() {
        ManCollection manCollection=new ManCollection(5);
        manCollection.appendMan(new SportsMan("Healy",20));
        manCollection.appendMan(new SportsMan("Gerald ",21));
        manCollection.appendMan(new SportsMan("Trice ",56));
        manCollection.appendMan(new SportsMan("Yennefa ",45));
        manCollection.appendMan(new SportsMan("Kant ",18));

        MenuIterator it=manCollection.iterator();
        /**
         * 迭代器遍历一个collection输出相关信息
         */
        while (it.hasNext()) {
            SportsMan man = (SportsMan) it.next();
            System.out.println("姓名"+man.getName()+"年龄"+man.getAge());
        }
        System.out.println("-----------------");
        VenueCollection venueCollection=new VenueCollection(5);
        venueCollection.appendVenue(new CompetitionVenue("sand trap",20));
        venueCollection.appendVenue(new CompetitionVenue("grasslands",30));
        venueCollection.appendVenue(new CompetitionVenue("pools",100));
        venueCollection.appendVenue(new CompetitionVenue("track and field",50));
        venueCollection.appendVenue(new CompetitionVenue("ice rink",150));


        MenuIterator its=venueCollection.iterator();
        /**
         * 迭代器遍历一个collection输出相关信息
         */
        while (its.hasNext()) {
            CompetitionVenue venue = (CompetitionVenue) its.next();
            System.out.println("场地"+venue.getName()+"面积"+venue.getSize());
        }


    }
}
