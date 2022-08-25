package org.launchcode.java.demos.lsn7interfaces;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args){
        Case menu = new Case();
        ArrayList<Flavor> flavors = menu.getFlavors();
        ArrayList<Cone> cones = menu.getCones();
        Comparator flavorComparator = new FlavorComparator();
        Comparator coneComparator = new ConeComparator();

        for (Flavor flavor : flavors) {
            System.out.println(flavor.getName());
        }

        flavors.sort(flavorComparator);

        for (Flavor flavor : flavors) {
            System.out.println(flavor.getName());
        }

        for (Cone cone: cones) {
            System.out.println(cone.getCost());
        }

        cones.sort(coneComparator);

        for (Cone cone : cones) {
            System.out.println(cone.getCost());
        }

        // TODO: Use a Comparator class to sort the 'flavors' array alphabetically by the 'name'
        //  field.

        // TODO: Use a Comparator class to sort the 'cones' array in increasing order by the 'cost'
        //  field.

        // TODO: Print the 'flavors' and 'cones' lists (in a clear manner) to verify the sorting.
    }
}
