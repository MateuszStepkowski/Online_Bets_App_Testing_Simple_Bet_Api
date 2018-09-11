package pl.coderslab.model;

import java.util.Objects;

public class Game {

    private String sport;

    private String firstTeam;

    private String secondTeam;

    private int firstTeamPoints;

    private int secondTeamPoints;

    public Game() {
    }

    public Game(String sport, String firstTeam, String secondTeam, int firstTeamPoints, int secondTeamPoints) {
        this.sport = sport;
        this.firstTeam = firstTeam;
        this.secondTeam = secondTeam;
        this.firstTeamPoints = firstTeamPoints;
        this.secondTeamPoints = secondTeamPoints;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Game game = (Game) o;
        return firstTeamPoints == game.firstTeamPoints &&
                secondTeamPoints == game.secondTeamPoints &&
                Objects.equals(sport, game.sport) &&
                Objects.equals(firstTeam, game.firstTeam) &&
                Objects.equals(secondTeam, game.secondTeam);
    }

    @Override
    public int hashCode() {

        return Objects.hash(sport, firstTeam, secondTeam, firstTeamPoints, secondTeamPoints);
    }

    @Override
    public String toString() {
        return "Game{" +
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
