package com.huantec.feature.enumerate;

/**
 * @author liuhuan
 */
public class SeasonTest {
    public void judge(SeasonEnum s)
    {
        switch(s)
        {
            case SPRING:
                System.out.println("春天适合踏青。");
                break;
            case SUMMER:
                System.out.println("夏天要去游泳啦。");
                break;
            case FALL:
                System.out.println("秋天一定要去旅游哦。");
                break;
            case WINTER:
                System.out.println("冬天要是下雪就好啦。");
                break;
        }
    }

    public static void main(String[] args) {
        SeasonEnum s = SeasonEnum.SPRING;
        SeasonTest test = new SeasonTest();
        test.judge(s);
    }
}
