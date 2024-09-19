public class Campus{

private String campusname;
private Department se;
private Department cs;

public void setCampusname(String ncampusname){
campusname=ncampusname;}
public String getCampusname(){
return campusname;}

public void setSe(Department s){
se=s;}
public Department getSe(){
return se;}
public void setCs(Department c){
cs=c;}
public Department getCs(){
return cs;}
public void displayinfo(){
System.out.println("Campus name:"+campusname);
se.display();
cs.display();}



}