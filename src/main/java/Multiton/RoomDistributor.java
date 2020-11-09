package Multiton;

public class RoomDistributor {
    public TrainingRoom applyRoom(){
        if(TrainingRoom.usingCount >= 3){
            System.out.println("Sorry, no empty room is left.");
            return null;
        }
        for(int i=1;i<=3;i++){
            TrainingRoom trainingRoom = TrainingRoom.getRoom(i);
            if(trainingRoom != null){
                System.out.println("Success.");
                return trainingRoom;
            }

        }
        return null;
    }

}
