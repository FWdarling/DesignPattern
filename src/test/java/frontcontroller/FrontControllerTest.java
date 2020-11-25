package frontcontroller;

import org.junit.Test;

public class FrontControllerTest {

    @Test
    public void frontControllerTest(){

        System.out.println("---------------- [Pattern] FrontController ----------------");

        FrontController start=new FrontController();
        //代表验证管理员身份
        start.identityVerification("root");
        System.out.println("");
        //代表验证运动员身份
        start.identityVerification("Healy");
        System.out.println("");

        //代表验证其他人身份
        start.identityVerification("people");
        System.out.println("");
        System.out.println("------------------------ END ------------------------");

    }

}
