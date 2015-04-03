
//Complete this class.
public class Vector2D {
  private double xVal;
  private double yVal;
  
  public Vector2D(double a,double b)
  {
    this.xVal=a;
    this.yVal=b;
  }
  
  public static double distance(Vector2D v, Vector2D b)
  {
    //System.out.println(xVal+" "+yVal+" "+v.getX()+" "+v.getY()+" "+b.getX()+" "+b.getY());
    return Math.sqrt(Math.pow(v.getX()-b.getX(),2)+Math.pow(v.getY()-b.getY(),2));
  }
  
  public double getX(){
    return xVal;
  }
  
  public double getY(){
    return yVal;
  }
  
   //testing the output of a Vector2D object 
  public static void presence(Vector2D a)
  {
    System.out.println(a.getX()+" "+a.getY());
  }
  
  
  
}
