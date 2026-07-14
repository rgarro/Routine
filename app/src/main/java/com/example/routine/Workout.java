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
    };

    private  Workout(String name,String description){
        this.name = name;
        this.description = description;
    }
}
