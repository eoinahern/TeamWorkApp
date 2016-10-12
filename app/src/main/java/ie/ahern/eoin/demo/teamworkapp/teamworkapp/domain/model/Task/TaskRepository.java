package ie.ahern.eoin.demo.teamworkapp.teamworkapp.domain.model.Task;

import java.util.List;

import rx.Observable;

/**
 * Created by eoin_pc on 12/10/2016.
 */

public interface TaskRepository {

    Observable<List<Task>> getAllTasks();
    Observable<List<Task>> getAllProjTasks(String projid);
    Observable<Task> getATask(String taskid);

    boolean markTaskComplete(String ptaskid);

    boolean markTaskIncomplete( String ptaskid);

}
