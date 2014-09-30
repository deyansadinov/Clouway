package com.clouway.inputoutput;

/**
 * @author Deyan Sadinov <sadinov88@gmail.com> on 14-9-29.
 */
public class BrowserMain {
  public static void main(String[] args) {
    Browser browser = new Browser();
    browser.listContent("/home/clouway/Downloads");
  }
}
