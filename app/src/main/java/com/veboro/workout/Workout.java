package com.veboro.workout;

public class Workout {
    private String name;
    private String description;


    private Workout(String name, String description){
        this.name = name;
        this.description = description;
    }

    public static final Workout[] workouts = {
            new Workout("The Limb Loosener","5 Handstand push-ups\n10 1-legged squats\n15-ups"),
            new Workout("Core Agony","100 Pull-ups\n100 Push-ups\n100 Sit-ups\n100 Squats"),
            new Workout("Strenght and Length","500 meter run\n21 x 1.5 pood kettleball swing\n21 x pull-ups")
    };

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
