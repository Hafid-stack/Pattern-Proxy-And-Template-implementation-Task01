package enset.ma.proxypackage.security;

import enset.ma.proxypackage.implementations.ServiceImpl;
import enset.ma.proxypackage.service.IService;

public class SecuredProxy implements IService {

    private IService serviceImpl=new ServiceImpl();
    private String password;
    @Override
    public double compute(int a) {
        if (password=="1234") {
            return serviceImpl.compute(a);
        }else  {
            throw  new RuntimeException("Not Authorized");
        }
    }

    public void setServiceImpl(IService serviceImpl) {
        this.serviceImpl = serviceImpl;
    }
    public void setPassword(String password) {
        this.password = password;
    }
}
