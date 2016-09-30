package ie.ahern.eoin.demo.teamworkapp.teamworkapp.presentation.DI.modules;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import com.google.gson.Gson;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import ie.ahern.eoin.demo.teamworkapp.teamworkapp.TeamWorkApp;

/**
 * Created by eoin_pc on 30/09/2016.
 */
@Module
public class ApplicationModule {

    private Application app;

    public ApplicationModule(Application twapp)
    {
        app = twapp;
    }

    @Singleton
    @Provides
    public Context getCont()
    {
        return app;
    }


    @Singleton
    @Provides
    public SharedPreferences getPrefs(Application app)
    {
        return PreferenceManager.getDefaultSharedPreferences(app);
    }



    @Singleton
    @Provides
    public Gson getGson()
    {
        return new Gson();
    }
}
