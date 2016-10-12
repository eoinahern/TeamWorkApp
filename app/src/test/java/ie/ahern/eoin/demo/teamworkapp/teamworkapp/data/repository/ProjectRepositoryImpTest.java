package ie.ahern.eoin.demo.teamworkapp.teamworkapp.data.repository;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.List;

import ie.ahern.eoin.demo.teamworkapp.teamworkapp.data.web.RestAPICalls;
import ie.ahern.eoin.demo.teamworkapp.teamworkapp.domain.domain.model.Project.Project;
import rx.Observable;

import static org.mockito.Matchers.anyBoolean;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * Created by eoin_a on 12/10/2016.
 */
public class ProjectRepositoryImpTest {


    private ProjectRepositoryImp projectrepo;
    @Mock private RestAPICalls restcalls;
    @Mock private Observable<List<Project>> obs;
    @Mock private Project mockproj;


    @Before
    public void Setup(){

        MockitoAnnotations.initMocks(this);
        projectrepo = new ProjectRepositoryImp(restcalls);
    }

    @Test
    public void retrieveProjects() throws Exception {

        Mockito.when(restcalls.retrieveProjects()).thenReturn(obs);
        Observable observ = projectrepo.retrieveProjects();
        verify(restcalls).retrieveProjects();
        Assert.assertEquals(observ, obs);

    }

    @Test
    public void retrieveProject() throws Exception {

        Mockito.when(restcalls.retrieveProject(anyString())).thenReturn(Observable.just(mockproj));
        Observable<Project> proj = projectrepo.retrieveProject(anyString());
        verify(restcalls).retrieveProject(anyString());

    }

    @Test
    public void starProject() throws Exception {

        when(restcalls.starProject(anyString())).thenReturn(anyBoolean());
        projectrepo.starProject("boo");
        verify(restcalls).starProject("boo");

    }

    @Test
    public void unstarProject() throws Exception {
        when(restcalls.unstarProject(anyString())).thenReturn(anyBoolean());
        projectrepo.unstarProject("boo");
        verify(restcalls).unstarProject("boo");

    }

    @Test
    public void retrieveStarredProjects() throws Exception {
        when(restcalls.retrieveStarredProjects()).thenReturn(obs);
        projectrepo.RetrieveStarredProjects();
        verify(restcalls).retrieveStarredProjects();

    }

}