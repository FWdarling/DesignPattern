package flyweight;

import entity.Game;
import entity.Referee;
import entity.SportType;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * description: 裁判工厂，利用享元模式来为比赛分配裁判，
 *              如果有空闲裁判就直接分配，没有就新创建一个裁判
 * date: 11/11/20 1:38 PM
 * author: fourwood
 */
public class RefereeFactory {
    private static final HashMap<SportType, ArrayList<Referee>> refereeHashMap =
            new HashMap<SportType, ArrayList<Referee>> ();

    /**
     * description: 处理分配裁判请求，先从已有的裁判中寻找空闲的，如果没有则新建实例
     * date: 11/11/20 1:47 PM
     * author: fourwood
     *
     * @param game 想要分配裁判的比赛
     * @return Observer.Entity.Referee 分配好的裁判
     */
    public static Referee getReferee(Game game){
        SportType sportType = game.getSportType();
        Referee assignedReferee = null;
        ArrayList<Referee> refereeArraylist = refereeHashMap.get(sportType);

        if(refereeArraylist != null) {
            //寻找指定运动中空闲的裁判
            for (Referee referee : refereeArraylist) {
                if (!referee.getbIsBusy()) {
                    referee.setGame(game);
                    assignedReferee = referee;
                    System.out.println("从已有的" + sportType + "裁判中找到了空闲裁判: " + assignedReferee.getName());
                    break;
                }
            }
        }else{
            refereeArraylist = new ArrayList<Referee>();
            refereeHashMap.put(sportType, refereeArraylist);
        }
        if (assignedReferee == null) {
            //没找到空闲的裁判就分配新的裁判
            String refereeName = sportType.toString() + "Referee" + (refereeArraylist.size() + 1);
            assignedReferee = new Referee(game, refereeName);
            refereeArraylist.add(assignedReferee);
            System.out.println("新分配了一个" + sportType + "裁判： " + assignedReferee.getName());
        }
        return assignedReferee;
    }
}
