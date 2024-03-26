public class Alg16 {
    public static void main(String[] args) {
      int a = 0, b = 1, c = 0;
      while (c < 500) {
        System.out.print(a + ", ");
        c = a + b;
        a = b;
        b = c;
      }
      System.out.println(a);
    }
}
