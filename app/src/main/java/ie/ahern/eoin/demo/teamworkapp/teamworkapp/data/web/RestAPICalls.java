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

    @GET("{key}/")
    Observable<List<Project>> getProjects(@Path("key") String key);

    @GET("{key}/")
    Observable<List<Task>> getTask(@Path("user") String key);

}
