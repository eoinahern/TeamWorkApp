package ie.ahern.eoin.demo.teamworkapp.teamworkapp.presentation.DI.components;

import android.content.Context;
import android.content.SharedPreferences;

import com.google.gson.Gson;

import javax.inject.Singleton;

import dagger.Component;
import ie.ahern.eoin.demo.teamworkapp.teamworkapp.presentation.DI.modules.ApplicationModule;
import ie.ahern.eoin.demo.teamworkapp.teamworkapp.presentation.view.activity.BaseActivity;

/**
 * Created by eoin_pc on 30/09/2016.
 */
@Singleton
@Component(modules =  ApplicationModule.class)
public interface AppComponent {


    void inject(BaseActivity baseactivity);

    Gson getgson();
    SharedPreferences prefs();
    Context cont();
}
