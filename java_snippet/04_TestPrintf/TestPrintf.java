import java.io.PrintStream;

public class TestPrintf
{
  public static void main(String[] paramArrayOfString)
  {
    System.out.printf("(1) %+8.3f", new Object[] { Double.valueOf(3.14D) });
    System.out.println();
    System.out.printf("(2) %+-8.3f\n", new Object[] { Double.valueOf(3.14D) });
    System.out.printf("(3) %08.3f\n", new Object[] { Double.valueOf(3.14D) });
    System.out.printf("(4) %(8.3f\n", new Object[] { Double.valueOf(-3.14D) });
    System.out.printf("(5) %,f\n", new Object[] { Double.valueOf(2356.3456D) });
    System.out.printf("(6) %xf\n", new Object[] { Integer.valueOf(18998) });
    System.out.printf("(7) %#xf\n", new Object[] { Integer.valueOf(18998) });
    System.out.printf("(8) 你好：%1$s, %2$3d岁, %2$#x岁\n", new Object[] { "张三", Integer.valueOf(38) });
    System.out.printf("(9) %3d, %#<x", new Object[] { Integer.valueOf(38) });
  }
}
