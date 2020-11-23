package pipeline;

import entity.MedalBoard;

/**
 * description: 阶段类，按银牌数目排序
 * data: 11/23/20 20:10 PM
 * author: cjsmt
 */
public class SilverSort implements Sort<MedalBoard, MedalBoard>{
    @Override
    public MedalBoard process(MedalBoard input) {
        int i = 0;
        int low = 0; boolean lowSet = false;
        int high = 0; boolean highSet = false;
        while (i < 5){
            if(!lowSet){
                low = i; lowSet = true; i++;
            }else if(!highSet){
                if(input.getTeamGold(input.getRank()[i]) == input.getTeamGold(input.getRank()[low])){
                    high = i; i++;
                    if(high == 4) highSet = true;
                }else if(i != low+1){
                    highSet = true;
                }else {
                    lowSet = false;
                }
            }
            if(lowSet && highSet){
                input = sort(input, low, high);
                lowSet = false; highSet = false;
                i = high + 1;
            }
        }
        return input;
    }

    public MedalBoard sort(MedalBoard input, int rawLow, int rawHigh) {
        int low = rawLow, high = rawHigh;
        int key = input.getTeamSilver(input.getRank()[low]);
        while(low < high){
            while (low < high && input.getTeamSilver(input.getRank()[high]) <= key){
                high--;
            }
            if(low < high && input.getTeamSilver(input.getRank()[high]) > key){
                input.swagRankTeam(low, high);
            }
            while (low < high && input.getTeamSilver(input.getRank()[low]) >= key){
                low++;
            }
            if (low < high && input.getTeamSilver(input.getRank()[low]) < key){
                input.swagRankTeam(low, high);
            }
        }
        int standard = low;
        if(rawLow < standard)input = sort(input, rawLow, standard - 1);
        if(standard < rawHigh)input = sort(input, standard + 1, rawHigh);
        return input;
    }
}