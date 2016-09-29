package ie.ahern.eoin.demo.teamworkapp.teamworkapp.presentation.presenters;

/**
 * Created by eoin_pc on 29/09/2016.
 */
public interface PresenterInt<V>
{
    void attach(V view);
    void detach();
    boolean isAttached();
}
