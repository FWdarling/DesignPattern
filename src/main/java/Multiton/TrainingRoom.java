package Multiton;

public class TrainingRoom {
    private String room;
    private static final TrainingRoom ROOM01 = new TrainingRoom("room01");
    private static final TrainingRoom ROOM02 = new TrainingRoom("room02");
    private static final TrainingRoom ROOM03 = new TrainingRoom("room03");
    private TrainingRoom(String room){
        this.room = room;
    }
    private boolean isEmpty = true;
    public static TrainingRoom getRoom(int number){
        switch (number){
            case 1:
                if(ROOM01.isEmpty){
                    ROOM01.isEmpty = false;
                    return ROOM01;}
                else {
                    return null;
                }
            case 2:
                if(ROOM02.isEmpty){
                    ROOM02.isEmpty = false;
                    return ROOM02;
                }
                else {
                    return null;
                }
            case 3:
                if (ROOM03.isEmpty){
                    ROOM03.isEmpty = false;
                    return ROOM03;
                }
                else {
                    return null;
                }

            default:return null;
        }

    }
    public void repayRoom(){
        this.isEmpty = true;
    }
    public void showRoom(){
        System.out.println("You've got "+this.room);
    }
}
