package clinic.core;

import clinic.core.patients.Animal;
import clinic.core.patients.Flyable;
import clinic.core.patients.Goable;
import clinic.core.patients.Swimable;
import clinic.core.personal.Personal;

import java.util.ArrayList;
import java.util.List;

public class VeterinaryClinic {
    private List<Personal> personal;
    private List<Animal> patients;

    public VeterinaryClinic() {
        this.personal = new ArrayList<>();
        this.patients = new ArrayList<>();
    }

    public List<Animal> getPatients() {
        return patients;
    }

    public List<Personal> getPersonal() {
        return personal;
    }

    public void addEmplayee(Personal emplayee) {
        personal.add(emplayee);
    }

    public void addPatient(Animal patient) {
        patients.add(patient);
    }

    public List<Animal> getGoables() {
        List<Animal> result = new ArrayList<>();
        for (Animal a : patients) {
            if (a instanceof Goable) {
                Goable goable = (Goable) a;
                if (goable.run() > 0) {
                    result.add(a);
                }
            }
        }
        return result;
    }

    public List<Animal> getFlyables() {
        List<Animal> result = new ArrayList<>();
        for (Animal a : patients) {
            if (a instanceof Flyable) {
                Flyable flyable = (Flyable) a;
                if (flyable.fly() > 0) {
                    result.add(a);
                }
            }
        }
        return result;
    }

    public List<Animal> getSwimable() {
        List<Animal> result = new ArrayList<>();
        for (Animal a : patients) {
            if (a instanceof Swimable) {
                Swimable swimable = (Swimable) a;
                if (swimable.swim() > 0) {
                    result.add(a);
                }
            }
        }
        return result;
    }
}
