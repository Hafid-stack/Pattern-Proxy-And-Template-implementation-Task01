package enset.ma.proxypackage;

import enset.ma.proxypackage.controller.ClientOne;
import enset.ma.proxypackage.implementations.ServiceImpl;
import enset.ma.proxypackage.proxy.ProxyCache;
import enset.ma.proxypackage.security.SecuredProxy;
import enset.ma.proxypackage.service.IService;

public class Part3 {
    public static void main(String[] args) {
        IService service= new ServiceImpl();
        var SecuredProxy=new SecuredProxy();
        SecuredProxy.setServiceImpl(service);
        SecuredProxy.setPassword("1234");
        System.out.println(SecuredProxy.compute(12));
        System.out.println(SecuredProxy.compute(12));
        System.out.println(SecuredProxy.compute(12));

    }
}
