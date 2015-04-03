public class Country {
 
  private String name;
  
  private City[] getCities;
  
  private boolean isConnected;
  
  public Country(String countryName, int citiesCountry, int maxDist)
  {
    this.name=countryName;
    City[] cast= new City[citiesCountry];
    for (int j=0; j<citiesCountry; j++)
    {
      City newCity = new City();
      cast[j]=newCity;
    }
    this.getCities=cast;
    
    //Printing the Exercise1 object .name and .pos
    for (int or=0; or<citiesCountry; or++)
    {
    System.out.println(getCities[or].getName());
    Vector2D.presence(getCities[or].getPos());
    }
    
    // initializing neighbours
    for (int i=1; i<citiesCountry; i++)
    {
      
      System.out.println(Vector2D.distance(cast[i].getPos(),cast[i-1].getPos()));
      for (int m=0; m<citiesCountry; m++)
      {
        if (Vector2D.distance(cast[i].getPos(),cast[m].getPos())<maxDist)
        {
          //this.neighbours[m]=cast[m];
        }
      }
    }
     //   getCities[j][2]=true;
      
      //System.out.println(cast[j]);
      //System.out.println(cast);
    }
      
      
     
    
  public void setConnectivity()
    {
      //getCities[0].explore();
      for (int i=0; i<getCities.length; i++)
        {
        if (getCities[i].getExplored()!=true)
        {
         this.isConnected=false;
        } 
        else
        {
          this.isConnected=true;
        }
      }
    }
    
  
  public boolean isConnected()
  {
    return isConnected;
  }
  
  private String getName()
  {
    return name;
  }
  
}
