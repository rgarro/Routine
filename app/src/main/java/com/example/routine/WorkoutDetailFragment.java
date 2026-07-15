package com.example.routine;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
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
 * El Sol estaba en direccion de Cabo Verde curvando hasta Paraguay
 * La Noche pasaba por Vizacaya de Talamanca, venia de Veracruz en direccion a Barranquilla
 * Joseph Bradley ordered to intercept La Noche ...
 * Joshep Bradley owns Puerto Viejo and Cahuita ..
 * En la CASA VIEJA DE MADERA frente al PULPERIA EL POLLO EN TIBAS
 * hay partes de madera del Barco de Joshep Bradley
 *  En el Castillo Azul del Poder Legislativo en Cuesta de Moras
 *  hay partes de madera de LA NOCHE
 * The Tortoise led by one of the Myngs captains sailed straight south from Port Royal
 * interepting LA Noche en Vizcaya , fallaron los duelos en cubierta traicionando los Pasajeros
 * por celebrar las Putas conversas , han usado la Madera de la Noche en Bares y Burdeles ...
 * Chumlee esta en la Vegas y sabe que esto es verdad ...
 *
 *
 * @author Rolando <rgarro@gmail.com>
 */
public class WorkoutDetailFragment extends Fragment {

    private long workoutId;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_workout_detail, container, false);
    }

    @Override
    public void onStart(){
        super.onStart();
        View view = getView();
        if(view != null){
            TextView title = (TextView) view.findViewById(R.id.textTitle);
            Workout workout = Workout.workouts[(int) workoutId];
            title.setText(workout.getName());
            TextView description = (TextView) view.findViewById(R.id.textDescription);
            description.setText(workout.getDescription());
        }
    }

    public void setWorkout(long id){
        this.workoutId = id;
    }
}