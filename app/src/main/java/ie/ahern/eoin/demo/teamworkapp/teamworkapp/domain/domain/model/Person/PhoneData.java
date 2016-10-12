package ie.ahern.eoin.demo.teamworkapp.teamworkapp.domain.domain.model.Person;

/**
 * Created by eoin_a on 12/10/2016.
 * value obj immutable
 */

public class PhoneData {


    private String phone_mobile;
    private String phone_office;
    private String phone_office_ext;
    private String phone_fax;
    private String phone_home;


    public String getPhone_mobile() {
        return phone_mobile;
    }

    public String getPhone_office() {
        return phone_office;
    }

    public String getPhone_office_ext() {
        return phone_office_ext;
    }

    public String getPhone_home() {
        return phone_home;
    }

    public String getPhone_fax() {
        return phone_fax;
    }
}
