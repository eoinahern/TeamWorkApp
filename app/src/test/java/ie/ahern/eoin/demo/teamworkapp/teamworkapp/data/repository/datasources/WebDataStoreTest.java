package ie.ahern.eoin.demo.teamworkapp.teamworkapp.data.repository.datasources;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.List;

import ie.ahern.eoin.demo.teamworkapp.teamworkapp.data.entity.Project;
import ie.ahern.eoin.demo.teamworkapp.teamworkapp.data.entity.Task;
import ie.ahern.eoin.demo.teamworkapp.teamworkapp.data.web.RestAPICalls;
import rx.Observable;

import static org.junit.Assert.*;
import static org.mockito.Matchers.any;
import static org.mockito.Matchers.anyString;

/**
 * Created by eoin_a on 09/10/2016.
 */
public class WebDataStoreTest {

    private WebDataStore webdatastore;

    @Mock
    private RestAPICalls mockrestservice;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        webdatastore = new WebDataStore(mockrestservice);
    }


    @Test
    public void testGetProjects()
    {
        Observable<List<Project>> returnedobs = webdatastore.getProjects();
        Assert.assertNotNull(returnedobs);
    }

    @Test
    public void testGetTasks()
    {

        Observable<List<Task>>  obs = webdatastore.getTask();
        Assert.assertNotNull(obs);
    }




}