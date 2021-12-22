package structural_patterns.proxy;

public class ServiceProxy implements ServiceInterface {

    private Service service;
    private String accessLvl;

    public ServiceProxy(Service high, String low) {
        service = high;
        accessLvl = low;
    }

    @Override
    public void someOperation() {
        if(checkAccess()){
            service.someOperation();
        } else {
            System.out.println("Low access level");
        }
    }

    private boolean checkAccess(){
        if(service.getAccessLvl().equals(accessLvl)){
            return true;
        }
        return false;
    }
}