public class Carenginetest{
public static void main(String a[]){
Engine engine=new Engine();
engine.setEnginetype("V6");
 Car car1=new Car();
Car car2=new Car();
//since car is comprised of engine so u just pass engine ka object in car k obj:
car1.setCarname("honda");
car1.setEnginetype(engine);
car2.setCarname("Grandy");
car2.setEnginetype(engine);
//print karao before modifications and then after modifications then look at this code +++ github se link kia
System.out.println(car1.getCarname);
System.out.println(car2.getCarname);
System.out.println(car1.getEnginetype);
System.out.println(car2.getEnginetype);
engine.setEnginetype("V8");
System.out.println(car1.getEnginetype);
System.out.println(car2.getEnginetype);