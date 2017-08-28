package eclipseDemo;

import static java.lang.Math.PI;

public class Eclipse
{
  public static void main(String[] args)
	{
    double x = PI;
    double y = Math.E;

    System.out.println("Die Länge des Vectors (" + x + ", " + y + ") ist " + length(x, y));
	}

  private static double length(double a, double b)
  {
    double c = Math.sqrt(a*a + b*b);
    return c;
  }
}
