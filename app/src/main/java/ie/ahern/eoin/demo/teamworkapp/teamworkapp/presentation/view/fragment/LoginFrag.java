package ie.ahern.eoin.demo.teamworkapp.teamworkapp.presentation.view.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;

import ie.ahern.eoin.demo.teamworkapp.teamworkapp.R;
import ie.ahern.eoin.demo.teamworkapp.teamworkapp.presentation.presenters.LoginPresenter;
import ie.ahern.eoin.demo.teamworkapp.teamworkapp.presentation.view.fragment.viewInterface.LoginView;

/**
 * A simple {@link Fragment} subclass.
 */
public class LoginFrag extends Fragment implements LoginView {

    private Button login_btn;
    private ProgressBar progbar;

    LoginPresenter pres;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_login, container, false);
    }


    @Override
    public void onViewCreated(View v, Bundle bun)
    {
        pres.attach(this);
    }

    @Override
    public void showLoading()
    {
        //show progressBar!!!
    }

    @Override
    public void hideLoading() {

    }
}
