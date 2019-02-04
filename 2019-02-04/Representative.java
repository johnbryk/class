public class Representative {
    
    private String firstName;
    private String lastName;
    private int yearElected;
    private String state;
    private int district;
    private String party;
    private String gender;
    
    public Representative(String firstName,
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
    
    public int yearsServed() {
        return 2019 - this.yearElected;
    }

    public String toString() {
        return "Rep. " + this.firstName +
               " " + this.lastName + " (" +
               this.party + " " + this.state +
               "-" + this.district + ")";
    }

}
