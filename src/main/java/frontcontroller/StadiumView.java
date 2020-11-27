package frontcontroller;

public class StadiumView {

    /**
     * 打印场地信息
     * @param type
     * @param competitionAreaType
     * @param competitionAreaCounts
     * @param competitionAreaSize
     * @param spectatorAreaCounts
     * @param spectatorAreaSize
     */

    public void showStadium(String type,String competitionAreaType, int competitionAreaCounts,
                            int competitionAreaSize,int spectatorAreaCounts,int spectatorAreaSize){
        System.out.println("Built a " + type + " with:");
        System.out.println(competitionAreaCounts + " " +
                competitionAreaType + "s, each of " +
                competitionAreaSize + " acres");
        System.out.println(spectatorAreaCounts +
                " spectator areas of " +
                spectatorAreaSize + " acres");
        System.out.println("===================");

    }

}
