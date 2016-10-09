package ie.ahern.eoin.demo.teamworkapp.teamworkapp.data.repository.datasources;

import java.util.List;

import javax.inject.Inject;

import ie.ahern.eoin.demo.teamworkapp.teamworkapp.data.entity.Project;
import ie.ahern.eoin.demo.teamworkapp.teamworkapp.data.entity.Task;
import ie.ahern.eoin.demo.teamworkapp.teamworkapp.domain.DataRepository;
import rx.Observable;

/**
 * Created by eoin_pc on 06/10/2016.
 */

public class DataRepositoryImp  implements DataRepository {


    //contains factory class.
    //factory determines what DataStore is Used

    private DataStoreFactory factory;


    @Inject
    public DataRepositoryImp(DataStoreFactory factory)
    {
        this.factory = factory;
    }

    @Override
    public Observable<List<Project>> getProjects() {
       return  factory.getDataStore().getProjects();
    }

    @Override
    public Observable<List<Task>> getTask() {
        return factory.getDataStore().getTask();
    }
}
