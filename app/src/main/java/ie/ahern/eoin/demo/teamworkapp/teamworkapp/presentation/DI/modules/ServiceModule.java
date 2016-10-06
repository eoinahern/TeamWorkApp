package ie.ahern.eoin.demo.teamworkapp.teamworkapp.presentation.DI.modules;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import ie.ahern.eoin.demo.teamworkapp.teamworkapp.data.web.RestAPICalls;

/**
 * Created by eoin_pc on 06/10/2016.
 */


@Module
public class ServiceModule {


    @Singleton
    @Provides
    @Named("key")
    public String apiKey()
    {
        return  "blink96elbow";
    }

    @Provides
    @Singleton
    @Named("")
    public String getEndpoint()
    {
        return "https://independent13.teamwork.com/";
    }


    /*@Provides
    @Singleton
    public RestAPICalls getWebService()
    {

    }*/
}
