public class Tester
{
   public static void main (String args[]) {
       MonteCarlo mcObj = new MonteCarlo(5.0, 3.0, 2.0);
       double x;
       double y;
       for(int i = 0; i < 1000000; i++){
           x = mcObj.nextRainDrop_x();
           y = mcObj.nextRainDrop_y();
           if (mcObj.insideCircle(x, y) == true)
            mcObj.cirCountUp();
           mcObj.sqrCountUp(); 
           //System.out.println("cirCount = " + mcObj.getCirCount());
           //System.out.println("sqrCount = " + mcObj.getSqrCount());
       }
       double cirCount = mcObj.getCirCount();
       double sqrCount = mcObj.getSqrCount();
       System.out.println("Final cirCount = " + cirCount);
       System.out.println("Final sqrCount = " + sqrCount);
       System.out.println("pi = " + mcObj.calcPi(sqrCount, cirCount)); 
   }
}
