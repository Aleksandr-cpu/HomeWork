package clinic;

import clinic.core.VeterinaryClinic;
import clinic.core.patients.Animal;
import clinic.core.patients.impl.*;
import clinic.core.personal.Personal;
import clinic.core.personal.impl.Doctor;
import clinic.core.personal.impl.Nurse;

public class Main {
    public static void main(String[] args) {
        VeterinaryClinic veterinaryClinic = new VeterinaryClinic();


        Animal flint = new Shark();
        veterinaryClinic.addPatient(flint);
        Animal switty = new Flamingo();
        veterinaryClinic.addPatient(switty);
        Animal dobbi = new Penguin();
        veterinaryClinic.addPatient(dobbi);
        Animal bob = new Dog();
        veterinaryClinic.addPatient(bob);
        Animal jack = new Cat();
        veterinaryClinic.addPatient(jack);
        Animal luck = new Crow();
        veterinaryClinic.addPatient(luck);
        System.out.println(veterinaryClinic.getPatients());


        System.out.println(veterinaryClinic.getGoables());
        System.out.println(veterinaryClinic.getFlyables());
        System.out.println(veterinaryClinic.getSwimable());

        Doctor doctor = new Doctor();
        veterinaryClinic.addEmplayee(doctor);
        Nurse nurse = new Nurse();
        veterinaryClinic.addEmplayee(nurse);
        System.out.println(veterinaryClinic.getPersonal());

        System.out.println(nurse.doInjection(dobbi));
        System.out.println(doctor.substitution(flint));
        System.out.println(doctor.doDiagnose(flint));
    }
}
