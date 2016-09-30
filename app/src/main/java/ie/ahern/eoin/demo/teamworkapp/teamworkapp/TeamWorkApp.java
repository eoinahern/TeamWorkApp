package ie.ahern.eoin.demo.teamworkapp.teamworkapp;

import android.app.Application;

import ie.ahern.eoin.demo.teamworkapp.teamworkapp.presentation.DI.components.AppComponent;
import ie.ahern.eoin.demo.teamworkapp.teamworkapp.presentation.DI.modules.ApplicationModule;

/**
 * Created by eoin_pc on 29/09/2016.
 */
public class TeamWorkApp extends Application {


    private AppComponent appcomp;

    @Override
    public void onCreate()
    {
        super.onCreate();
        appcomp = DaggerAppComponent.builder()
                .applicationModule(new ApplicationModule(this)).build();

    }



    public AppComponent getAppComp()
    {
        return appcomp;
    }
}
