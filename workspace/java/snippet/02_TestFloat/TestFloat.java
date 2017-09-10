import java.io.PrintStream;

public class TestFloat
{
  private static double d = 0.140625D;
  
  public static void main(String[] paramArrayOfString)
  {
    System.out.println("0x1.2p-3 value:" + d);
    System.out.println("3.0/0.0 = Infinity");
    System.out.println("-3.0/0.0 = -Infinity");
    System.out.println("0.0/0.0 = NaN");
  }
}
