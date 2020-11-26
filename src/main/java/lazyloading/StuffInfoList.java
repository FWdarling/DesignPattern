package lazyloading;

import java.util.ArrayList;

/**
 * @Author Max Leung
 * @Description:
 * @Date: Created in 14:06 2020/11/23
 * @Modified By:
 **/
public interface StuffInfoList {
    /**
     Information of stuff is stored in the database and can not be directly fetched by the outsiders, therefore an interface
     is provided for the users to access the data without the authority to change them.

     Args:

     Return:
        An arraylist of the data type Stuff which is a list containing the information of all stuff.

     **/
    public ArrayList<Stuff> getStuffList();
}
