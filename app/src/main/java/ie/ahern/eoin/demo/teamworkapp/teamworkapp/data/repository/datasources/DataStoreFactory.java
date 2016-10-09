package ie.ahern.eoin.demo.teamworkapp.teamworkapp.data.repository.datasources;

import android.content.Context;

import javax.inject.Inject;

import ie.ahern.eoin.demo.teamworkapp.teamworkapp.data.web.RestAPICalls;

/**
 * Created by eoin_pc on 06/10/2016.
 * select the repo to use depending on what is required
 */

public class DataStoreFactory {


    private WebDataStore webstore;
    private DBDatatore dbstore;


    @Inject
    public DataStoreFactory(RestAPICalls resapicalls)
    {
        webstore = new WebDataStore(resapicalls);
    }

    public DataStore getDataStore()
    {
        return webstore;
    }




}
