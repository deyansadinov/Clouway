package com.clouway.inputoutput;

/**
 * @author Deyan Sadinov <sadinov88@gmail.com> on 14-9-29.
 */
public class DirectoryBrowserMain {
  public static void main(String[] args) {
    DirectoryBrowser browser = new DirectoryBrowser();
    browser.listContent("/home/clouway/Downloads");
  }
}
