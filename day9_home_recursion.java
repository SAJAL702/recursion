// Source code is decompiled from a .class file using FernFlower decompiler.
public class day9_home_recursion {
   public day9_home_recursion() {
   }

   public static void num_reverse(int var0) {
      if (var0 != 0) {
         System.out.print(var0 % 10);
         num_reverse(var0 / 10);
      }
   }

   public static void main(String[] var0) {
      short var1 = 1244;
      System.out.print("Recursion applied\n" + var1 + " in reverse is: ");
      num_reverse(var1);
   }
}
