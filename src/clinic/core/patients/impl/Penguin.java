package clinic.core.patients.impl;

import clinic.core.Illness.Illness;
import clinic.core.clients.Owner;
import clinic.core.patients.Animal;

import java.time.LocalDate;

public class Penguin extends Animal {

    public Penguin(String nickName, Owner owner, LocalDate birthDate, Illness illness) {
        super(nickName, owner, birthDate, illness);
    }

    public Penguin() {
    }


    @Override
    public void toFly() {
        System.out.println("Пингвин не летает");
    }

    @Override
    public double fly() {
        return 0;
    }

    @Override
    public void toGo() {
        System.out.println("Пингвин бегает");
    }

    @Override
    public double run() {
        return 0;
    }

    @Override
    public void toSwim() {
        System.out.println("Пингвин плавает");
    }

    @Override
    public double swim() {
        return 23;
    }
}
