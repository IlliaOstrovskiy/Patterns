package structural_patterns.proxy;

public class Service implements ServiceInterface{

    private String accessLvl;

    public Service(String high) {
        accessLvl =high;
    }

    @Override
    public void someOperation() {
        System.out.println("Some operation from service");
    }

    public Object getAccessLvl() {
        return accessLvl;
    }
}