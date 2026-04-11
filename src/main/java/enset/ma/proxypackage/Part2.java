package enset.ma.proxypackage;

import enset.ma.proxypackage.controller.ClientOne;
import enset.ma.proxypackage.proxy.ProxyCache;
import enset.ma.proxypackage.service.IService;

public class Part2 {
    public static void main(String[] args) {
        IService service=new ProxyCache();
        ClientOne clientOne=new ClientOne();
        clientOne.setService(service);
        System.out.println(clientOne.compute(12));
        System.out.println(clientOne.compute(12));
        System.out.println(clientOne.compute(12));

    }
}
