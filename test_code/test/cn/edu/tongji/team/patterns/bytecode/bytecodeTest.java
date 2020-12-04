package cn.edu.tongji.team.test;

import cn.edu.tongji.team.patterns.bytecode.magicdepartment.InstructionConverterUtil;
import cn.edu.tongji.team.patterns.bytecode.magicdepartment.VirtualMachine;
import cn.edu.tongji.team.patterns.bytecode.magicdepartment.WizardChocolate;

import java.util.Stack;

/**
 * description: BytecodeTest
 * date: 12/4/20 10:40 PM
 * author: Ming
 */
public class bytecodeTest {
    public static void main(String[] args) {
        System.out.println("巧克力工厂9又4分之3号机器....");
        System.out.println("====创造魔力巧克力来增强你的力量====");

        WizardChocolate wizardChocolate = new WizardChocolate();
        wizardChocolate.setHealth(45);
        wizardChocolate.setAgility(7);
        wizardChocolate.setWisdom(11);

        VirtualMachine vm = new VirtualMachine();
        vm.getWizardChocolates()[0] = wizardChocolate;

        String literal = "MAGIC 0";

        interpretInstruction(literal, vm);
        interpretInstruction(literal, vm);
        interpretInstruction("GET_HEALTH", vm);
        interpretInstruction(literal, vm);
        interpretInstruction("GET_AGILITY", vm);
        interpretInstruction(literal, vm);
        interpretInstruction("GET_WISDOM ", vm);
        interpretInstruction("ADD", vm);
        interpretInstruction("MAGIC 2", vm);
        interpretInstruction("DIVIDE", vm);
        interpretInstruction("ADD", vm);
        interpretInstruction("SET_AGILITY", vm);

        System.out.println("魔法巧克力炼成！！！");
    }

    private static void interpretInstruction(String instruction, VirtualMachine vm) {
        vm.execute(InstructionConverterUtil.convertToByteCode(instruction));
        Stack stack = vm.getStack();
        System.out.println(instruction + String.format("%" + (12 - instruction.length()) + "s", "") + stack);
    }
}
