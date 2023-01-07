package DesignPatterns.CodeChallenge6;

public class PersonBuilder {
    private final String name;
    private String job;
    private String university;
    private boolean drivingLicense;
    private boolean isMarried;

    public PersonBuilder(String name){
        this.name = name;
    }
    public PersonBuilder withJob(String job){
        this.job = job;
        return this;
    }
    public PersonBuilder withUniversity(String university){
        this.university = university;
        return this;
    }

    public PersonBuilder withDrivingLicense(boolean drivingLicense){
        this.drivingLicense = drivingLicense;
        return this;
    }
}
