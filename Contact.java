////////////////////////////////////////////////////////////////////////////////
//--------------------------------Contact.java--------------------------------//
//                                                                            //
// This program will provide a basic framework for managing contact info of   //
// the user.                                                                  //
//                                                                            //
// Name: Nagabharan Nagendran                                                 //
// Net ID: nxn141730                                                          //
// Date created: 09.19.2014                                                   //
// Purpose: Assignment                                                        //
// Class: CS6301.022 User Interface Design                                    //
////////////////////////////////////////////////////////////////////////////////

public class Contact {
    
    private String FName,MName,LName,Add1,Add2,City,State,Gender,Zip,Phone;

    public Contact(String FName, String MName, String LName, String Add1, String Add2, String City, String State, String Zip, String Gender, String Phone) {
        this.FName = FName;
        this.MName = MName;
        this.LName = LName;
        this.Add1 = Add1;
        this.Add2 = Add2;
        this.City = City;
        this.State = State;
        this.Zip = Zip;
        this.Gender = Gender;
        this.Phone = Phone;
    }

    public String getFName() {
        return FName;
    }

    public String getMName() {
        return MName;
    }

    public String getLName() {
        return LName;
    }

    public String getAdd1() {
        return Add1;
    }

    public String getAdd2() {
        return Add2;
    }

    public String getCity() {
        return City;
    }

    public String getState() {
        return State;
    }

    public String getGender() {
        return Gender;
    }

    public String getZip() {
        return Zip;
    }

    public String getPhone() {
        return Phone;
    }

    public void setFName(String FName) {
        this.FName = FName;
    }

    public void setMName(String MName) {
        this.MName = MName;
    }

    public void setLName(String LName) {
        this.LName = LName;
    }

    public void setAdd1(String Add1) {
        this.Add1 = Add1;
    }

    public void setAdd2(String Add2) {
        this.Add2 = Add2;
    }

    public void setCity(String City) {
        this.City = City;
    }

    public void setState(String State) {
        this.State = State;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public void setZip(String Zip) {
        this.Zip = Zip;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }
    
}