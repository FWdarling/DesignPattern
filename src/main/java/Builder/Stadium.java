package Builder;

import java.util.HashMap;
import java.util.Map;

class Stadium {
    private String stadiumType;
    private Map<String, Integer> spectatorArea = new HashMap<>();
    private Map<String, Integer> competitionArea = new HashMap<>();
    private String competitionAreaType;

    public void setSpectatorArea(int cnt, int sz) {
        this.spectatorArea.put("count", cnt);
        this.spectatorArea.put("size", sz);
    }

    public void setCompetitionArea(int cnt, int sz, String tp) {
        this.competitionArea.put("count", cnt);
        this.competitionArea.put("size", sz);
        this.competitionAreaType = tp;
    }

    public void setStadiumType(String type) {
        this.stadiumType = type;
    }

    public void showStadium() {
        System.out.println("Built a " + this.stadiumType + " with:");
        System.out.println(this.competitionArea.get("count") + " " +
                this.competitionAreaType + "s, each of " +
                this.competitionArea.get("size") + " acres");
        System.out.println(this.spectatorArea.get("count") +
                " spectator areas of " +
                this.spectatorArea.get("size") + " acres");
        System.out.println("===================");
    }
}
