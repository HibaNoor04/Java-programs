public class Library{
private String library;
private Shelf firstshelf;
private Shelf secondshelf;
public void setLibrary(String name){
library=name;}
public String getLibrary(){
return library;}
public void setFirstshelf(Shelf f){
firstshelf=f;}
public Shelf getFirstshelf(){
return firstshelf;}
public void setSecondshelf(Shelf s){
secondshelf=s;}
public Shelf getSecondshelf(){
return secondshelf;}
public void displaylib(){
System.out.println("the lib name is "+library);
firstshelf.displayshelf();
secondshelf.displayshelf();}













}