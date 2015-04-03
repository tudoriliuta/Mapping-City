public class StopWatch{
  
  private static long startTime;
  private static long stopTime;
  
  
  public static long start(){
    startTime=System.nanoTime();
    return startTime;
  }
  
  public static long stop(){
    stopTime=System.nanoTime();
    return stopTime;
  }
  
  public static long getTimeNano(){
    return stopTime-startTime;
  }
  
  public static long getTimeMicro(){
    return (getTimeNano())/1000; // 1k
  }
  
  public static double getTimeMili(){
    return MakeCountry.decimals((getTimeMicro())/1000,2); // 1mil
  }
  
  public static double getTimeSeconds(){
    return MakeCountry.decimals((getTimeMili())/1000,2); // 1bil
  }  
}