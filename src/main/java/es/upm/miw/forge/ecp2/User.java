package es.upm.miw.forge.ecp2;

public class User {
    private int number;

    private String name;

    private String familyName;
    
    private String address;

    private String format(String string) {
        string = string.trim();
        return string.substring(0, 1).toUpperCase() + string.substring(1).toLowerCase();
    }

    public User(int number, String name, String familyName, String address) {
        this.number = number;
        this.name = this.format(name);
        this.familyName = this.format(familyName);
        this.address = this.format(address);
    }

    public int getNumber() {
        return this.number;
    }

    public String getName() {
        return this.name;
    }

    public String getFamilyName() {
        return this.familyName;
    }

    public String getAddress() {
        return this.address;
    }
    
    public String fullName() {
        return this.name + " " + this.familyName;
    }

    public String initials() {
        return this.name.substring(0, 1) + ".";
    }
}
