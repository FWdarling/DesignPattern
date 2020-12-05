package memento;

import cn.edu.tongji.team.patterns.memento.BlueprintCaretaker;
import cn.edu.tongji.team.patterns.memento.BlueprintOriginator;
import org.junit.Test;

/**
 * @Author Max Leung
 * @Description:
 * @Date: Created in 16:17 2020/12/3
 * @Modified By:
 **/
public class MementoTest {
    @Test
    public void mementoTest(){
        BlueprintOriginator originator = new BlueprintOriginator();
        BlueprintCaretaker caretaker = new BlueprintCaretaker();

        System.out.println("测试添加一步");
        caretaker.addMemento(originator.addStep("first step."));
        System.out.println(originator.showBlueprint());

        System.out.println("测试删除一步\n");
        caretaker.addMemento(originator.deleteStep());

        System.out.println("测试删除一步边界情况\n");
        boolean flag=caretaker.addMemento(originator.deleteStep());
        if (flag){
            System.out.println("边界测试错误！\n");
        }
        else{
            System.out.println("边界测试成功！\n");
        }

        System.out.println("\n测试undo\n");
        originator.undo(caretaker.getUndoMemento());
        System.out.println(originator.showBlueprint());

        System.out.println("测试undo边界情况\n");
        originator.undo(caretaker.getUndoMemento());
        flag=originator.undo(caretaker.getUndoMemento());
        if(flag){
            System.out.println("测试失败！\n");
        }
        else{
            System.out.println("测试成功！\n");
        }

        System.out.println("\n测试redo\n");
        originator.redo(caretaker.getRedoMemento());
        System.out.println(originator.showBlueprint());

        System.out.println("\n测试redo边界\n");
        originator.redo(caretaker.getRedoMemento());
        flag=originator.redo(caretaker.getRedoMemento());
        if(flag){
            System.out.println("测试失败！\n");
        }
        else{
            System.out.println("测试成功！\n");
        }
    }
}
