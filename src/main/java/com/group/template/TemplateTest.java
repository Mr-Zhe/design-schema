package com.group.template;

/**
 * @author ：ZHANGZHE
 * @description：TODO
 * @date ：Created in 2019/9/3 14:43
 * @version: 1.1.0
 */
public class TemplateTest {
    public static void main(String[] args) {
        System.out.println("学生A的试卷及答案：");
        TestPaper testPaperA = new TestPaperA();
        testPaperA.testQuestion1();
        testPaperA.testQuestion2();
        testPaperA.testQuestion3();

        System.out.println("----------------------------------------");
        System.out.println("学生B的试卷及答案：");
        TestPaper testPaperB = new TestPaperB();
        testPaperB.testQuestion1();
        testPaperB.testQuestion2();
        testPaperB.testQuestion3();

    }
}
