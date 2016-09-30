package ie.ahern.eoin.demo.teamworkapp.teamworkapp.presentation.presenters;

import ie.ahern.eoin.demo.teamworkapp.teamworkapp.presentation.view.fragment.viewInterface.LoginView;

/**
 * Created by eoin_pc on 29/09/2016.
 */
public class LoginPresenter extends BasePresenter<LoginView> {


    public void LoginPresenter()
    {



    }


    public void LoginUser()
    {

    }


    public void Detach()
    {
        //detach subscriber;

       if(isAttached())
           detach();
    }
}
