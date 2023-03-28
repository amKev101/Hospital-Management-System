/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital.management.system;

/**
 *
 * @author Mukuria
 */
public class Pat {
     private String Firstname, Surname ,email;
    private int  IDNO, Phone_No;
    Pat(String Firstname,String Surname, int IDNO, String email, int Phone_No)
    {
        this.Firstname=Firstname;
        this.Surname=Surname;
        this.IDNO=IDNO;
        this.email=email;
        this.Phone_No=Phone_No;
    }
public String getFirstname(){
     return Firstname;}
public String getSurname(){
     return Surname;}
public int getIDNO(){
     return IDNO;}
public String getemail(){
     return email;}
public int getPhone_No(){
     return Phone_No;}
}

