package ie.ahern.eoin.demo.teamworkapp.teamworkapp.data.repository.datasources;

import java.util.List;

import javax.inject.Inject;

import ie.ahern.eoin.demo.teamworkapp.teamworkapp.data.entity.Project;
import ie.ahern.eoin.demo.teamworkapp.teamworkapp.data.entity.Task;
import ie.ahern.eoin.demo.teamworkapp.teamworkapp.data.web.RestAPICalls;
import rx.Observable;

/**
 * Created by eoin_pc on 06/10/2016.
 */

public class WebDataStore implements DataStore {


    private RestAPICalls restcalls;


    @Inject
    public WebDataStore(RestAPICalls restcalls)
    {

    }


    @Override
    public Observable<List<Project>> getProjects() {
        return null;
    }

    @Override
    public Observable<List<Task>> getTask() {
        return null;
    }
}
