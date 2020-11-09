package Proxy;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class AthleteProxy{
    private ArrayList<AnimalAthlete> animalAthletes;
    public AthleteProxy(ArrayList<AnimalAthlete> animalAthletes) {
        this.animalAthletes = animalAthletes;
    }

    private void prepareSpace(String interviewee) throws InterruptedException {
        System.out.println("Preparing answering space for " + interviewee + " ...");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("Finished.");
    }

    private void prepareEquipment(String interviewer) throws InterruptedException {
        System.out.println("Preparing recording equipments for " + interviewer + " ...");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("Finished.");
    }

    private void publishRecord(String interviewee) throws InterruptedException {
        System.out.println("Publishing the answers of " + interviewee + " ...");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("Finished.");
    }

    public boolean interview(String interviewer, String interviewee, String[] questions) throws InterruptedException {
        AnimalAthlete animalAthlete = null;
        for (AnimalAthlete athlete : animalAthletes
        ) {
            if (athlete.getName() == interviewee) {
                animalAthlete = athlete;
                break;
            }
        }
        if (animalAthlete == null) {
            System.out.println("Ooops, you've got a wrong name: "+ interviewee);
            return false;
        }
        this.prepareSpace(interviewee);
        this.prepareEquipment(interviewer);
        animalAthlete.interview(questions);
        this.publishRecord(interviewee);
        return true;
    }
}

