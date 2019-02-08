public class Rep {
    
    // fields: All of the data encapsulated by the class.
    private String firstName;
    private String lastName;
    private int yearElected;
    private String state;
    private int district;
    private String party;
    private String gender;
    
    // constructor method: Creates a new instance of Rep using given data.
    public Rep(String firstName,
               String lastName,
               int yearElected,
               String state,
               int district,
               String party,
               String gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearElected = yearElected;
        this.state = state;
        this.district = district;
        this.party = party;
        this.gender = gender;
    }
    
    // overloading: We can write more than one definition for a method using
    // different "signatures", i.e. different sets parameters.
    // Here, we define a vacant seat.
    public Rep(String state,
               int district) {
        this.state = state;
        this.district = district;
    }
    
    // pure method: Returns or prints something, does not change object.
    public int yearsServed() {
        return 2019 - this.yearElected;
    }
    
    // toString method: Returns a nice String representation. If you try to print
    // a Rep, this will be implicitly called.
    public String toString() {
        return "Rep. " + this.firstName +" " + this.lastName + " (" +
               this.party + " " + this.state + "-" + this.district + ")";
    }
    
    // equals method: Determines whether two instances of Rep are the same.
    // Returns true if all fields are equal, false if any differences exist.
    public boolean equals(Rep other) {
        if (!this.firstName.equals(other.firstName)) {
            return false;
        } else if (!this.lastName.equals(other.firstName)) {
            return false;
        } else if (this.yearElected != other.yearElected) {
            return false;
        } else if (!this.state.equals(other.state)) {
            return false;
        } else if (this.district != other.district) {
            return false;
        } else if (!this.party.equals(other.party)) {
            return false;
        } else if (!this.gender.equals(other.gender)) {
            return false;
        }
        return true;
    }
    
    // getter method: Allows access to a private field.
    public String getState() {
        return this.state;
    }
    
    // setter method: Allows private field to be changed. 
    // This is an example of a modifier method, which is any method that changes a field.
    public void setState(String state) {
        this.state = state;
    }

}












