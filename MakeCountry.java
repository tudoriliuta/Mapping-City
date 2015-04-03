
public class MakeCountry {
  public static void main(String[] args){
    //Changing this number will change the number of cities in the country.
    int numCities = 15;
    
    //You can rename your country to whatever you like.
    String countryName = "Dragos' utopia";
    
   
    
    //Time to create a country
    StopWatch.start();
    Country state = new Country(countryName, numCities, 50);
    StopWatch.stop();
    System.out.println("It took "+decimals(StopWatch.getTimeMili(),2)+" milliseconds to create the country");
    
    //Check if connected
    StopWatch.start();
    state.setConnectivity();
    StopWatch.stop();
    System.out.println("It took "+decimals(StopWatch.getTimeMili(),2)+" milliseconds to determine connectivity of this country");
    
    //Check if connected
    StopWatch.start();
    boolean connected = false;
    if (state.isConnected()==true)
    {
      connected=true;
    } 
    StopWatch.stop();
    System.out.println("It took "+decimals(StopWatch.getTimeMili(),2)+" milliseconds to determine connectivity of this country");
    System.out.println("The country "+countryName+" is connected: "+connected);
    
    
    
    
   
    
    System.out.println(countryName + " is connected... " + connected);
    
    //Once every thing else is complete, uncomment line below to display the image.
    //CountryMap map = new CountryMap(myCountry.getCities(), myCountry.getName());
  }
  
   public static double decimals(double a, int b) 
   {
    if (b < 0) throw new IllegalArgumentException();
    long r = (long) Math.pow(10, b);
    a = a * r;
    long exp = Math.round(a);
    return (double) exp / r;
    
    
}
}
