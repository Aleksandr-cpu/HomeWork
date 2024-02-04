package clinic.core.patients.impl;

import clinic.core.patients.Animal;

public class Crow extends Animal {
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
