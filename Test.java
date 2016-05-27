import static java.lang.StrictMath.sqrt;

public class Test {

    public static int Sum_num(int n){
        int x1 = n%10;
        int x2 = (n/10)%10;
        int x3 = (n/100)%10;

        return (x1+x2+x3);
    }

    public static double  Round_Num(double n){
      if(n-(int)n>=0.5){
          return (int)n+1;
      }
        else{
          return (int)n;
      }

    }
    public static int Sum_Twice(int n){
        int x1=n%10;
        int x2 = (n/10)%10;
        return (x1+x2);
    }
    public static double Sum_Doub(double n1,double n2){
        double n=n1/n2;
        return n;
    }
    public static int InRandom(){
        int n = ((int)(Math.random()*7)-3);
        return n;
    }
    public static int GapRandom(int n){
        int d=2*n+1;
        int x = ((int)(Math.random()*d)-n);
        return x;
    }
    public static int GapNumRandom(int a,int b){
        int d=b-a;
        int x = ((int)(Math.random()*d)+a);
        return x;
    }
    public static void Degree(){
        double x1=Math.cos(60*Math.PI/180);
        double x2=Math.cos(45*Math.PI/180);
        double x3=Math.cos(40*Math.PI/180);

        System.out.println("cos(60)="+x1 + " cos(45)=" + x2 +" cos(40)="+x3) ;
    }
    public static void Perim_Square(double a, double b){
        double perim = a+b+(sqrt(a*a+b*b));
        double square =a*b/2;
        System.out.println("Perimetr:"+perim) ;
        System.out.println("Square:"+square) ;

    }


    public static void main(String[] args)  {
        System.out.println(Sum_num(225));
        System.out.println(Round_Num(14.6));
        System.out.println(Sum_Twice(14));
        System.out.println(Sum_Doub(12,14));
        System.out.println(InRandom());
        System.out.println(GapRandom(4));
        System.out.println(GapNumRandom(2,7));
        Degree();
        Perim_Square(2,5);
    }

}
