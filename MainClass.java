import java.util.Scanner;
public class MainClass{ 
  public static void main(String args[]){
       Scanner _key = new Scanner(System.in);
double  intX;
double  intZ;
String  text;
double  intY;
text= _key.nextLine();
intX= _key.nextDouble();
intY= _key.nextDouble();
intZ = intX+intY;
if (intZ>10) {
System.out.println(intX);}else {
System.out.println(intY);}

  }}