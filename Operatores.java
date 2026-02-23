public class Operatores {
    public static void main(String[] var0) {
    

      int a=10;
      int b=20;
      int c=60/a;  //Modulo operator

      int sum1=a+c; //Airthmetic optr
      int sum=a+b-a*b/17;

      a+=2;  //Assignment optr 
      b/=40;

      System.out.println(sum1);   //16
      System.out.println(c);  //6
      System.out.println(a);   //12
      System.out.println(b);    //0

      System.out.println(6==6);  //true   //Comparision optr 
      System.out.println(2==1);  //false

      System.out.println(21<22 && 1<2);  //true   //Logical optr
      System.out.println(22<21 && 1<2);  //false
      System.out.println(2==2 || 2==1);  //true

      System.out.println(2&3);  //2   //Bitwise optr
   } 
}
