package org.algo;

import java.util.ArrayList;
import java.util.List;

public class Birthday {
    int d = 4;
    int m = 2;
    List<Integer> s = new ArrayList<>();
    {
        s.add(2);
        s.add(2);
        s.add(1);
        s.add(3);
        s.add(2);
    }
   public int birthday(List<Integer> s, int d, int m) {
        int count = 0;
        int windowSum = 0;

      for(int i = 0; i < m; i++) {
          windowSum += s.get(i);
      }
      if(windowSum == d) {
          count++;
      }
      for(int i = m; i < s.size(); i++){
          windowSum = windowSum - s.get(i - m) + s.get(i);
          if(windowSum == d) {
              count++;
          }
       }
       System.out.println(count);
    return count;
    }

    public static void main(String[] args) {
        Birthday birthday = new Birthday();
        birthday.birthday(birthday.s, birthday.d, birthday.m);
    }
}
