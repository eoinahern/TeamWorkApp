package ie.ahern.eoin.demo.teamworkapp.teamworkapp.data.web;

import java.util.List;

import ie.ahern.eoin.demo.teamworkapp.teamworkapp.data.entity.Project;
import ie.ahern.eoin.demo.teamworkapp.teamworkapp.data.entity.Task;
import retrofit2.http.GET;
import retrofit2.http.Path;
import rx.Observable;

/**
 * Created by eoin_pc on 29/09/2016.
 */
public interface RestAPICalls {

    @GET(".json")
    Observable<List<Project>> getProjects();

    @GET(".json")
    Observable<List<Task>> getTask();

}
