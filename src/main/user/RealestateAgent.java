package main.user;

import main.helper.ApplicationType;
import main.property.Property;
import main.user.RegisteredUser;

import java.util.*;

public class RealestateAgent {
    public ApplicationType applicationType;
    public Boolean accepted;
    public RegisteredUser user;
    public Property property;
    public boolean acceptApplication(){
        return false;
    }
    public boolean rejectApplication(){
        return false;
    }
}
