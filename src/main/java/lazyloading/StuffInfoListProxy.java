package lazyloading;

import java.util.ArrayList;

/**
 * @Author Max Leung
 * @Description:
 * @Date: Created in 14:18 2020/11/23
 * @Modified By:
 **/
public class StuffInfoListProxy implements StuffInfoList{
    /**
     StuffInfoListProxy can be viewed as a reference, which itself do not contain the information of the stuff, however
     it contains a StuffInfoListImpl which can provide the real data. When users only state that a stuff list is required but
     not using them at once, a StuffInfoListProxy object can be created without the procedure of loading the rel data into
     the memory, the real data is loaded only when the data is of urgent use.
     **/
    @Override
    public ArrayList<Stuff> getStuffList(){
        if(stuffInfoListImpl==null){
            System.out.println("Loading the stuff information list...\n");
            stuffInfoListImpl=new StuffInfoListImpl();
        }
        System.out.println("                                        " +
                "[ StuffInfoListImpl : getStuffList() : 载入员工信息并且返回列表 ]");
        return stuffInfoListImpl.getStuffList();
    }
    private StuffInfoListImpl stuffInfoListImpl;
}
