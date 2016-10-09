package ie.ahern.eoin.demo.teamworkapp.teamworkapp.domain;

import java.util.List;

import ie.ahern.eoin.demo.teamworkapp.teamworkapp.data.entity.Project;
import ie.ahern.eoin.demo.teamworkapp.teamworkapp.data.entity.Task;
import rx.Observable;

/**
 * Created by eoin_pc on 29/09/2016.
 */
public interface DataRepository {

    Observable<List<Project>> getProjects();
    Observable<List<Task>> getTask();

}



