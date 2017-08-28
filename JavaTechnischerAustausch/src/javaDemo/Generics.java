package javaDemo;

import java.util.ArrayList;
import java.util.List;

public class Generics
{
  public static void main(String[] args)
  {
    Stack<Number> stack = new Stack<Number>();

    List<Integer> list = new ArrayList<Integer>();
    list.add(3);
    list.add(4);
    list.add(5);

    stack.push(new Double(4.5));
    stack.push(list);
    stack.push(123.45);

    while (!stack.isEmpty())
    {
      Object o = stack.pop();
      System.out.println(o);
    }
  }
}
