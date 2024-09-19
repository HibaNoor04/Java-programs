public class University{
private String uniName;
private Campus lahore;
private Campus isl;
public void setUniname(String newuniName){
uniName=newuniName;}
public String getUniname(){
return uniName;}
public void setLahore(Campus l){
lahore=l;}
public Campus getLahore(){
return lahore;}
public void setIsl(Campus i){
isl=i;} 
public Campus getIsl(){
return isl;}
public void displayuni(){
System.out.println("the uni name is :"+uniName);
lahore.displayinfo();
isl.displayinfo();}










}
