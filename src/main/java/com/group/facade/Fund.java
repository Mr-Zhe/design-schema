package com.group.facade;

/**
 * @author ：ZHANGZHE
 * @description：TODO
 * @date ：Created in 2019/9/3 17:41
 * @version: 1.1.0
 */
public class Fund {
    private StockOne stockOne;
    private StockTwo stockTwo;
    private StockThree stockThree;
    private Realty realty;
    private NationalDebt nationalDebt;

    public Fund() {
        stockOne = new StockOne("股票1");
        stockTwo = new StockTwo("股票2");
        stockThree = new StockThree("股票3");
        realty = new Realty("房地产");
        nationalDebt = new NationalDebt("国债");
    }

    public StockOne getStockOne() {
        return stockOne;
    }

    public void setStockOne(StockOne stockOne) {
        this.stockOne = stockOne;
    }

    public StockTwo getStockTwo() {
        return stockTwo;
    }

    public void setStockTwo(StockTwo stockTwo) {
        this.stockTwo = stockTwo;
    }

    public StockThree getStockThree() {
        return stockThree;
    }

    public void setStockThree(StockThree stockThree) {
        this.stockThree = stockThree;
    }

    public Realty getRealty() {
        return realty;
    }

    public void setRealty(Realty realty) {
        this.realty = realty;
    }

    public void buyFund(){
        stockOne.buy();
        stockTwo.buy();
        stockThree.buy();
        realty.buy();
        nationalDebt.buy();
        System.out.println("购买基金结束");
    }

    public void sellFund(){
        stockOne.sell();
        stockTwo.sell();
        stockThree.sell();
        realty.sell();
        nationalDebt.sell();
        System.out.println("卖基金结束");
    }
}
