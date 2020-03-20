package lab.one;

import android.util.Log;

interface InterfaceExample {
    public void exampleAction();  // This is an example interface method
    public void exampleActionTwo();
}

public class Example extends AbstractClassExample implements InterfaceExample {
    public String name;
    private String lastName;
    protected String id;

    @Override
    public void exampleAction() {

    }

    public void exampleActionTwo() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void logTheName() {
        Log.d( "example", "The name is : " + name );
    }

}