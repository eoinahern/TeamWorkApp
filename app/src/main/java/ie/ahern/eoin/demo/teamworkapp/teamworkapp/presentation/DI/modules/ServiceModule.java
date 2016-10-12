package ie.ahern.eoin.demo.teamworkapp.teamworkapp.presentation.DI.modules;

import android.content.Context;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import ie.ahern.eoin.demo.teamworkapp.teamworkapp.data.web.RestAPICalls;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by eoin_pc on 06/10/2016.
 */


@Module
public class ServiceModule {


    @Provides
    @Singleton
    @Named("url")
    public String getEndpoint()
    {
        return "https://independent13.teamwork.com/";
    }


    @Provides
    @Singleton
    public RestAPICalls getWebService(@Named("key") String key,@Named("url") String url, Context cont)
    {

        Retrofit retrofit = new Retrofit.Builder()
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(url)
                .build();

        return  retrofit.create(RestAPICalls.class);
    }
}
