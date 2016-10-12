package ie.ahern.eoin.demo.teamworkapp.teamworkapp.data.repository;

import java.util.List;

import ie.ahern.eoin.demo.teamworkapp.teamworkapp.domain.model.Task.Task;
import ie.ahern.eoin.demo.teamworkapp.teamworkapp.domain.model.Task.TaskRepository;
import rx.Observable;

/**
 * Created by eoin_pc on 12/10/2016.
 */

public class TaskRepositoryImp implements TaskRepository {
    @Override
    public Observable<List<Task>> getAllTasks() {
        return null;
    }

    @Override
    public Observable<List<Task>> getAllProjTasks(String projid) {
        return null;
    }

    @Override
    public Observable<Task> getATask(String taskid) {
        return null;
    }

    @Override
    public boolean markTaskComplete(String ptaskid) {
        return false;
    }

    @Override
    public boolean markTaskIncomplete(String ptaskid) {
        return false;
    }
}
