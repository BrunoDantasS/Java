import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class SystemTime {
  public static void main(String[] args) throws Exception {
   
    LocalDateTime date = LocalDateTime.now();
    DateTimeFormatter formatterData = DateTimeFormatter.ofPattern("dd/MM/uuuu");
    String dateFormatted = formatterData.format(date);
    System.out.println("Date: " + dateFormatted);
  }
}
