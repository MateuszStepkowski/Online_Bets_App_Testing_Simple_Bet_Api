package pl.coderslab.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GameDTO {

    @JsonProperty("sport")
    private String sport;

    @JsonProperty("firstTeam")
    private String firstTeam;

    @JsonProperty("secondTeam")
    private String secondTeam;

    @JsonProperty("firstTeamPoints")
    private int firstTeamPoints;

    @JsonProperty("secondTeamPoints")
    private int secondTeamPoints;


    public GameDTO() {
    }

    public GameDTO(String sport, String firstTeam, String secondTeam, int firstTeamPoints, int secondTeamPoints) {
        this.sport = sport;
        this.firstTeam = firstTeam;
        this.secondTeam = secondTeam;
        this.firstTeamPoints = firstTeamPoints;
        this.secondTeamPoints = secondTeamPoints;
    }



    @Override
    public String toString() {
        return "GameDTO{" +
                "sport='" + sport + '\'' +
                ", firstTeam='" + firstTeam + '\'' +
                ", secondTeam='" + secondTeam + '\'' +
                ", firstTeamPoints=" + firstTeamPoints +
                ", secondTeamPoints=" + secondTeamPoints +
                '}';
    }

    public String getSport() {
        return sport;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }

    public String getFirstTeam() {
        return firstTeam;
    }

    public void setFirstTeam(String firstTeam) {
        this.firstTeam = firstTeam;
    }

    public String getSecondTeam() {
        return secondTeam;
    }

    public void setSecondTeam(String secondTeam) {
        this.secondTeam = secondTeam;
    }

    public int getFirstTeamPoints() {
        return firstTeamPoints;
    }

    public void setFirstTeamPoints(int firstTeamPoints) {
        this.firstTeamPoints = firstTeamPoints;
    }

    public int getSecondTeamPoints() {
        return secondTeamPoints;
    }

    public void setSecondTeamPoints(int secondTeamPoints) {
        this.secondTeamPoints = secondTeamPoints;
    }


}
