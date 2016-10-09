package ie.ahern.eoin.demo.teamworkapp.teamworkapp.domain.interactor;

import javax.inject.Inject;

import ie.ahern.eoin.demo.teamworkapp.teamworkapp.domain.DataRepository;
import rx.Observable;
import rx.Scheduler;
import rx.Subscriber;
import rx.Subscription;

/**
 * Created by eoin_pc on 29/09/2016.
 */
public abstract class UseCase {

    private Subscription subscription;
    private Scheduler androidscheduler;
    private Scheduler mainscheduler;

    public UseCase(Scheduler androidscheduler, Scheduler mainshceduler)
    {
        this.androidscheduler = androidscheduler;
        this.mainscheduler = mainshceduler;
    }


    public void execute(Subscriber subscriber)
    {
        subscription = BuildUsecaseObservable()
                .subscribeOn(androidscheduler).observeOn(mainscheduler)
                .subscribe(subscriber);
    }


    public void unsubscribe()
    {
        if(subscription != null && !subscription.isUnsubscribed())
            subscription.unsubscribe();
    }

    public abstract Observable BuildUsecaseObservable();


}
