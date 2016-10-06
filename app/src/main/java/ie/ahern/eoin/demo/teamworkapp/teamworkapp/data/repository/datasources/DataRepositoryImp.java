package ie.ahern.eoin.demo.teamworkapp.teamworkapp.data.repository.datasources;

import java.util.List;

import ie.ahern.eoin.demo.teamworkapp.teamworkapp.data.entity.Project;
import ie.ahern.eoin.demo.teamworkapp.teamworkapp.data.entity.Task;
import ie.ahern.eoin.demo.teamworkapp.teamworkapp.domain.DataRepository;
import rx.Observable;

/**
 * Created by eoin_pc on 06/10/2016.
 */

public class DataRepositoryImp  implements DataRepository{


    //contains factory class.
    //factory determines what DataStore is Used


    public DataRepositoryImp()
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
