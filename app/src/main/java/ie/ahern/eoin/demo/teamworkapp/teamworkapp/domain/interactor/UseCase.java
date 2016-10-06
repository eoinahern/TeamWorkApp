package ie.ahern.eoin.demo.teamworkapp.teamworkapp.domain.interactor;

import rx.Observable;
import rx.Subscription;

/**
 * Created by eoin_pc on 29/09/2016.
 */
public abstract class UseCase {

    private Subscription subscription;



    public void unsubscribe()
    {
        if(subscription != null && !subscription.isUnsubscribed())
            subscription.unsubscribe();
    }

    public abstract Observable BuildUsecaseObservabel();


}
