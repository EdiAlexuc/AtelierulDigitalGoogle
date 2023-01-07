package DesignPatterns.CodeChallenge3;

public class RealEstateAgentProxy {
    private RealEstateAgent realEstateAgent;

    public RealEstateAgentProxy(){
        this.realEstateAgent = new RealEstateAgent();
    }
    public void represent(Apartment apartment){
        realEstateAgent.represent(apartment);
    }
    public Apartment rent(Student student){
        if(student.getName().charAt(0) == 'P'){
            System.out.println("SOrry, we cannot rent an apartment to a student whose name starts with the letter P");
            return null;
        }
        return realEstateAgent.rent(student);
    }
}
