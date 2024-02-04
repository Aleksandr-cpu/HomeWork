package clinic.core.patients.impl;

import clinic.core.Illness.Illness;
import clinic.core.clients.Owner;
import clinic.core.patients.Animal;

import java.time.LocalDate;

public class Flamingo extends Animal {

    public Flamingo(String nickName, Owner owner, LocalDate birthDate, Illness illness) {
        super(nickName, owner, birthDate, illness);
    }

    public Flamingo() {
    }


    @Override
    public void toFly() {
        System.out.println("Фламинго бегает");
    }

    @Override
    public double fly() {
        return 22;
    }

    @Override
    public void toGo() {
        System.out.println("Фламинго бегает");
    }

    @Override
    public double run() {
        return 0;
    }

    @Override
    public void toSwim() {
        System.out.println("Фламинго не плавает");
    }

    @Override
    public double swim() {
        return 0;
    }
}
