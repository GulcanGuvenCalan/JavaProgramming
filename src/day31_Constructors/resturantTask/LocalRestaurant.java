package day31_Constructors.resturantTask;

import java.util.ArrayList;
import java.util.Arrays;

public class LocalRestaurant {
    public static void main(String[] args) {
        //Servers
         Server server1=new Server("Ayse",23,34,true);
         Server server2=new Server("Mehmet",22,30,false);
         Server server3=new Server("Nazira",24,34,true);
         Server server4=new Server("Gule",25,32,false);
        Server[] servers={server1,server2,server3,server4};

         //Chefs

        Chef chef1=new Chef("Fidan",26,40,true);
        Chef chef2=new Chef("Yasin",27,45,false);
        Chef chef3=new Chef("Sevcan",30,43,true);
        Chef chef4=new Chef("Ayhan",32,42,false);

       Chef[] chefs={chef1,chef2,chef3,chef4};

        //Restaurant

        Restaurant restaurant=new Restaurant("Kadir","USA",5);
        restaurant.hireServer(servers);
        restaurant.hireChef(chefs);

        System.out.println(restaurant);


    }
}
/*
6.4. Create a class LocalRestaurant that has a main method with the following:
	        	- Make a Restaurant object
	        	- Create an array of servers with their information set. Add those initial servers to the ArrayList of Servers in the Restaurant object
	            - Create an array of chefs with their information set. Add those initial chefs to the ArrayList of Chefs in the Restaurant object

	            - Print your whole restaurants information

 */