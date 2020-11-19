package multiton;

import entity.TrainingRoom;

/**
 * 负责分配训练室的类
 */
public class RoomDistributor {
    /**
     * 调用此方法分配训练室
     *
     * @return 分配到的TrainingRoom实例
     */
    public TrainingRoom applyRoom() {
//        确认当前是否有空训练室
        if (TrainingRoom.usingCount >= 3) {
//            已使用训练室大于等于3，无空房间
            System.out.println("Sorry, no empty room is left.");
            return null;
        }
//        有空房间，逐个检测是否可申请
        for (int i = 1; i <= 3; i++) {

            TrainingRoom trainingRoom = TrainingRoom.getRoom(i);
//            getRoom成功,申请到了训练室
            if (trainingRoom != null) {
                System.out.println("Success.");
                return trainingRoom;
            }

        }
        return null;
    }

}
