package javaDemo;

import java.util.Arrays;
import java.util.List;

public class Java
{
  public static void main(String[] args)
  {
    Integer[] i = new Integer[7];

    i[0] = new Integer("42");
    i[1] = new Integer("42");
    i[2] = new Integer(42);
    i[3] = Integer.valueOf("42");
    i[4] = Integer.valueOf("42");
    i[5] = Integer.valueOf(42);

    for (int j=0; j<i.length; ++j)
    {
      System.out.print("Vergleich von i[" + j + "] = " + i[j]/*.toString()*/ + ":  ");

      for (int k=0; k<j; ++k)
      {
        System.out.print((i[j] == i[k]) + "  ");
      }
      System.out.println();
    }

    List<Integer> iList = Arrays.asList(i);
    for (Integer m: iList)
    {
      System.out.print(m + " ");
    }
  }
}
