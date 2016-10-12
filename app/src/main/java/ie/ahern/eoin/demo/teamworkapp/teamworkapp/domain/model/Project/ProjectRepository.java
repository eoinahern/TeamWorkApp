package ie.ahern.eoin.demo.teamworkapp.teamworkapp.domain.model.Project;

import java.util.List;

import rx.Observable;

/**
 * Created by eoin_pc on 12/10/2016.
 */

public interface ProjectRepository {

    Observable<List<Project>> retrieveProjects();
    Observable<Project> retrieveProject(String id);
    boolean starProject(String id);
    boolean unstarProject(String id);
    Observable<List<Project>>  RetrieveStarredProjects(String id);

}
