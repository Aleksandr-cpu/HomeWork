package clinic.core.personal;

import java.time.LocalDate;

public class Personal {
    protected String name;
    protected LocalDate bd;

    public Personal(String name,LocalDate bd){
        this.name = name;
        this.bd = bd;
    }

    public Personal() {

    }
}
