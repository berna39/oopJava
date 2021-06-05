package Inheritance;

public class Main1 {
	public static void main(String[] args) {
		Player player = new Player("Ajax");
		player.setFirstname("toby");
		player.setLastname("Aldewereild");
		
		System.out.println("Player name:"+player.getFirstname()+" player lastname :"+player.getLastname()+" player team :"+player.getTeam());
	}
}
