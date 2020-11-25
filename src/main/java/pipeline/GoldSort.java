package pipeline;

import entity.MedalBoard;

/**
 * description: 阶段类，按金牌数目排序
 * date: 11/23/20 20:10 PM
 * author: cjsmt
 */
public class GoldSort implements Sort<MedalBoard, MedalBoard>{
    @Override
    public MedalBoard process(MedalBoard input) {
        int low = 0, high = 4;
        return sort(input, low, high);
    }

    public MedalBoard sort(MedalBoard input, int rawLow, int rawHigh) {
        int low = rawLow, high = rawHigh;
        int key = input.getTeamGold(input.getRank()[low]);
        while(low < high){
            while (low < high && input.getTeamGold(input.getRank()[high]) <= key){
                high--;
            }
            if(low < high && input.getTeamGold(input.getRank()[high]) > key){
                input.swagRankTeam(low, high);
            }
            while (low < high && input.getTeamGold(input.getRank()[low]) >= key){
                low++;
            }
            if (low < high && input.getTeamGold(input.getRank()[low]) < key){
                input.swagRankTeam(low, high);
            }
        }
        int standard = low;
        if(rawLow < standard)input = sort(input, rawLow, standard - 1);
        if(standard < rawHigh)input = sort(input, standard + 1, rawHigh);
        return input;
    }

}
