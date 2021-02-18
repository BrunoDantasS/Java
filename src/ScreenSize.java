package src;

import java.awt.Dimension;
import java.awt.Toolkit;

public class ScreenSize {
  public static void main(String[] args) {

    Toolkit tk = Toolkit.getDefaultToolkit();
    Dimension d = tk.getScreenSize();
    System.out.print("Screen size: " + d.width + " X " + d.height);
  }
}
