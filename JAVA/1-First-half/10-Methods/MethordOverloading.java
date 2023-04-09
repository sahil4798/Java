import java.lang.*;

public class MethordOverloading {

   static int max(int x, int y) {
      return x > y ? x : y;
   }

   static float max(float x, float y) {
      // return x > y ? x : y;
      if (x > y)
         return x;
      else
         return y;
   }

   static int max(int x, int y, int z) {
      if (x > y) {
         if (x > z)
            return x;
         else
            return y;
      } else {
         if (y > z)
            return y;
         else
            return z;
      }

   }

   public static void main(String[] args) {

      System.out.println(max(10, 20));
      System.out.println(max(10000.3f, 2000.3f));
      System.out.println(max(1000, 2000, 5400));

   }
}