package clinic.core.personal.impl;

import clinic.core.patients.Animal;
import clinic.core.personal.Personal;

import java.time.LocalDate;
import java.util.Map;

public class Nurse extends Personal {
    private final Map<Integer, String> injection = Map.of(0, "укол", 1, "гипс", 2, "анестезию");

    public Nurse(String name, LocalDate bd) {
        super(name, bd);
    }
    public Nurse(){

    }


    public String doInjection(Animal patient){
        int key = (int) ( Math.random() * 4);
        return "Медсестра сделала" + " " + patient.getType() + " " + injection.get(key);

    }
}
