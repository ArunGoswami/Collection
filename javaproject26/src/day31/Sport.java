package day31;

public class Sport {
private String name;
private String teamname;
public Sport(String name, String teamname) {
	super();
	this.name = name;
	this.teamname = teamname;
}
 
public String getName() {
	return "Sport";
}
 
public void setName(String name) {
	this.name = name;
}


public String getTeamname() {
	return "Each team has n players in Sports";
}


public void setTeamname(String teamname) {
	this.teamname = teamname;
}

}
