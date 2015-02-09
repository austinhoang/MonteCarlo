import java.util.Random;
public class MonteCarlo
{
    public double dh;
    public double dk;
    public double dr;
    private Random rndm = new Random(); 
    public double cirCount;
    public double sqrCount;

    MonteCarlo(double h, double k, double r){
        dh = h;
        dk = k;
        dr = r;
        cirCount = 0.0;
        sqrCount = 0.0;
    }

    public double nextRainDrop_x(){
        double rambo = rndm.nextDouble();  
        double x = 0;
        x = (dh - dr) + (dr * 2) * rambo;
        return x; 
    }

    public double nextRainDrop_y(){
        double rambo = rndm.nextDouble();  
        double y = 0;
        y = (dk - dr) + (dr * 2) * rambo;
        return y;
    }

    public boolean insideCircle(double x, double y){
        double t = 0;
        t = Math.pow((x - dh), 2) + Math.pow((y - dk), 2);
        //t = Math.sqrt(t); 
        if(t <= Math.pow(dr, 2)){
            return true;
        }
        else{
            return false;
        }
    }

    public void cirCountUp(){
        cirCount = cirCount + 1;
    }

    public void sqrCountUp(){
        sqrCount = sqrCount + 1;
    }

    public double getCirCount(){
        return cirCount;
    }

    public double getSqrCount(){
        return sqrCount;
    }

    public double calcPi(double sqr, double cir){
        double pi = (cir * (4 * Math.pow(dr, 2))) / (sqr * Math.pow(dr, 2));
        return pi;
    }
}