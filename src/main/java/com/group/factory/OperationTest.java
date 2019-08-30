package com.group.factory;

import java.util.Scanner;

/**
 * @author ：ZHANGZHE
 * @description：TODO
 * @date ：Created in 2019/8/29 15:19
 * @version: 1.1.0
 */
public class OperationTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double numberOne = getNumber(scanner, "一");
        OperationSign operationEnum = getOperationEnum(scanner);
        Double numberTwo = getNumber(scanner, "二");
        Operation operation = OperationFactory.createOperation(operationEnum);
        operation.setNumberOne(numberOne);
        operation.setNumberTwo(numberTwo);
        operation.calculation();
        System.out.println("最后结果是: " + operation.getResult());
    }

    private static OperationSign getOperationEnum(Scanner scanner){
        System.out.print("请输入运算符:");
        String sign = scanner.next();
        OperationSign operationEnum = OperationSign.getOperationBySign(sign);
        if (operationEnum == null){
            System.out.print("输入有误,");
           return getOperationEnum(scanner);
        }
        return operationEnum;
    }


    private static Double getNumber(Scanner scanner, String times){
        System.out.print(String.format("请输入第%s个数字:", times));
        String number = scanner.next();
        Double value;
        try {
            value = Double.parseDouble(number);
        }catch (Exception e){
            System.out.print("输入有误,");
            return getNumber(scanner, times);
        }
        return value;
    }


}
