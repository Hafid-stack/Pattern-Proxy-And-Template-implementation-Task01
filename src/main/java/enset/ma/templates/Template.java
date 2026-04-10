package enset.ma.templates;

public abstract class Template {


    public double performe(int a, int b) {

        int n=helperMethode();
        double result=0;
        for (int i=0;i<=n;i++) {
           double step1=helperMethode2(a,b);
            result =result+step1;
        }
            return result;
    }

    protected abstract int helperMethode2(int a,int b);

    protected abstract int helperMethode();
}
