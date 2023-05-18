
public class ToolStore extends NormalLoc {

	ToolStore(Player player)
	{
		super(player,"Mağaza");
	}
	public boolean getLocation()
	{
		System.out.println("Para:"+player.getMoney());
	System.out.println("1.Silahlar");	
	System.out.println("2.Zırhlar");
	System.out.println("3.Çıkışlar");
	System.out.println("Seçiminiz:");
	int selTool=scan.nextInt();
	int selItemID;
	switch(selTool)
	{
	case 1:
		selItemID=weaponMenu();
		buyWeapon(selItemID);
		break;
	case 2:
		selItemID=armorMenu();
		buyArmor(selItemID);
		break;
	}
	
   return true;	
	}
	public int weaponMenu()
	{
		System.out.println("1.Tabanca Para:25 Hasar:2");
		System.out.println("2.Kılıç  Para:35,Hasar:3");
		System.out.println("3.Tüfek  Para:45, Hasar:7");
		System.out.println("4.Çıkış");
		System.out.println("Silah seçiniz:");
		int selWeaponID=scan.nextInt();
		return selWeaponID;
	}
	public void buyWeapon(int itemID)
	{
		int damage=0;
		String wName=null;
		int price=0;
		if(itemID>0||itemID<4)
		{
			switch(itemID)
			{
			case 1:
				price=25;
				damage=2;
				wName="Silah";
				break;
			case 2:
				price=35;
				damage=3;
				wName="Kılıç";
				break;
			case 3:
				price=45;
				damage=7;
				wName="Tüfek";
				break;
			case 4:
				System.out.println("Çıkış!");
				default:
					System.out.println("Geçersiz işlem!");
					break;
			}
			if(price>0){
				
			
			if(player.getMoney()>=price)
			{
			player.getInv().setDamage(damage);
			player.getInv().setwName(wName);
			player.setMoney(player.getMoney()-price);
			System.out.println(wName+" satın aldınız,Önceki hasar:"+player.getDamage()+" Şimdiki hasarınız:"+player.getTotalDamage());
			System.out.println("Kalan para:"+player.getMoney());
			}
			else
			{
				System.out.println("Para yetersiz!!");
			}
			}
		}
		
	}
	
	public int armorMenu()
	{
		System.out.println("1.Hafif Para:15 Hasar Koruması:1");
		System.out.println("2.Orta  Para:25,Hasar Koruması:3");
		System.out.println("3.Ağır  Para:40, Hasar Koruması:5");
		System.out.println("4.Çıkış");
		System.out.println("Silah seçiniz:");
		int selArmorID=scan.nextInt();
		return selArmorID;	
	}
	public void buyArmor(int itemID)
	{
		int avoid=0;
		String aName=null;
		int price=0;
		if(itemID>0||itemID<4)
		{
			switch(itemID)
			{
			case 1:
				price=15;
				avoid=1;
				aName="Hafif zırh";
				break;
			case 2:
				price=25;
				avoid=3;
				aName="Orta zırh";
				break;
			case 3:
				price=40;
				avoid=5;
				aName="Büyük zırh";
				break;
			case 4:
				System.out.println("Çıkış!");
				break;
				default:
					System.out.println("Geçersiz işlem!");
					break;
			}
			if(price>0){
				
			
			if(player.getMoney()>=price)
			{
			player.getInv().setArmor(avoid);
			player.getInv().setaName(aName);
			player.setMoney(player.getMoney()-price);
			System.out.println(aName+" satın aldınız,engellenen hasar:"+player.getInv().getArmor());
			System.out.println("Kalan para:"+player.getMoney());
			}
			else
			{
				System.out.println("Para yetersiz!!");
			}
			}
		}
	}
	
}
