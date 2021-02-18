package src;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {

  public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
    int previous = 0;
    int current = 1;
    while ( current < 350){
      list.add(previous);
      previous += current;
      current =  previous - current;
    }
		System.out.println(list);
  }
}