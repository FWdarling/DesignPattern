

package cn.edu.tongji.team.patterns.datalocality;

import cn.edu.tongji.team.patterns.datalocality.process.ProcessEntity;
import org.junit.Test;

/**
 * description: datalocalityTest
 * date: 12/4
 * author: Li
 */

public class DataLocalityTest {
  /**
   * 开始制作
   */
  @Test
  public void DataLocalityTest()
  {
    final int NUM_ENTITIES = 5;
    System.out.println("使用数据局部性做可可阿华田");

    ProcessEntity processEntity = new ProcessEntity(NUM_ENTITIES);
    processEntity.start();
    processEntity.update();
  }
}
