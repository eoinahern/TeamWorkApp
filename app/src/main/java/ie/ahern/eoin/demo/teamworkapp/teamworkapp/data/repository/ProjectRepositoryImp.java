package ie.ahern.eoin.demo.teamworkapp.teamworkapp.data.repository;

import java.util.List;

import javax.inject.Inject;

import ie.ahern.eoin.demo.teamworkapp.teamworkapp.data.web.RestAPICalls;
import ie.ahern.eoin.demo.teamworkapp.teamworkapp.domain.domain.model.Project.Project;
import ie.ahern.eoin.demo.teamworkapp.teamworkapp.domain.domain.model.Project.ProjectRepository;
import rx.Observable;

/**
 * Created by eoin_pc on 12/10/2016.
 */

public class ProjectRepositoryImp implements ProjectRepository {


    private RestAPICalls restcalls;


    @Inject
    public ProjectRepositoryImp(RestAPICalls restcalls)
    {
        this.restcalls = restcalls;
    }

    @Override
    public Observable<List<Project>> retrieveProjects() {
       return restcalls.retrieveProjects();
    }

    @Override
    public Observable<Project> retrieveProject(String id) {
        return restcalls.retrieveProject(id);
    }

    @Override
    public boolean starProject(String id) {
       return restcalls.starProject(id);
    }

    @Override
    public boolean unstarProject(String id) {
        return restcalls.unstarProject(id);
    }

    @Override
    public Observable<List<Project>> RetrieveStarredProjects() {
       return restcalls.retrieveStarredProjects();
    }
}
