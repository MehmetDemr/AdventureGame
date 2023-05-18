import java.util.Scanner;

public class Player {
private int damage,health,money,rHealth;
private String name,cName;
private Inventory inv;
Scanner scan=new Scanner(System.in);

public int getTotalDamage()
{
	return this.getDamage()+this.getInv().getDamage();
}
public Player(String name)
{
	this.name=name;
	this.inv=new Inventory();
}

public void selectCha()
{
switch(chaMenu())
{
case 1:
	initPlayer("Samuray",5,21,15);
	break;
case 2:
	initPlayer("Okçu",7,18,20);
	break;
case 3:
	initPlayer("Şövalye",8,24,5);
	break;
	default:
		initPlayer("Samuray",5,21,15);
		break;
}
	System.out.println("Karakter:"+getcName()+", Hasar:"+getDamage()+",Sağlık:"+getHealth()+", Para:"+getMoney());
	
}
public int chaMenu()
{
System.out.println("Lütfen karakter seçiniz:");	
System.out.println("1-Samuray, Hasar:5, Sağlık:21, Para:15");
System.out.println("2-Okçu,  Hasar:7,  Sağlık:18, Para:20");
System.out.println("3-Şövalye, Hasar:8, Sağlık:24, Para:5");
System.out.println("Karakter Seçiminiz:");
int chaID=scan.nextInt();
while(chaID<1||chaID>3)
{
	System.out.println("Lütfen geçerli bir karakter seçiniz:");
	chaID=scan.nextInt();
}
return chaID;


}
public void initPlayer(String cName,int dmg,int health,int money)
{
	setcName(cName);
	setDamage(dmg);
	setHealth(health);
	setMoney(15);
	setrHealth(health);
}




public int getrHealth() {
	return rHealth;
}
public void setrHealth(int rHealth) {
	this.rHealth = rHealth;
}

public int getDamage() {
	return damage;
}
public void setDamage(int damage) {
	this.damage = damage;
}
public int getHealth() {
	return health;
}
public void setHealth(int health) {
	this.health = health;
}
public int getMoney() {
	return money;
}
public void setMoney(int money) {
	this.money = money;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getcName() {
	return cName;
}
public void setcName(String cName) {
	this.cName = cName;
}
public Inventory getInv() {
	return inv;
}
public void setInv(Inventory inv) {
	this.inv = inv;
}
	
	
	
}
