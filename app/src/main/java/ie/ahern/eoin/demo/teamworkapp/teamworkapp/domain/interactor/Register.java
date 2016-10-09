package ie.ahern.eoin.demo.teamworkapp.teamworkapp.domain.interactor;

import javax.inject.Inject;

import ie.ahern.eoin.demo.teamworkapp.teamworkapp.domain.DataRepository;
import rx.Observable;
import rx.Scheduler;
import rx.Subscriber;

/**
 * Created by eoin_pc on 29/09/2016.
 */
public class Register extends UseCase {


    private DataRepository repo;

    @Inject
    public Register(DataRepository repo,Scheduler androidscheduler, Scheduler mainshceduler) {
        super(androidscheduler, mainshceduler);
        this.repo = repo;
    }

    @Override
    public Observable BuildUsecaseObservable() {
       return repo.getProjects();
    }
}
