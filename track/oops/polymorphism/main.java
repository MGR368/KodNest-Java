package track.oops.polymorphism;

class Developer {
    void work() {
        System.out.println("Developer is working");
    }

    void project() {
        System.out.println("Develooper doing project");
    }
}

class javaDeveloper extends Developer {
    @Override
    void work() {
        System.out.println("javaDeveloper is working");
    }

    @Override
    void project() {
        System.out.println("javaDeveloper doing project");
    }
}

class pythonDeveloper extends Developer {
    @Override
    void work() {
        System.out.println("pythonDeveloper is working");
    }

    @Override
    void project() {
        System.out.println("pythonDeveloper doing project");
    }
}

public class main {

    public static void Main(String[] args) {

        javaDeveloper jd = new javaDeveloper();
        accessMethod(jd);

        pythonDeveloper pd = new pythonDeveloper();
        accessMethod(pd);
    }

    static void accessMethod(Developer dev) {
        dev.work();
        dev.project();
    }
}
