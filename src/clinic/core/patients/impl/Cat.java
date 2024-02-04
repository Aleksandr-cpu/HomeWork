package clinic.core.patients.impl;

import clinic.core.Illness.Illness;
import clinic.core.clients.Owner;
import clinic.core.patients.Animal;
import clinic.core.patients.Flyable;
import clinic.core.patients.Goable;
import clinic.core.patients.Swimable;

import java.time.LocalDate;

public class Cat extends Animal  {


    public Cat(String nickName, Owner owner, LocalDate birthDate, Illness illness) {
        super(nickName, owner, birthDate, illness);
    }

    public Cat() {

    }

    @Override
    public void toFly() {
        System.out.println("Кот не летает");
    }

    @Override
    public double fly() {
        return 0;
    }

    @Override
    public void toGo() {
        System.out.println("Кот бегает");
    }

    @Override
    public double run() {
        return 20;
    }

    @Override
    public void toSwim() {
        System.out.println("Кот плавает");
    }

    @Override
    public double swim() {
        return 0;
    }
}
