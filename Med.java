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
public class Med {
     private String Name,Exp,Ref, effects ,Machine,Using,Storage;
    private int  Dose ;
    Med(String Name,String Ref, int Dose,String Exp, String effects, String machine,String Usage,String Storage)
    {
        this.Name=Name;
        this.Ref=Ref;
        this.Dose=Dose;
        this.Exp=Exp;
        this.effects=effects;
         this.Machine=machine;
          this.Using=Usage;
           this.Storage=Storage;
    }
public String getName(){
     return Name;}
public String getRef(){
     return Ref;}
public int getDose(){
     return Dose;}
public String getExp(){
     return Exp;}
public String geteffects(){
     return effects;}
public String getMachine(){
     return Machine;}
public String getUsing(){
     return Using;}

public String getStorage(){
     return Storage;}
}
