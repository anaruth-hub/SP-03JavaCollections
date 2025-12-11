package level02AandB;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MainRestaurant {

    public static void main(String[] args) {

        Set<Restaurant> restaurantSet = new HashSet<>();
    Restaurant rest1 = new Restaurant("Restaurant A", 9);
    Restaurant rest2 = new Restaurant("Restaurant A", 7);
    Restaurant rest3 = new Restaurant("Restaurant B", 8);
    Restaurant rest5 = new Restaurant("Restaurant C", 10);

    restaurantSet.add(rest1);
    restaurantSet.add(rest2);
    restaurantSet.add(rest3);
    restaurantSet.add(rest5);

        System.out.println("Restaurants in HashSet (no exact duplicates): ");
        for (Restaurant restaurant : restaurantSet) {
            System.out.println(restaurant);

        }


        List<Restaurant> sortedRestaurants = new ArrayList<>(restaurantSet);

        Collections.sort(sortedRestaurants);

            System.out.println();
            System.out.println("Restaurants sorted by name and qualification");
        for (Restaurant restaurant : sortedRestaurants) {
            System.out.println("name: " + restaurant.getName()
                    + ", rating: " + restaurant.getQualification());
        }

    }
}
