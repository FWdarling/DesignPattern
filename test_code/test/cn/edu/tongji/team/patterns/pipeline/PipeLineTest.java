package cn.edu.tongji.team.patterns.pipeline;

import cn.edu.tongji.team.patterns.pipeline.NormalPipeLine;
import cn.edu.tongji.team.patterns.pipeline.ProduceValve;
import cn.edu.tongji.team.patterns.pipeline.SpoiledValve;
import org.junit.Test;

/**
 * description: PipeLineTest
 * date: 12/3/20 6:49 PM
 * author: fourwood
 */
public class PipeLineTest {
    @Test
    public void pipeLineTest() {
        NormalPipeLine normalPipeLine=new NormalPipeLine();
        ProduceValve produceValve=new ProduceValve();
        SpoiledValve spoiledValve=new SpoiledValve();

        normalPipeLine.start("??");
        normalPipeLine.addValve(produceValve);
        normalPipeLine.start("!!");
        normalPipeLine.addValve(spoiledValve);
        normalPipeLine.start("hhhh");
    }
}
