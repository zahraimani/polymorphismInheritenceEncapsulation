/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample1;

/**
 *
 * @author HP
 */
public class Sample1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        student st1 = new student();
        st1.name= "joe";
        st1.family= "macbay";
        st1.number=2262;
        st1.birthdate= "2.2.1992";
        st1.print();
       // st1.print1();
        
        
       
        
        student st2 = new student();
        st2.name="lisa";
        st2.family="lockwood";
        st2.birthdate="3.10.1991";
        st2.number=9413;
        st2.print();
      //  st2.print1();
        
        student st3 = new student();
        st3.name="ben";
        st3.family="flips";
        st3.birthdate="3.4.1996";
        st3.number=6681;
        st3.print();
      //  st3.print1();
        
        
        
        
        teacher te = new teacher();
        te.name="alec";
        te.family="madden";
        te.rank= 1223;
        te.birthdate="3.11.1975";
        te.print();
       
        
        teacher te2 = new teacher();
        te2.name="tom";
        te2.family="sherwood";
        te2.birthdate="17.9.1958";
        te2.rank=647;
        te2.print();
        
        staff staff1 = new staff();
        staff1.name= "david";
        staff1.family= "scott";
        staff1.birthdate="2.11.1969";
        staff1.idCode=25522;
        staff1.print();
        staff1.print1();
        
        waiter wa1 = new waiter();
        wa1.name="ashton";
        wa1.family="james";
        wa1.birthdate="1.1.1962";
        wa1.idNumber= 23451;
        wa1.print();
        
       
        
    }
    
}
