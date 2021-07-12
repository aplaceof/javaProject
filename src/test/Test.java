package test;

/**
 * 这是一个测试类
 *
 * @author alf
 */
public class Test {

  /** 类变量1 */
  static int a1;

  /** 类变量2 */
  int a2;

  /**
   * 函数1.
   *
   * @param a1 成员变量1
   */
  public void fun1(int a1) {
    fun2(a1);
  }

  /**
   * 函数2 xxxxx
   *
   * @param a 成员变量1
   */
  public void fun2(int a) {
    fun1(a);
  }
}
