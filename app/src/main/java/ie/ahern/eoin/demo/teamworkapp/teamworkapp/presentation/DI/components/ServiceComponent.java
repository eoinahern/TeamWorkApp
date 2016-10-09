package ie.ahern.eoin.demo.teamworkapp.teamworkapp.presentation.DI.components;

import dagger.Component;
import ie.ahern.eoin.demo.teamworkapp.teamworkapp.presentation.DI.modules.ServiceModule;

/**
 * Created by eoin_a on 09/10/2016.
 */


@Component(dependencies = {AppComponent.class}, modules = {ServiceModule.class})
public interface ServiceComponent {






}
