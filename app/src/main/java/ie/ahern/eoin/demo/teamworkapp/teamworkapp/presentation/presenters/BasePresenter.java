package ie.ahern.eoin.demo.teamworkapp.teamworkapp.presentation.presenters;

/**
 * Created by eoin_pc on 29/09/2016.
 */
public class BasePresenter<V> implements PresenterInt<V>{

    V view;

    @Override
    public void attach(V view) {
        this.view = view;
    }

    @Override
    public void detach() {
        view = null;
    }

    @Override
    public boolean isAttached() {
        if(view != null)
            return true;

        return false;
    }
}
