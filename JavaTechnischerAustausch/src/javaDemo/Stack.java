package javaDemo;

import java.util.Arrays;

// default accesibility, Zugriff nur im gleichen package
class Stack<E>
{
  private static final int CAPACITY = 16;

  private Object[] elements;
  private int size = 0;

  public Stack()
  {
    elements = new Object[CAPACITY];
  }

  private void ensureCapacity()
  {
    if (size == elements.length)
    {
      elements = Arrays.copyOf(elements, 1+2*size);
    }
  }

  public boolean isEmpty() { return size == 0; }

  public void push(E e)
  {
    ensureCapacity();
    elements[size++] = e;
  }

  public void push(Iterable<? extends E> src)
  {
    for (E e: src)
    {
      push(e);
    }
  }

  public E pop()
  {
    @SuppressWarnings("unchecked")
    E e = (E)elements[--size];
    elements[size] = null;
    return e;
  }
}
