/*
Using interfaces, as you learned in this chapter, you can specify similar behaviors 
for possibly disparate classes. Governments and companies worldwide are becoming 
increasingly concerned with carbon footprints (annual releases of carbon dioxide 
into the atmosphere) from buildings burning various types of fuels for heat, 
vehicles burning fuels for power, and the like. Many scientists blame these 
greenhouse gases for the phenomenon called global warming. Create three small 
classes unrelated by inheritance—classes Building, Car and Bicycle. Give each 
class some unique appropriate attributes and behaviors that it does not have in 
common with other classes. Write an interface CarbonFootprint with a 
getCarbonFootprint method. Have each of your classes implement that interface, 
so that its getCarbonFootprint method calculates an appropriate carbon footprint 
for that class (check out a few websites that explain how to calculate carbon footprints). 
Write an application that creates objects of each of the three classes, places 
references to those objects in ArrayList<CarbonFootprint>, then iterates through the 
Array-List, polymorphically invoking each object’s getCarbonFootprint method. For each 
object, print some identifying information and the object’s carbon footprint.
 */
package carbonfootprintpol;
//need for array
import java.util.ArrayList;

public class CarbonFootprintPol 
{

    public static void main(String[] args) 
    {
        //create a polymorphici array stores object of different classes
        ArrayList<CarbonFootprint> CarbonFootArray = new ArrayList<CarbonFootprint>();
        
        //created the objects in our classes
        Building myBuilding = new Building(60);
        Car myCar = new Car(500);
        Bicycle myBicycle = new Bicycle(10);
        
        //adding up the objects
        CarbonFootArray.add(myBuilding);
        CarbonFootArray.add(myCar);
        CarbonFootArray.add(myBicycle);
        
        //create for loop to print
        for(CarbonFootprint carbonFootprint : CarbonFootArray) 
        {
            //string
            System.out.println(carbonFootprint.getCarbonFootprint());
        }
    }
}
    

