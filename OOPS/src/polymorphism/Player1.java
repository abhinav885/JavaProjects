package polymorphism;
class Team{
	private String teamName;

	public Team(String teamName) {
		super();
		this.teamName = teamName;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
}

class Player{
	private String playerName;
	private Team team;//Aggregation team
	
	public Player(String playerName, Team team) {
		super();
		this.playerName = playerName;
		this.team = team;
	}
	
	public String getPlayerName() {
		return playerName;
	}

	public Team getTeam() {
		return team;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public void setTeam(Team team) {
		this.team = team;
	}

	void display() {
		System.out.println("TeamName: "+team.getTeamName());
		System.out.println("PlayerName: "+playerName);
		System.out.println();
	}
}
public class Player1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Team t = new Team("Mumbai Indians");
		t.setTeamName("Chennai");
		t.setTeamName("Royal Challengers Bangalore");
		Player p = new Player("Rohit Sharma",t);
		p.setPlayerName("Msdhoni");
		p.display();
		Player p1 = new Player("Virat Kohli",t);
		p1.display();

	}

}
