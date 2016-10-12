package ie.ahern.eoin.demo.teamworkapp.teamworkapp.data.web;

import java.util.Arrays;
import java.util.List;

import ie.ahern.eoin.demo.teamworkapp.teamworkapp.domain.model.Project.Project;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import rx.Observable;

/**
 * Created by eoin_pc on 29/09/2016.
 */
public interface RestAPICalls {


    @GET("projects.json")
    @Headers({
            "username: blink96elbow",
            "password: x"
    })
    Observable<List<Project>> retrieveProjects();

    @GET("projects/{project_id}.json")
    @Headers({
            "username: blink96elbow",
            "password: x"
    })
    Observable<Project> retrieveProject(@Path("project_id") String proId);


    @PUT("projects/{project_id}/star.json")
    @Headers({
            "username: blink96elbow",
            "password: x"
    })
    boolean starProject(@Path("project_id") String proId);


    @PUT("projects/{project_id}/unstar.json")
    @Headers({
            "username: blink96elbow",
            "password: x"
    })
    boolean unstarProject(@Path("project_id") String proId);


    @GET("projects/starred.json")
    @Headers({
            "username: blink96elbow",
            "password: x"
    })
    Observable<List<Project>> retrieveStarredProjects();


}


