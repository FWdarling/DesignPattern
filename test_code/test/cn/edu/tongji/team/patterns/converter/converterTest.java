package cn.edu.tongji.team.test;

import cn.edu.tongji.team.model.beans.chocolate.Chocolate;
import cn.edu.tongji.team.model.beans.chocolate.ChocolateDto;
import cn.edu.tongji.team.model.beans.chocolate.ChocolateType;
import cn.edu.tongji.team.model.beans.chocolate.Ferrero;
import cn.edu.tongji.team.patterns.converter.ChocolateConverter;

/**
 * description: ConverterTest
 * date: 12/4/20 10:40 PM
 * author: Ming
 */
public class converterTest {
    public static void main(String[] args) {
        //生成一个实例
        Chocolate entity = new Ferrero(ChocolateType.Premium);
        ChocolateConverter chocolateConverter = new ChocolateConverter();
        ChocolateDto dto = chocolateConverter.convertToDto(entity);
        entity = chocolateConverter.convertToEntity(dto);
    }
}
