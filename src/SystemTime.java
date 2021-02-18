package src;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class SystemTime {
  public static void main(String[] args) {
    LocalDateTime time = LocalDateTime.now();
    DateTimeFormatter formatterTime = DateTimeFormatter.ofPattern("HH:mm:ss");
    String timeFormatted = formatterTime.format(time);
    System.out.println("Time: " + timeFormatted);
  }
}
