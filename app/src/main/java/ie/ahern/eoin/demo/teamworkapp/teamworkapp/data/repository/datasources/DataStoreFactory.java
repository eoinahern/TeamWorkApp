package ie.ahern.eoin.demo.teamworkapp.teamworkapp.data.repository.datasources;

import android.content.Context;

import javax.inject.Inject;

/**
 * Created by eoin_pc on 06/10/2016.
 * select the repo to use depending on what is required
 */

public class DataStoreFactory {


    private WebDataStore webstore;
    private DBDatatore dbstore;


    @Inject
    public DataStoreFactory(Context cont)
    {
        //setup data. need to send in context

        webstore = new WebDataStore();


    }

    public DataStore getDataStore()
    {

        //use web for now
        return webstore;
    }




}
