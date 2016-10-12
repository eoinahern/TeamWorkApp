package ie.ahern.eoin.demo.teamworkapp.teamworkapp.data.repository;

import java.util.List;

import javax.inject.Inject;

import ie.ahern.eoin.demo.teamworkapp.teamworkapp.data.web.RestAPICalls;
import ie.ahern.eoin.demo.teamworkapp.teamworkapp.domain.domain.model.Task.Task;
import ie.ahern.eoin.demo.teamworkapp.teamworkapp.domain.domain.model.Task.TaskRepository;
import rx.Observable;

/**
 * Created by eoin_pc on 12/10/2016.
 */

public class TaskRepositoryImp implements TaskRepository {


    private RestAPICalls restcalls;


    @Inject
    public TaskRepositoryImp(RestAPICalls restcalls)
    {
        this.restcalls = restcalls;
    }


    @Override
    public Observable<List<Task>> getAllTasks() {
        return restcalls.getTasks();
    }

    @Override
    public Observable<List<Task>> getAllProjTasks(String projid) {
        return restcalls.getProjectTasks(projid);
    }

    @Override
    public Observable<Task> getATask(String taskid) {
       return restcalls.getATask(taskid);
    }

    @Override
    public boolean markTaskComplete(String ptaskid) {
       return restcalls.markTaskComplete(ptaskid);
    }

    @Override
    public boolean markTaskIncomplete(String ptaskid) {
        return restcalls.markTaskIncomplete(ptaskid);
    }
}
