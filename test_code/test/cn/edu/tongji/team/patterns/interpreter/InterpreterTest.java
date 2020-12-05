package cn.edu.tongji.team.test.interpreter;

import cn.edu.tongji.team.patterns.builder.giftboxbuilder.GiftBoxBuilder;
import cn.edu.tongji.team.patterns.interpreter.Expression;
import cn.edu.tongji.team.patterns.interpreter.Interpreter;
import cn.edu.tongji.team.patterns.interpreter.ItemExpression;
import cn.edu.tongji.team.patterns.interpreter.NumberExpression;
import org.junit.Test;

public class InterpreterTest {
    @Test
    public void InterpreterTest() {
        String tokenString = "德芙 * 1 + 好时 * 5 + 卡片 * 1 + 杯子 * 1";
        GiftBoxBuilder giftBoxBuilder = new GiftBoxBuilder();
        giftBoxBuilder.setName("好时中秋锦鲤礼盒 - 月中方折桂；流光入杯，诸事顺遂。");
        String[] tokenList = tokenString.split(" ");

        if(Interpreter.verifyInput(tokenList)){
            int len = tokenList.length;
            for (int j=0;j<len;j++) {
                String s= tokenList[j];
                if(Interpreter.isMultiply(s)){
                    Expression left;

                    left = new ItemExpression(tokenList[j-1]);
                    Expression right = new NumberExpression(tokenList[j+1]);
                    Expression expression=Interpreter.getOperatorInstance(s,left,right);
                    expression.interpret(giftBoxBuilder);
                }
            }
            giftBoxBuilder.toGiftBox().displayDetail();
        }
    }
}
