package clinic.core.personal.impl;

import clinic.core.patients.Animal;
import clinic.core.personal.Personal;

import java.time.LocalDate;
import java.util.Map;

public class Doctor extends Personal {
    private final Map<Integer, String> diagnoses = Map.of(0, "лишай", 1, "чума", 2, "бешенство");
    private final Map<Integer, String> ilness = Map.of(0, "гипс", 1, "ампутацию");
    private Nurse nurse;
    public Doctor(String name, LocalDate bd) {
        super(name, bd);
    }

    public Doctor() {
    }

    public String doDiagnose(Animal patient){
        int key = (int) ( Math.random() * 3);
        return patient.getType() + " подхватил болезнь " + diagnoses.get(key);
    }
    public Doctor(Nurse nurse){
        this.nurse = nurse;
    }

    public void fireNurse(){
        this.nurse = null;
    }

    public void setNurse(Nurse nurse) {
        this.nurse = nurse;
    }

    public String substitution(Animal patient){
        int key = (int) ( Math.random() * 2);
        return " Доктор сделал " + ilness.get(key) + " " + patient.getType();
    }
}
