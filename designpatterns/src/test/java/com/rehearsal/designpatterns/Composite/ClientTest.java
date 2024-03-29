package com.rehearsal.designpatterns.Composite;

import com.rehearsal.designpatterns.Composite.Component.Employer;
import com.rehearsal.designpatterns.Composite.Composite.ProjectManager;
import com.rehearsal.designpatterns.Composite.Leaf.Programmer;
import com.rehearsal.designpatterns.Composite.Leaf.ProjectAssistant;

import java.util.List;

/**
 * @author LiShuLin
 * @version v1.0
 * @program rehearsal
 * @description ClientTest
 * @date 2019-08-20 18:01
 */
public class ClientTest {

    public static void main(String[] args) {
        Employer pm = new ProjectManager("项目经理");
        Employer pa = new ProjectAssistant("项目助理");
        Employer programmer1 = new Programmer("程序员一");
        Employer programmer2 = new Programmer("程序员二");

        pm.add(pa);//为项目经理添加项目助理
        pm.add(programmer2);//为项目经理添加程序员
        pa.add(programmer1);

        List<Employer> ems = pm.getEmployers();
        for (Employer em : ems) {
            System.out.println(em.getName());
        }
    }
}
