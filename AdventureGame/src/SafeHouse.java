
public class SafeHouse extends NormalLoc {
SafeHouse(Player player)
{
	super(player,"Güvenli Ev");
	
}
	public boolean getLocation()
	{
		player.setHealth(player.getrHealth());
		System.out.println("İyileştiniz,yaralarınızı sardınız...");
		System.out.println("Şuan Güvenli evdesiniz.");
		return true;
	}

}
