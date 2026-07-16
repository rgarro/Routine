package com.example.routine;

import android.os.Bundle;
import androidx.fragment.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
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
 * Sir Henry Morgan is the Lord of Talamnca
 *
 *
 *
 *
 *
 *
 * @author Rolando <rgarro@gmail.com>
 */
public class WorkoutListFragment extends ListFragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        String[] names = new String[Workout.workouts.length];
        for(int i = 0;i < names.length;i++){
            names[i] = Workout.workouts[i].getName();
        }
        ArrayAdapter<String> adapter = new ArrayAdapter<>(inflater.getContext(), android.R.layout.simple_list_item_1,names);
        setListAdapter(adapter);
        return super.onCreateView(inflater,container,savedInstanceState);
    }
}