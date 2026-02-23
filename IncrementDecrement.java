public class IncrementDecrement {
    public static void main(String[] args){
    int s= 5;

    int y=7;
    int x= ++y*8;

    int z=7;
    System.out.println(y);   //7
    System.out.println(++y);   //8
    System.out.println(y++);   //8
/* 
     System.out.println(x);   //64

     System.out.println(+s);    //5
     System.out.println(s++);   //5
     System.out.println(++s);   //7
     


     int a=5;
     int b=3;
     int result= a++ + --b + a++ + ++a + b--;
     
     System.out.println(a);    //8
     System.out.println(b);   //1
     System.out.println(result);   //23
*/
    }
}