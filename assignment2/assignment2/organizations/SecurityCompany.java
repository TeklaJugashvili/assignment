package assignment2.organizations;

import assignment2.commons.Contactable;
import assignment2.commons.Organization;
import assignment2.organizations.security.Guard;

import java.util.ArrayList;
import java.util.List;

public class SecurityCompany extends Organization implements Contactable {
    private String email;
    private String address;
    private String phoneNumber;
    private List<Guard> guards = new ArrayList<>();

    public SecurityCompany(String name, String description, String email, String address, String phoneNumber) {
        super();
        setName(name);
        setDescription(description);
        this.email = email;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String getAddress() {
        return address;
    }

    public void addGuard(Guard guard) {
        guards.add(guard);
    }

    public boolean removeGuard(Guard guard) {
        return guards.remove(guard);
    }

    public List<Guard> getGuards() {
        return guards;
    }
}
