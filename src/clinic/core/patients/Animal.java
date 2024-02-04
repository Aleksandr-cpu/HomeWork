package clinic.core.patients;

import clinic.core.Illness.Illness;
import clinic.core.clients.Owner;

import java.time.LocalDate;

public abstract class Animal implements Goable, Flyable, Swimable{
    protected String nickName;
    protected Owner owner;
    protected LocalDate birthDate;
    protected Illness illness;

    public Animal(String nickName, Owner owner, LocalDate birthDate,
                  Illness illness) {
        this.nickName = nickName;
        this.owner = owner;
        this.birthDate = birthDate;
        this.illness = illness;
    }
    public Animal() {
        this("Кличка", new Owner("Хозяин"),
                LocalDate.now(), new Illness("Болезнь"));
    }

    public String getType(){
        return getClass().getSimpleName();
    }
    @Override
    public String toString() {
        return String.format("nickName = %s, bd = %s, owner = %s, illness = %s", nickName, birthDate, owner, illness);
    }


}
