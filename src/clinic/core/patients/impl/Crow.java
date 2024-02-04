package clinic.core.patients.impl;

import clinic.core.Illness.Illness;
import clinic.core.clients.Owner;
import clinic.core.patients.Animal;

import java.time.LocalDate;

public class Crow extends Animal {
    public Crow(String nickName, Owner owner, LocalDate birthDate, Illness illness) {
        super(nickName, owner, birthDate, illness);
    }

    public Crow() {
    }

    @Override
    public void toFly() {
        System.out.println("Ворона летает");
    }

    @Override
    public double fly() {
        return 14;
    }

    @Override
    public void toGo() {
        System.out.println("Ворона не бегает");
    }

    @Override
    public double run() {
        return 0;
    }

    @Override
    public void toSwim() {
        System.out.println("Ворона не плавает");
    }

    @Override
    public double swim() {
        return 0;
    }
}
