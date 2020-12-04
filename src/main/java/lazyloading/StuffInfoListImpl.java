package lazyloading;

import java.util.ArrayList;

/**
 * @Author Max Leung
 * @Description:
 * @Date: Created in 14:07 2020/11/23
 * @Modified By:
 **/
public class StuffInfoListImpl implements StuffInfoList {
    /**
     StuffInfoListImpl conducts the real process of loading the stuff's information from the existing database or storage.
     The process is time-consuming, therefore the calling of the getStuffList should limit to the time when the data is really
     needed and used.
     **/
    @Override
    public ArrayList<Stuff> getStuffList(){
        return getStuff();
    }

    /**
     The function simulates the process of loading the stuff list from the database or somewhere that is time-consuming.

     Args:

     Return:
        ArrayList<Stuff>
     **/
    private static ArrayList<Stuff> getStuff(){
        ArrayList<Stuff> stuffList=new ArrayList<Stuff>();
        stuffList.add(new Stuff("Ash","male",001,100000));
        stuffList.add(new Stuff("Aston","male",002,100011));
        stuffList.add(new Stuff("Betty","female",003,200111));
        stuffList.add(new Stuff("Chris","male",004,101211));
        stuffList.add(new Stuff("Dickens","male",005,123411));
        stuffList.add(new Stuff("Emily","female",006,144511));
        return stuffList;
    }
}
