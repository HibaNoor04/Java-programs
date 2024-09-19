
public class Driver{

public static void main(String a[]){
Campus c1=new Campus();
c1.setCampusname("lahore campus");
University u1=new University();
u1.setUniname("Comsats university");
//setting deaprtment attributes 
//for lahore campus:

Department se=new Department();
Department cs=new Department();

se.setName("software engineering");
se.setHod("noor");
cs.setName("computer science");
cs.setHod("adeel");
//passing department info into campus class:


c1.setSe(se);
c1.setCs(cs);
//passing campus info to uni classs:

u1.setLahore(c1);
//for islamabad campus:

Campus c2=new Campus();
c2.setCampusname("islamabad campus");
Department se1=new Department();
Department cs1=new Department();
se1.setName("english");
se1.setHod("toobah");
cs1.setName("science");
cs1.setHod("rao");
c2.setSe(se1);
c2.setCs(cs1);
u1.setIsl(c2);
u1.displayuni();






}

















}