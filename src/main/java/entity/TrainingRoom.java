package entity;

/**
 * 训练室类
 */
public class TrainingRoom {
    //    房间名称
    private String room;

    //    多例模式下只有特定数量的房间可使用，static静态生成三个房间，只有TrainingRoom类可访问
    private static final TrainingRoom ROOM01 = new TrainingRoom("room01");
    private static final TrainingRoom ROOM02 = new TrainingRoom("room02");
    private static final TrainingRoom ROOM03 = new TrainingRoom("room03");

    //    设置房间名称
    private TrainingRoom(String room) {
        this.room = room;
    }

    //    static属性，正在使用房间数
    public static int usingCount = 0;

    //    实例私有属性，标识是否为空
    private boolean isEmpty = true;

    /**
     * 获取指定房间
     *
     * @param number 房间编号，1、2、3
     * @return 获取到指定房间返回，否则返回null
     */
    public static TrainingRoom getRoom(int number) {
        switch (number) {
            case 1:
//                房间为空则获取成功，否则不成功
                if (ROOM01.isEmpty) {
//                    获取房间后isEmpty设置为false
                    ROOM01.isEmpty = false;
//                    总使用数加1
                    usingCount++;
                    return ROOM01;
                } else {
                    return null;
                }
            case 2:
                if (ROOM02.isEmpty) {
                    ROOM02.isEmpty = false;
                    usingCount++;
                    return ROOM02;
                } else {
                    return null;
                }
            case 3:
                if (ROOM03.isEmpty) {
                    ROOM03.isEmpty = false;
                    usingCount++;
                    return ROOM03;
                } else {
                    return null;
                }

            default:
                return null;
        }

    }

    /**
     * 退房
     */
    public void repayRoom() {
        System.out.println(this.room + " is empty now.");
        this.isEmpty = true;
        usingCount--;
    }

    /**
     * 展示获取的房间
     */
    public void showRoom() {
        System.out.println("You've got " + this.room + ".");
    }
}
