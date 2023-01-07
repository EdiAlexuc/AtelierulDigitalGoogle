package DesignPatterns.CodeChallenge3;

public class RealEstateAgent {
    public void represent(Apartment apartment){
        System.out.println("Apartment for rent: " + apartment.getLocation()
                            + ", monthly rent cost: " + apartment.getMonthlyRentCost());
    }

    public Apartment rent(Student student){
        if(student.getName().charAt(0) == 'P'){
            System.out.println("SOrry, we cannot rent an apartment to a student whose name starts with the letter P");
            return null;
        }
        if(student.getMoney() < 1000){
            System.out.println("Sorry, you do not have enough money to afford the apartment");
            return null;
        }
        Apartment apartment = new Apartment("Downtown", 1000);
        System.out.println("Congratulations, you have rented an apartment in Downtown for 1000$ per month");
        return apartment;
    }
}
