package clinic.core.patients;

public interface Flyable {
    void toFly();
    default double fly(){
        return 10;
    }
}
