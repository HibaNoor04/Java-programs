public class Tester{
public static void main(String [] a){
//making object of shelf class and declaring the attributes name simply
Shelf s1=new Shelf();
s1.setShelfname("good books");
//making object of library class and declaring the attributes name simply
Library l=new Library();
l.setLibrary("cui lib");

//setting books attributes:

Book f=new Book();
Book nf=new Book();

f.setTitle("abehayat");
f.setAuthor("umaira ahmed");
nf.setTitle("good doc");
nf.setAuthor("malfoy");
//passing book's info into shelf's object:
s1.setFiction(f);
s1.setNonfiction(nf);
l.setFirstshelf(s1);


Shelf s2=new Shelf();
s2.setShelfname("bad books");
Book f1=new Book();
Book nf1=new Book();

f1.setTitle("adeline");
f1.setAuthor("ahmed");
nf1.setTitle(" doc");
nf1.setAuthor("malice");
s2.setFiction(f1);
s2.setNonfiction(nf1);

l.setSecondshelf(s2);









l.displaylib();}













}