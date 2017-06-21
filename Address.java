
public class Address    //public keyword means class is available to other classes in this program
{
    // attributes (variables that each instance is given a set of), private meaning accesible only within the declared class itself
    private int houseNumber;
    private String streetName;
    private String village;
    private String townCity;
    private String county;
    private String postCode;

    //constructor method 
    public Address(int houseNumber, String streetName, String village, String townCity, String county, String postCode) 
    {        
        this.houseNumber = houseNumber;
        this.streetName = streetName;
        this.village = village;
        this.townCity = townCity;
        this.county = county;
        this.postCode = postCode;
    }

    //override the toString() method, if you don't have this when outputting you get a reference to the object
    // not the values of the object
    @Override   
    public String toString() 
    {
        return this.houseNumber + ", " + this.streetName + ", " +   this.village + ", " + this.townCity + ", " + this.county + ", " + this.postCode;
    }

    //methods - getters and setters
    public int getHouseNumber() { return houseNumber;}

    public String getstreetName() {return streetName;}

    public String getVillage() {return village;}
    
    public String getTownCity() {return townCity;}
    
    public String getCounty() {return county;}
    
    public String getPostCode() {return postCode;}

    //this keyword highlights that the attribute is being assigned to rather than the parameter being assigned to itself
    public void setHouseNumber(int houseNumber) {this.houseNumber = houseNumber;}

    public void setStreetName(String streetName){this.streetName = streetName;}

    public void setVillage(String village){this.village = village;}
    
    public void setTownCity(String townCity){this.townCity = townCity;}
    
    public void setCounty(String county){this.county = county;}
    
    public void setPostCode(String postCode){this.postCode = postCode;}
}
