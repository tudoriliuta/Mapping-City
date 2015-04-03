import java.util.Random;

public class City {
 private static String[] namePrefixes = { "Chiguiro", "Maracas", "Raccoon",
  "Glass", "Iron", "Spring", "Winter", "Autumn", "Summer", "Godel",
  "Recursion", "Escher", "PowPow", "LOL", "Cheese", "MasterRoshi", "Pants", "Dork",
  "Cat", "Liszt", "Hysteria", "Cool", "Ennui", "Tortoise", "Mudkip", "Tonkatsu", 
  "Rainy", "Slump", "Tortilla", "Rodizio", "Ajiaco", "Sunny" };
 
 private static String[] nameSuffixes = { "ville", "vale", "_City", "town", "ton",
   "hill", "field", "land", "ia", "furt", "grad", "lia", "stadt", "stan" };
 
 private String name;
 private Vector2D pos;
 private City[] neighbours; 
 
 private boolean explored;
 
 
 public City() 
 {
   Random rand=new Random();
   this.name=namePrefixes[rand.nextInt(namePrefixes.length)]+nameSuffixes[rand.nextInt(nameSuffixes.length)];
   // apparently it does not provide unique random elements
   Vector2D coming = new Vector2D(rand.nextInt(151),rand.nextInt(151));
   this.pos=coming;
 }
 
 //maxDist is the further distance apart two cities can be and still be connected.
 //If there are j neighbours, then the last length-j spots of neighbours should be null
 //And the first j elements should be city objects
 
 public void setNeighbours(double maxDist, City[] cities)
 {
   // experimenting with a matrix (first cities.length elements belong to the first city, etc.) 
   City[][] newCity= new City[cities.length][cities.length];
   
   for (int j=0; j<cities.length; j++)
   {
     for (int i=0; i<cities.length; i++)
     {
       if (cities[j]!=cities[i])
       {
         if (Vector2D.distance(cities[j].pos,cities[i].pos)<maxDist)
         {
           newCity[j][i]=cities[i];
         }
         else  
         {
           newCity[j][i]=null;
         }
       }
     }
   }
 }
 
 //Searches to see which cities are connected to the current city.
 //If a city can be reached, its boolean 'explore' value will be true after this method is called
 //Otherwise, it will be false.
 
 public void explore() 
 {
  explored=true;
  for (int i=0; i<neighbours.length; i++)
  {
    if (neighbours[i].explored==false)
    {
      neighbours[i].explored=true;
    }
  }
 }
 
 public Vector2D getPos()
 {
  return pos;
 }

 public String getName() 
 {
  return name;
 }
 
 public City[] getNeighbours()
 {
  return neighbours;
 }
 public boolean getExplored(){
   return explored;
 }
}

