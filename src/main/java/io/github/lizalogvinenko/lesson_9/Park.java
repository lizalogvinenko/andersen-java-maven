package io.github.lizalogvinenko.lesson_9;

import java.util.ArrayList;
import java.util.List;

public class Park {
    private final List<Attraction> attractions = new ArrayList<>();

    public void addAttraction(String name, String workingHours, int cost) {
        Attraction attraction = new Attraction(name, workingHours, cost);
        attractions.add(attraction);
    }

    public void printAllAttractions() {
        System.out.println("Attractions: ");
        for (Attraction attraction : attractions) {
            System.out.println(
                    "Attraction " + "'" + attraction.name + "'" +
                            ": Working hours: " + attraction.workingHours +
                            ", Cost: " + attraction.cost);
        }
    }

    public List<Attraction> getAttractions() {
        return attractions;
    }

    public static class Attraction {
        private final String name;
        private final String workingHours;
        private final int cost;

        public Attraction(String name, String workingHours, int cost) {
            this.name = name;
            this.workingHours = workingHours;
            this.cost = cost;
        }

        public String getName() {
            return name;
        }

        public String getWorkingHours() {
            return workingHours;
        }

        public int getCost() {
            return cost;
        }
    }
}
