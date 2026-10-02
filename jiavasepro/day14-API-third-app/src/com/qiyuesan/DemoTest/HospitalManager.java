package com.qiyuesan.DemoTest;

import com.qiyuesan.Demo.Appointment;
import com.qiyuesan.Demo.Department;
import com.qiyuesan.Demo.Doctor;
import com.qiyuesan.Demo.Schedule;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.UUID;

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
                    changeDepartment();
                    break;
                case "4":
                    addDoctor();
                    break;
                case "5":
                    setDoctorJob();
                    break;
                case "6":
                    showAllDoctorJob();
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
    public void showAllDoctorJob(){
        System.out.println("=====展示坐诊详情=====");
        System.out.println("各科室各医生坐诊情况如下：");
        for (int i = 0; i < allDepartments.size(); i++) {
            Department department = allDepartments.get(i);
            System.out.println((i+1)+","+department.getName());
            for (int i1 = 0; i1 < department.getDoctors().size(); i1++) {
                Doctor doctor = department.getDoctors().get(i1);
                System.out.println(doctor.getName()+"坐诊情况如下：");
                ArrayList<Schedule> schedules = doctor.getSchedules();
                updateSchedule(schedules);
                for (int i2 = 0; i2 < schedules.size(); i2++) {
                    Schedule schedule = schedules.get(i2);
                    System.out.println(schedule.getToday());
                    if(!schedule.isUpdate()){
                        System.out.println("未排班");
                        continue;
                    }
                    if (schedule.isMorning()){
                        System.out.println("上午："+schedule.getMstart()+"-"+schedule.getMend()+
                                " "+"预约人数"+schedule.getaTotalNumber());
                    }else {
                        System.out.println("上午休息");
                    }
                    if (schedule.isAfternoon()){
                        System.out.println("下午："+schedule.getAstart()+"-"+schedule.getAend()+
                                " "+"预约人数"+schedule.getaTotalNumber());
                    }else {
                        System.out.println("下午休息");
                    }
                }
            }
        }
    }

    public void setDoctorJob(){
        System.out.println("=====设置坐诊时间=====");
        Department department = seletDepartment();
        ArrayList<Doctor> doctors = department.getDoctors();
        if (doctors.size() == 0){
            System.out.println("当前科室下无医生~~");
            return;
        }
        while (true){
            System.out.println("当前科室下医生如下：");
            for (int i = 0; i < doctors.size(); i++) {
                System.out.println((i+1)+","+doctors.get(i).getName());
            }
            System.out.println("请输入：");
            int commend = sc.nextInt();
            if (commend < 1 || commend > doctors.size()){
                System.out.println("输入错误");
                continue;
            }
            Doctor doctor = doctors.get(commend - 1);
            ArrayList<Schedule> schedules = doctor.getSchedules();
            updateSchedule(schedules);
            for (int i = 0; i < schedules.size(); i++) {
                Schedule schedule = schedules.get(i);
                updateDoctorSchedule(schedule);
            }
            break;
        }
    }
    public void updateDoctorSchedule(Schedule schedule) {
        LocalDate today = schedule.getToday();
        System.out.println(today+"安排如下：");
        if (!schedule.isUpdate()) {
            System.out.println("未排班");
        } else {
            System.out.println("==上午==");
            if (schedule.isMorning()) {
                System.out.println("坐诊时间为" + schedule.getMstart() + "-"
                        + schedule.getMend() + "总人数：" + schedule.getaTotalNumber());
            } else {
                System.out.println("休息");
            }
            System.out.println();
            System.out.println("==下午==");
            if (schedule.isMorning()) {
                System.out.println("坐诊时间为" + schedule.getAstart() + "-"
                        + schedule.getAend() + "总人数：" + schedule.getaTotalNumber());
            } else {
                System.out.println("休息");
            }
        }
        System.out.println("是否修改？ y/n");
        String commend = sc.next();
        if ("y".equals(commend)) {
            schedule.setUpdate(true);
            System.out.println("上午要工作吗？y/n");
            String commend1 = sc.next();
            if ("y".equals(commend1)) {
                schedule.setMorning(true);
                System.out.println("上班的开始时间和结束时间是：");
                String start = sc.next();
                String end = sc.next();
                System.out.println("可预约人数为：");
                int number = sc.nextInt();
                schedule.setMstart(LocalTime.parse(start));
                schedule.setMend(LocalTime.parse(end));
                schedule.setaTotalNumber(number);
            } else {
                schedule.setMorning(false);
            }

            System.out.println("下午要工作吗？y/n");
            String commend2 = sc.next();
            if ("y".equals(commend2)) {
                schedule.setAfternoon(true);
                System.out.println("上班的开始时间和结束时间是：");
                String start = sc.next();
                String end = sc.next();
                System.out.println("可预约人数为：");
                int number = sc.nextInt();
                schedule.setAstart(LocalTime.parse(start));
                schedule.setAend(LocalTime.parse(end));
                schedule.setaTotalNumber(number);
            } else {
                schedule.setAfternoon(false);
            }
        }
    }
    public void updateSchedule(ArrayList<Schedule> schedules){
        //无重复
        if (schedules.size() == 0){
            for (int i = 0; i <= 6; i++) {
                Schedule schedule = new Schedule();
                LocalDate now = LocalDate.now();
                schedule.setToday(now.plusDays(i));
                schedules.add(schedule);
            }
            return;
        }
        //有重复
        for (int i = 0; i < schedules.size(); i++) {
            Schedule schedule = schedules.get(i);
            LocalDate now = LocalDate.now();
            LocalDate current = schedule.getToday();
            if(now.equals(current)){
                break;
            }
            if(current.isBefore(now)){
                schedules.remove(schedule);
                i--;
            }
        }
        LocalDate last = schedules.get(schedules.size() - 1).getToday();
        int size = 7 - schedules.size();
        for (int i = 0; i < size; i++) {
         Schedule schedule = new Schedule();
         schedule.setToday(last.plusDays(i + 1));
         schedules.add(schedule);
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
        System.out.println("======删除科室=====");
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
    public void changeDepartment(){
        System.out.println("=====修改科室=====");
        while (true) {
            System.out.println("请输入修改的科室的名称：");
            String name = sc.next();
            for (int i = 0; i < allDepartments.size(); i++) {
                Department department = allDepartments.get(i);
                if (department.getName().equals(name)) {
                    System.out.println("请输入需要的名称：");
                    String name1 = sc.next();
                    department.setName(name1);
                    System.out.println("修改成功!");
                    return;
                } else {
                    System.out.println("没有这个科室，请重试~~");
                }
            }
        }
    }
    public void addDoctor(){
        System.out.println("=====添加医生=====");
        while (true) {
            Department department = seletDepartment();
            if (department == null){
                System.out.println("无科室！");
                return;
            }
            Doctor doctor = new Doctor();
            doctor.setDepartmentName(department.getName());

            doctor.setDoctorID(UUID.randomUUID().toString());

            System.out.println("请输入姓名：");
            String name = sc.next();
            doctor.setName(name);

            System.out.println("请输入性别：");
            String gender = sc.next();
            doctor.setGender(gender);

            System.out.println("请输入年龄：");
            int age = sc.nextInt();
            doctor.setAge(age);

            System.out.println("特长：");
            String specialty = sc.next();
            doctor.setSpecialty(specialty);

            System.out.println("入职时间(格式：yyyy-MM-dd)：");
            String joinDateString = sc.next();
            LocalDate joinDate = LocalDate.parse(joinDateString);

            department.getDoctors().add(doctor);
            System.out.println("录入成功！！");
            break;

        }
    }
    public Department seletDepartment() {
        if (allDepartments.size() == 0) {
            System.out.println("错误");
            return null;
        }
        while (true) {
            System.out.println("请选择科室：");
            for (int i = 0; i < allDepartments.size(); i++) {
                Department department = allDepartments.get(i);
                System.out.println((i + 1) + "." + department.getName());
            }
            System.out.println("请输入：");
            int command = sc.nextInt();
            if (command < 1 || command > allDepartments.size()) {
                System.out.println("错误！请重试~~");
                continue;
            }
            Department department = allDepartments.get(command - 1);
            return department;
        }
    }

}



