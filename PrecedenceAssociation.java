public class PrecedenceAssociation{
    public static void main(String[] args){

     int a = 6*5-34/2 ;   //13
     int b = 60/5-34*2;   //-56
     float c = 6/5.0f-34*2;   //-66.8
     float d = 7/4.0f * 9/2.0f;  //7.875
     // x-y/2
     int x=6;
     int y=1;
     int k=x*y/2;  //3

     //p*p-4qr/4q0
   int p=1;
   int q=4;
   int r=5;
   int s=p*p-(4*q*r)/(2*q);  //-9

    System.out.println(s);
    System.out.println(k);
    System.out.println(a);
    System.out.println(b);
    System.out.println(c);
    System.out.println(d);

}
}




