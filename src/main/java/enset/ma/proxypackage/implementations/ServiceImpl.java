package enset.ma.proxypackage.implementations;

import enset.ma.proxypackage.service.IService;

public class ServiceImpl implements IService {
    @Override
    public double compute(int a) {
        System.out.println("compute start");

        return Math.sqrt(a)*Math.cos(a);
    }
}
