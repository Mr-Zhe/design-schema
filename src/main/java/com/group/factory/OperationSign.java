package com.group.factory;

/**
 * @author ：
 * @description：TODO
 * @date ：Created in 2019/8/29 14:45
 * @version: 1.1.0
 */
public enum OperationSign {
    ADD("+"),
    SUBTRACT("-"),
    MULTIPLY("*"),
    DIVIDE("/"),
    ;

    private String sign;

    OperationSign(String sign) {
        this.sign = sign;
    }

    public String getSign() {
        return sign;
    }

    public static OperationSign getOperationBySign(String sign) {
        OperationSign enumValue = null;
        for (OperationSign operation : OperationSign.values()) {
            if (operation.getSign().equals(sign)){
                enumValue = operation;
                break;
            }
        }
        return enumValue;
    }
}
