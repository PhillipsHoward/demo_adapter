package fr.wcs.demo_adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.TextView;
import java.util.ArrayList;

public class MonsterAdapter extends ArrayAdapter<Monster> {


    public MonsterAdapter(Context context, ArrayList<Monster> monsters) {
        super(context, 0, monsters);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Get the data item for this position
        Monster monster = getItem(position);
        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_monster, parent, false);
        }
        // Lookup view for data population
        TextView name = convertView.findViewById(R.id.textDate);
        TextView life = convertView.findViewById(R.id.textFirstname);
        TextView power = convertView.findViewById(R.id.textLastname);
        CheckBox adult = convertView.findViewById(R.id.is_adult);

        // Populate the data into the template view using the data object
        name.setText(monster.getName());
        life.setText(String.valueOf(monster.getName()));
        power.setText(String.valueOf(monster.getPower()));
        adult.setChecked(monster.isAdult());

        // Return the completed view to render on screen
        return convertView;
    }


}
