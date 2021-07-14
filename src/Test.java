public class Test {

  public static void main(String[] args) {
    //
    double start = 215;
    double end = 495;
    double year = 9;

    System.out.println("中信净利润2011-2020，9年平均增长率：  " + (Math.pow(end / start, 1 / year) - 1));

    start = 257;
    end = 979;
    System.out.println("招商净利润2011-2020，9年平均增长率：  " + (Math.pow(end / start, 1 / year) - 1));

    start = 191;
    end = 589;
    System.out.println("浦发净利润2011-2020，9年平均增长率：  " + (Math.pow(end / start, 1 / year) - 1));

    start = 185;
    end = 676;
    System.out.println("兴业净利润2011-2020，9年平均增长率：  " + (Math.pow(end / start, 1 / year) - 1));

    start = 127;
    end = 351;
    System.out.println("光大净利润2011-2020，9年平均增长率：  " + (Math.pow(end / start, 1 / year) - 1));

    start = 185;
    end = 351;
    System.out.println("民生净利润2011-2020，9年平均增长率：  " + (Math.pow(end / start, 1 / year) - 1));

    start = 10412;
    end = 19400;
    System.out.println("股份制平均净利润2011-2020，9年平均增长率：  " + (Math.pow(end / start, 1 / year) - 1));

    System.out.println("———————  国有大行 —————————");
    start = 1651;
    end = 3159;
    System.out.println("工商净利润2011-2020，9年平均增长率：  " + (Math.pow(end / start, 1 / year) - 1));

    start = 1348;
    end = 2710;
    System.out.println("建设净利润2011-2020，9年平均增长率：  " + (Math.pow(end / start, 1 / year) - 1));

    start = 1044;
    end = 1928;
    System.out.println("中行净利润2011-2020，9年平均增长率：  " + (Math.pow(end / start, 1 / year) - 1));

    start = 948;
    end = 2159;
    System.out.println("农行净利润2011-2020，9年平均增长率：  " + (Math.pow(end / start, 1 / year) - 1));

    start = 390;
    end = 782;
    System.out.println("交通净利润2011-2020，9年平均增长率：  " + (Math.pow(end / start, 1 / year) - 1));
  }
}
