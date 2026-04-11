package enset.ma.proxypackage.controller;

import enset.ma.proxypackage.service.IService;

public class ClientOne {

    private IService service;
    public double compute(int a){

        return service.compute(a);
    }

    public void setService(IService service) {
        this.service = service;
    }
}
