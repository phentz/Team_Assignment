package edu.northeastern.team_assignment;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view) {
        int theId = view.getId();
        if(theId == R.id.atYourWebService) {
            Intent intent = new Intent(this, WebService.class);
            startActivity(intent);
        }
    }
}
