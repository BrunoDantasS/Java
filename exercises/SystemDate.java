import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class SystemDate {
  public static void main(String[] args) {
    LocalDateTime date = LocalDateTime.now();
    DateTimeFormatter formatterDate = DateTimeFormatter.ofPattern("dd/MM/uuuu");
    String dateFormatted = formatterDate.format(date);
    System.out.println("Date: " + dateFormatted);
  }
}
