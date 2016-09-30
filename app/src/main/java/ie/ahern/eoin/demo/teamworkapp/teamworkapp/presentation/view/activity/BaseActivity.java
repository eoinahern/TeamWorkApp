package ie.ahern.eoin.demo.teamworkapp.teamworkapp.presentation.view.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import ie.ahern.eoin.demo.teamworkapp.teamworkapp.TeamWorkApp;

public class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ((TeamWorkApp) getApplication()).getAppComp().inject(this);
    }
}
