package com.example.januprasad.android_play;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements NotesFragment.OnFragmentInteractionListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loadNotesFragment();
    }

    private void loadNotesFragment() {
        getSupportFragmentManager().beginTransaction().add(R.id.content, NotesFragment.makeOneInstance()).commit();
    }
}
