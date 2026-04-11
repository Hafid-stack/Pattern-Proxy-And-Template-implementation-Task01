package enset.ma.proxypackage;

import enset.ma.proxypackage.controller.ClientOne;
import enset.ma.proxypackage.implementations.ServiceImpl;
import enset.ma.proxypackage.service.IService;

public class Main {
    public static void main(String[] args) {
        IService service=new ServiceImpl();
        ClientOne clientOne = new ClientOne();
        clientOne.setService(service);
        System.out.println(clientOne.compute(14));
    }
}
