package ie.ahern.eoin.demo.teamworkapp.teamworkapp.presentation.DI.modules;

import android.content.SharedPreferences;

import com.google.gson.Gson;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by eoin_pc on 30/09/2016.
 */
@Module
public class ApplicationModule {


    public ApplicationModule()
    {

    }


    @Provides
    @Singleton
    public SharedPreferences getPrefs()
    {

    }



    @Provides
    @Singleton
    public Gson getGson()
    {
        return new Gson();
    }
}
