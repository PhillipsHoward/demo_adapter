package fr.wcs.demo_adapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<Monster> monsters = creatingMonsters();
        ListView listMonsters = findViewById(R.id.list_view);

        MonsterAdapter adapter = new MonsterAdapter(this, monsters);
        listMonsters.setAdapter(adapter);

    }

    public ArrayList<Monster> creatingMonsters() {

        ArrayList<Monster> monsters = new ArrayList<Monster>();
        monsters.add (new Monster("Bobby", 34, 6, false) );
        monsters.add (new Monster("Rex", 32, 7, true) );
        monsters.add (new Monster("Veloraptor", 45, 5, false) );
        monsters.add (new Monster("Annihilator", 12, 2, true) );
        monsters.add (new Monster("Godzilla", 76, 13, true) );
        monsters.add (new Monster("Wulf", 56, 12, false) );
        monsters.add (new Monster("Tekatosaure", 76, 11, false) );
        monsters.add (new Monster("Raggasanska", 12, 3, true) );

        return monsters;

    }



}
