package com.clouway.test;

/**
 * @author Deyan Sadinov <sadinov88@gmail.com> on 14-10-13.
 */
public class BMW {
  private int a;
  private  int b;
  public BMW(String a  , String b) {
      this.a = Integer.parseInt(a);
      this.b = Integer.parseInt(b);
  }

  public BMW(int a, int b) {
    this.a =a;
    this.b = b;
  }

  public int sum() {
    return a + b;
  }
}
