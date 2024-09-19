public class Shelf{
private String shelfname;
private Book fiction;
private Book nonfiction;
public void setShelfname(String nshelfname){
shelfname=nshelfname;}
public String getShelfname(){
return shelfname;}
public void setFiction(Book nfiction){
fiction=nfiction;}
public Book getFiction(){
return fiction;}
public void setNonfiction(Book nnonfiction){
nonfiction=nnonfiction;}
public Book getNonfiction(){
return nonfiction;}
public void displayshelf(){
System.out.println("the shelf name is :"+shelfname);
fiction.displaybook();
nonfiction.displaybook();}









}