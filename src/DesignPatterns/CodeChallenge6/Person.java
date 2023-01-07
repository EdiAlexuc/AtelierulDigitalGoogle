package DesignPatterns.CodeChallenge6;

public class Person {
    private final String name;
    private final String job;
    private final String university;
    private final boolean drivingLicense;
    private final boolean isMarried;

    public Person(String name, String job, String university, boolean drivingLicense, boolean isMarried) {
        this.name = name;
        this.job = job;
        this.university = university;
        this.drivingLicense = drivingLicense;
        this.isMarried = isMarried;
    }

    public String getName() {
        return name;
    }

    public String getJob() {
        return job;
    }

    public String getUniversity() {
        return university;
    }

    public boolean isDrivingLicense() {
        return drivingLicense;
    }

    public boolean isMarried() {
        return isMarried;
    }
}
