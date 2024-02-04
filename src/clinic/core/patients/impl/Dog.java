package clinic.core.patients.impl;

import clinic.core.Illness.Illness;
import clinic.core.clients.Owner;
import clinic.core.patients.Animal;
import clinic.core.patients.Flyable;
import clinic.core.patients.Goable;
import clinic.core.patients.Swimable;

import java.time.LocalDate;

public class Dog extends Animal {


    public Dog(String nickName, Owner owner, LocalDate birthDate, Illness illness) {
        super(nickName, owner, birthDate, illness);
    }

    public Dog() {
        super();
    }




    @Override
    public void toFly() {
        System.out.println("Собака не летает");
    }

    @Override
    public double fly() {
        return 0;
    }

    @Override
    public void toGo() {
        System.out.println("Собака бегает");
    }

    @Override
    public double run() {
        return 35;
    }
    @Override
    public void toSwim() {
        System.out.println("Собака плавает");
    }

    @Override
    public double swim() {
        return 0;
    }
}
