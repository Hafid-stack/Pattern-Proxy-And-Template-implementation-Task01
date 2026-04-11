package enset.ma.templatepackage;

import enset.ma.templatepackage.templates.MoroccoScore;
import enset.ma.templatepackage.templates.Template;
import enset.ma.templatepackage.templates.UnitedStateScore;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Template template=new MoroccoScore();
        Template template2=new UnitedStateScore();

        System.out.println(template2.performe(222,66));
        System.out.println(template.performe(66,2));




    }
}