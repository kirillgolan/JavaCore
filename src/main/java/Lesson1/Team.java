package Lesson1;

public class Team {

    private String teamName;
    private Participant[] participants;

    public Team(String teamName, Participant... participants) {
        this.teamName = teamName;
        this.participants = participants;
    }

    public Participant[] getParticipants() {
        return participants;
    }

    public void showResults() {
        System.out.printf("- %s  finish line:\n", teamName);
        for (Participant participant : participants) {
            participant.result();
        }
    }

}