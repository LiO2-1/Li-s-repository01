package com.qiyuesan.DemoTest;

import com.qiyuesan.Demo.Appointment;
import com.qiyuesan.Demo.Department;

import java.util.ArrayList;
import java.util.Scanner;

public class HospitalManager {
    private ArrayList<Department> allDepartments = new ArrayList<>();

    private ArrayList<Appointment> allAppointment = new ArrayList<>();

    private Scanner sc = new Scanner(System.in);

    public void Start() {
        while (true) {
            System.out.println("=====欢迎来到氧化锂医院信息管理系统=====");
            System.out.println("1.科室管理-添加科室");
            System.out.println("2.科室管理-删除科室");
            System.out.println("3.科室管理-修改科室");
            System.out.println("4.医生管理-录入医生");
            System.out.println("5.医生管理-坐诊设置");
            System.out.println("6.医生管理-坐诊详情");
            System.out.println("7.医生管理-挂号预约");
            System.out.println("8.搜索医生的病人信息");
            System.out.println("请输入操作命令：");
            switch (sc.next()) {
                case "1":
                    addDepartment();
                    break;
                case "2":
                    delectDepartment();
                    break;
                case "3":
                    break;
                case "4":
                    break;
                case "5":
                    break;
                case "6":
                    break;
                case "7":
                    break;
                case "8":
                    break;
                default:
                    System.out.println("输入错误，请重试~~");
            }
        }
    }

    public void addDepartment() {
        System.out.println("=====添加科室=====");
        OUT:
        while (true) {
            System.out.println("请输入科室名称：");
            String name = sc.next();
            for (int i = 0; i < allDepartments.size(); i++) {
                Department department = allDepartments.get(i);
                if (department.getName().equals(name)) continue OUT;
            }
            Department department = new Department();
            department.setName(name);
            allDepartments.add(department);
            System.out.println("添加成功！");
            break;
        }
    }
    public void delectDepartment(){
        while (true){
            System.out.println("请输入删除的科室的名称：");
            String name = sc.next();
            for (int i = 0; i < allDepartments.size(); i++) {
            Department department = allDepartments.get(i);
            if (department.getName().equals(name)) {
                allDepartments.remove(department);
                System.out.println("删除成功!");
                return;
            } else {
                System.out.println("没有这个科室，请重试~~");
            }
            }
        }
    }
}



