package com.example.routine;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
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
 * when the dogs Do find her got time time to wait
 *  for tomorrow
 *
 *
 *
 * @author Rolando <rgarro@gmail.com>
 */
public class DetailActivity extends AppCompatActivity {

    public static final String EXTRA_WORKOUT_ID = "id";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        WorkoutDetailFragment frag =(WorkoutDetailFragment) getSupportFragmentManager().findFragmentById(R.id.detail_frag);
        //frag.setWorkout(1);
        int workoutId =(int) getIntent().getExtras().get(EXTRA_WORKOUT_ID);
        frag.setWorkout(workoutId);
    }
}