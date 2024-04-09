package day31;

public class Soccer extends Sport {
	public Soccer(String name, String teamname) {
		super(name, teamname);
		// TODO Auto-generated constructor stub
	}
	@Override
	public String getName() {
		return "Sport=Soccer";
	}
	@Override
	public String getTeamname() {
		return "Each team has 11 players in Sports";
	}

}
