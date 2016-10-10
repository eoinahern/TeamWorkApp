package ie.ahern.eoin.demo.teamworkapp.teamworkapp.domain.interactor;

import ie.ahern.eoin.demo.teamworkapp.teamworkapp.domain.DataRepository;
import rx.Observable;
import rx.Scheduler;
import rx.Subscriber;

/**
 * Created by eoin_pc on 29/09/2016.
 */
public class Register  extends UseCase {


    private DataRepository datarepo;

    public Register(DataRepository repo, Scheduler androidscheduler, Scheduler mainscheduler)
    {
        super(androidscheduler, mainscheduler);
        datarepo = repo;
    }


    @Override
    public Observable BuildUsecaseObservable() {
        return datarepo.getProjects();
    }
}
