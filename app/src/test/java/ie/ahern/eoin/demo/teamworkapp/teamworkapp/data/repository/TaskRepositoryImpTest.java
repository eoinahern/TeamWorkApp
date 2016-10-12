package ie.ahern.eoin.demo.teamworkapp.teamworkapp.data.repository;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.List;

import ie.ahern.eoin.demo.teamworkapp.teamworkapp.data.web.RestAPICalls;
import ie.ahern.eoin.demo.teamworkapp.teamworkapp.domain.domain.model.Task.Task;
import rx.Observable;

import static org.junit.Assert.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * Created by eoin_a on 12/10/2016.
 */
public class TaskRepositoryImpTest {


    private TaskRepositoryImp taskrepo;
    @Mock RestAPICalls restcalls;
    @Mock Observable<List<Task>> mocktasks;
    @Mock Task mocktask;
    private final String taskid = "task";

    @Before
    public void setup()
    {
        MockitoAnnotations.initMocks(this);
        taskrepo = new TaskRepositoryImp(restcalls);

    }
    @Test
    public void getAllTasks() throws Exception {


        when(restcalls.getTasks()).thenReturn(mocktasks);
        Observable<List<Task>> obstask = taskrepo.getAllTasks();
        verify(restcalls).getTasks();

    }

    @Test
    public void getAllProjTasks() throws Exception {

        when(restcalls.getProjectTasks("task")).thenReturn(mocktasks);
        taskrepo.getAllProjTasks("task");
        verify(restcalls).getProjectTasks("task");
    }


    @Test
    public void getATask() throws Exception {


        when(restcalls.getATask(taskid)).thenReturn(Observable.just(mocktask));
        taskrepo.getATask(taskid);
        verify(restcalls).getATask(taskid);
    }

    @Test
    public void markTaskComplete() throws Exception {


        when(restcalls.markTaskComplete(taskid)).thenReturn(true);
        boolean ans = taskrepo.markTaskComplete(taskid);
        verify(restcalls).markTaskComplete(taskid);
        assertEquals(ans, true);

    }

    @Test
    public void markTaskIncomplete() throws Exception {


        when(restcalls.markTaskIncomplete(taskid)).thenReturn(true);
        boolean ans = taskrepo.markTaskIncomplete(taskid);
        verify(restcalls).markTaskIncomplete(taskid);
        assertEquals(ans, true);

    }

}