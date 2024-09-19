public class Bank{
private long accno;
private double balance;

public void setAccno( long newaccno){
accno=newaccno;}
public long getAccno(){
return accno;}
public void setBalance(double newbalance){
balance=newbalance;}
public double getBalance(){
return balance;}
public void deposit(double amount){
balance=+amount;}
public void withdraw(double amount){
if (amount<=balance)
balance=-amount;}















}