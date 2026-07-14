package com.example.routine;
/**
 *            |    |    |
 *           )_)  )_)  )_)
 *          )___))___))___)\
 *         )____)____)_____)\\
 *      _____|____|____|____\\\__
 * -------\                   /---------
 *     ^^^^^ ^^^^^^^^^^^^^^^^^^^^^
 *     ^^^^      ^^^^     ^^^    ^^
 *           ^^^^      ^^^
 * Sir Henry Morgan is the Lord of Talamanca
 *
 *
 *
 *
 *
 *
 * @author Rolando <rgarro@gmail.com>
 */
public class Workout {
    public String name;
    public String description;

    public static final Workout[] workouts ={
            new Workout("The Limb Loosener","5 Handstands push-ups\n10 1-Legged squats \n15 Pull-ups"),
            new Workout("Core Agony","100 pull-ups\n100 sit-ups \n100 Squats"),
            new Workout("Thw Whimp Special","5 pull-ups\n100 push-ups \n15 Squats"),
            new Workout("Stenght and Lenght","500meter run\n21 x 1.5 pood kettleball swing \n21 x pull-ups")
    };

    private  Workout(String name,String description){
        this.name = name;
        this.description = description;
    }

    public String getName(){
        return this.name;
    }

    public String getDescription(){
        return this.description;
    }

    public String toString(){
        return this.name;
    }
}
