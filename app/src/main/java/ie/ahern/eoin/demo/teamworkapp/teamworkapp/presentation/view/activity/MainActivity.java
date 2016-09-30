package ie.ahern.eoin.demo.teamworkapp.teamworkapp.presentation.view.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import ie.ahern.eoin.demo.teamworkapp.teamworkapp.R;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button button = null;


        button.setOnClickListener((x) -> {
            //do shit!!!
        });
    }
}
