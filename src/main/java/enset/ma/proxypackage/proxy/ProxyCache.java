package enset.ma.proxypackage.proxy;

import enset.ma.proxypackage.implementations.ServiceImpl;
import enset.ma.proxypackage.service.IService;

import java.util.HashMap;
import java.util.Map;

public class ProxyCache implements IService {

    private ServiceImpl serviceImpl= new ServiceImpl();
    public Map<Integer,Double> cache = new HashMap<>();


    @Override
    public double compute(int a) {
        if (!cache.containsKey(a))
        {
            double result = serviceImpl.compute(a);
            cache.put(a,result);
            return result;
        }else
        {
            return cache.get(a);
        }
    }

    public void setServiceImpl(ServiceImpl serviceImpl) {
        this.serviceImpl = serviceImpl;
    }
}
