package clinic.core.patients.impl;

import clinic.core.Illness.Illness;
import clinic.core.clients.Owner;
import clinic.core.patients.Animal;

import java.time.LocalDate;

public class Shark extends Animal {

    public Shark(String nickName, Owner owner, LocalDate birthDate, Illness illness) {
        super(nickName, owner, birthDate, illness);
    }

    public Shark() {
    }

    @Override
    public void toFly() {
        System.out.println("Акула не летает");
    }
    @Override
    public double fly() {
        return 0;
    }

    @Override
    public void toGo() {
        System.out.println("Акула не бегает");
    }
    @Override
    public double run() {
        return 0;
    }
    @Override
    public void toSwim() {
        System.out.println("Акула плавает");
    }

    @Override
    public double swim() {
        return 30;
    }
}
