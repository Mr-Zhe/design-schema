package com.group.factory;

/**
 * @author ：ZHANGZHE
 * @description：TODO
 * @date ：Created in 2019/8/29 14:33
 * @version: 1.1.0
 */
public abstract class Operation {
    private Double numberOne;
    private Double numberTwo;
    private Double result;

    public Double getNumberOne() {
        return numberOne;
    }

    public void setNumberOne(Double numberOne) {
        this.numberOne = numberOne;
    }

    public Double getNumberTwo() {
        return numberTwo;
    }

    public void setNumberTwo(Double numberTwo) {
        this.numberTwo = numberTwo;
    }

    public Double getResult() {
        return result;
    }

    public void setResult(Double result) {
        this.result = result;
    }

    /**
     * calculation
     * @return Double
     * @version 1
     */
    public abstract Double calculation();
}
