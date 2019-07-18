package model;

public class Team {
    private String teamName;
    private String teamDescription;



    public String getTeamName() {
        return teamName;
    }

    public String getTeamDescription() {
        return teamDescription;
    }

    public Team withTeamName(String teamName) {
        this.teamName = teamName;
        return this;
    }

    public Team withTeamDescription(String teamDescription) {
        this.teamDescription = teamDescription;
        return this;
    }
}
