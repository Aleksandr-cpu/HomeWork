package clinic.core.patients;

public interface Swimable {
    void toSwim();
    default double swim(){
        return 10;
    }
}
