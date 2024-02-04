package clinic.core.patients;

public interface Goable {
    void toGo();
    default double run(){
        return 10;
    }
}
