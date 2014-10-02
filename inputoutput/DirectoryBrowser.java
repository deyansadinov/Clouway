package com.clouway.inputoutput;

import java.io.File;

/**
 * @author Deyan Sadinov <sadinov88@gmail.com> on 14-9-29.
 */
public class DirectoryBrowser {
  public void listContent(String absolutePath) {
    File file = new File(absolutePath);
    if (file.isDirectory()) {
      String[] filePaths = file.list();
      System.out.println("This is a Directory.\n");
      for (int i = 0; i < filePaths.length; i++) {
        String filePath = filePaths[i];
        File child = new File(file.getAbsolutePath() + "/" + filePath);
        if (child.isDirectory()) {
          System.out.println(file.getAbsolutePath() + "/" + child.getName() + " is a Directory");
        } else if (child.isFile()) {
          System.out.println(file.getAbsolutePath() + "/" + child.getName() + " is a file");
        }
      }
    }else if (file.isFile()){
      System.out.println("\nThis is a  file : " + file.getName());
    }
  }
}
