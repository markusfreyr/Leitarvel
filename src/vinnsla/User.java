package vinnsla;

public class User {
private String name;
private int personalID;
private int age;
private static String gender;

public User(String name, int personalID,int age, String gender){
	this.name = name;
	this.personalID = personalID;
	this.age = age;
	this gender = gender;
}
public String getname() {
	return name;
}
public void setname(String a) {
	name = a;
}
public int getpersonalID() {
	return personalID;
}
public void setpersonalID(int b) {
	personalID = b;
}
public int getage() {
	return age;
}
public void setage(int c) {
	age = c;
}
public static String getgender() {
	return gender;
}
public static void setgender(String d) {
	gender = d;
}
public static void main(String[] args){
	String d ="Karlkyn";
	setgender(d);
	System.out.println(getgender());
}
}

