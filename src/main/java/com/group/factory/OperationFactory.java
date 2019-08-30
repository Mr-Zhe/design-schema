package com.group.factory;

/**
 * @author ：ZHANGZHE
 * @description：TODO
 * @date ：Created in 2019/8/29 14:44
 * @version: 1.1.0
 */
public class OperationFactory {
    public static Operation createOperation(OperationSign sign) {
        Operation operation;
        switch (sign) {
            case ADD:
                operation = new AddOperation();
                break;
            case SUBTRACT:
                operation = new SubtractOperation();
                break;
            case MULTIPLY:
                operation = new MultiplyOperation();
                break;
            case DIVIDE:
                operation = new DivideOperation();
                break;
            default:
                throw new RuntimeException("没有找到相应的操作");
        }
        return operation;
    }
}
