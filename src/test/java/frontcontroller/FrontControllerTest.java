package frontcontroller;

import org.junit.Test;

public class FrontControllerTest {

    @Test
    public void frontControllerTest(){
        FrontController start=new FrontController();
        //代表验证管理员身份
        start.IdentityVerification("root");
        System.out.println("");
        //代表验证运动员身份
        start.IdentityVerification("Healy");
        System.out.println("");

        //代表验证其他人身份
        start.IdentityVerification("people");
        System.out.println("");

    }

}
