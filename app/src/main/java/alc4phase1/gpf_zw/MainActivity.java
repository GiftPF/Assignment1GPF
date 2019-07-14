package alc4phase1.gpf_zw;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button ButtonAbout, ButtonProfile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButtonAbout = findViewById(R.id.button_about);
        ButtonProfile = findViewById(R.id.button_profile);

        ButtonAbout.setOnClickListener(this);
        ButtonProfile.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.button_about:
                OpenActivity(AboutActivity.class);
                break;
            case R.id.button_profile:
                OpenActivity(ProfileActivity.class);
                break;
           default:
               break;
        }
    }

    private void OpenActivity(Class newClass){
        Intent intent = new Intent(this, newClass);
        startActivity(intent);
    }

}
