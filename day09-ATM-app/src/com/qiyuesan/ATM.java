package com.qiyuesan;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ATM {
    private ArrayList<Account> accounts = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    private Account logAcc;

    public void start(){
        while (true) {
            System.out.println("=====欢迎进入氧化锂银行=====");
            System.out.println("1.用户登录");
            System.out.println("2.用户开户");
            System.out.println("请选择您要操作的命令：");
            String command = sc.next();
            switch (command){
                case "1":
                    login();
                    break;
                case "2":
                    creatAccount();
                    break;
                default:
                    System.out.println("输入错误，请重试~~");
            }
        }
    }

    public void creatAccount(){
        System.out.println("=====系统开户操作=====");
        Account ac = new Account();

        System.out.println("请输入您的账户用户名：");
        ac.setName(sc.next());

        while (true) {
            System.out.println("请输入您的性别：");
            char sex = sc.next().charAt(0);
            if(sex == '男' || sex == '女'){
                ac.setSex(sex);
                break;
            }else {
                System.out.println("只支持生物染色体性别，请重试~~，");
            }
        }

        while (true) {
            System.out.println("请输入您账户的密码：");
            String password = sc.next();
            System.out.println("请确认您的密码：");
            String okPassword = sc.next();
            if(password.equals(okPassword)){
                ac.setPassword(password);
                System.out.println("设置成功~~");
                break;
            }else {
                System.out.println("密码不一致，请重试~~");
            }
        }

        System.out.println("请输入您的限额：");
        double limit = sc.nextDouble();
        ac.setLimit(limit);

        String id = creatCardId();
        ac.setCardId(id);
        accounts.add(ac);
        System.out.println("恭喜您，"+ac.getName()+"先生开户成功。您的卡号为："+id);

    }

    private String creatCardId(){
        while (true) {
            String id = "";
            Random r = new Random();
            for (int i = 0; i < 9; i++) {
                int sc = r.nextInt(10);
                id += sc;
            }
            Account ac = getCardId(id);
            if(ac == null){
                return id;
            }
        }
    }

    private Account getCardId(String id){
        //判断ID是否重复
        for (int i = 0; i < accounts.size(); i++) {
            Account ac = accounts.get(i);
            if(ac.getCardId().equals(id)){
                return ac;
            }
        }
        return null;
    }

    private void login(){
        //登录
        System.out.println("=====登录界面=====");
        if(accounts.size() == 0){
            System.out.println("库中不存在账户，请先开户~~");
            return;
        }
        while (true) {
            System.out.println("请输入您的ID:");
            String id = sc.next();
            Account ac = getCardId(id);
            if (ac == null) {
                System.out.println("ID输入错误，请重试~~");
            } else {
                while (true) {
                    System.out.println("请输入您的密码：");
                    String password = sc.next();
                    if (password.equals(ac.getPassword())) {
                        logAcc = ac;
                        System.out.println("恭喜"+ac.getName()+"先生，登录成功！");
                        Operate();
                        return;
                    }else {
                        System.out.println("密码错误~请重试~~~");
                    }
                }
            }
        }
    }

    private void Operate(){
        while (true) {
            System.out.println("=================================");
            System.out.println(logAcc.getName()+",您可办理以下业务：");
            System.out.println("1.查询账户");
            System.out.println("2.存款");
            System.out.println("3.取款");
            System.out.println("4.转账");
            System.out.println("5.修改密码");
            System.out.println("6.退出");
            System.out.println("7.注销账号");
            System.out.println("=================================");
            String command = sc.next();
            switch (command){
                case "1":
                    check();
                    break;
                case "2":
                    putMoney();
                    break;
                case "3":
                    getMoney();
                    break;
                case "4":
                    removeMoney();
                    break;
                case "5":
                    changePassword();
                    return;
                case "6":
                    System.out.println(logAcc.getName()+"先生已退出~~");
                    return;
                case "7":
                    if(deleteAccount()){
                        return;
                    }
                    break;
                default:
                    System.out.println("没有当前选择，请重试~~");
            }
        }

    }

    private void changePassword(){
        while (true) {
            System.out.println("请输入您的密码：");
            String password = sc.next();
            if(password.equals(logAcc.getPassword())){
                while (true) {
                    System.out.println("请输入您修改的密码：");
                    String newPassword = sc.next();
                    System.out.println("请确认您的新密码：");
                    String newOkPassword = sc.next();
                    if(newPassword.equals(newOkPassword)){
                    logAcc.setPassword(newPassword);
                    System.out.println("密码已修改完成~~");
                    return;
                    }else {
                        System.out.println("确认错误，请重试~~");
                    }
                }
            }else {
                System.out.println("密码错误，请重试·~~");
            }
        }
    }

    private void check(){
        System.out.println("=====您当前账户信息如下：=====");
        System.out.println("卡号："+logAcc.getCardId());
        System.out.println("户主："+logAcc.getName());
        System.out.println("性别："+logAcc.getSex());
        System.out.println("余额："+logAcc.getMoney());
        System.out.println("限额："+logAcc.getLimit());
        System.out.println("==========================");

    }

    private void putMoney(){
        System.out.println("=====存钱界面=====");
        System.out.println("请输入存入的金额：");
        double money = sc.nextDouble();
        logAcc.setMoney(logAcc.getMoney() + money);
        System.out.println("存入"+money+"元成功，现在账户余额为"+logAcc.getMoney());

    }

    private void getMoney(){
        System.out.println("=====取钱界面=====");
        while (true) {
            System.out.println("请输入取出的金额：");
            double money = sc.nextDouble();
            if (money <= logAcc.getMoney()) {
                if(money > logAcc.getLimit()){
                    System.out.println("金额超过限额，您的限额为："+logAcc.getLimit()+"，请重试~~");
                }else {
                    logAcc.setMoney(logAcc.getMoney() - money);
                    System.out.println("取出"+money+"元成功，现在账户余额为"+logAcc.getMoney());
                    break;
                }
            } else {
                System.out.println("账户余额不足,现在账户余额为"+logAcc.getMoney());
            }
        }
    }

    private void removeMoney(){
        System.out.println("=====转账界面=====");
        if(accounts.size() < 2){
            System.out.println("当前系统中，账户数量不足~~");
            return;
        }else {
            if (logAcc.getMoney() == 0 ){
                System.out.println("您的账户余额不足~~");
                return;
            }
            while (true) {
                System.out.println("请输入对方的ID");
                String ID = sc.next();
                Account ac = getCardId(ID);
                if (ac == null){
                    System.out.println("输入的账户不存在，请重试~~");
                }else {
                    String name ="*"  + ac.getName().substring(1);
                    while (true) {
                        System.out.println("请您输入转账人"+name+"的姓氏：");
                        String first = sc.next();
                        if(ac.getName().startsWith(first)){
                            System.out.println("请输入您转账的金额：");
                            double money = sc.nextDouble();
                            if(money > logAcc.getMoney()){
                                System.out.println("余额不足，现在账户余额为："+logAcc.getMoney());
                                return;
                            }else {
                             logAcc.setMoney(logAcc.getMoney() - money);
                             ac.setMoney(ac.getMoney() + money);
                                System.out.println("转账成功，您当前账户余额为：" + logAcc.getMoney());
                             return;
                            }
                        }else {
                            System.out.println("输入错误，请重试~~");
                        }
                    }

                }
            }
        }
    }

    private boolean deleteAccount(){
        System.out.println("=====销户界面=====");
        System.out.println("请确认您是否要注销当前账户：");
        String command = sc.next();
        switch (command){
            case "是":
                if(logAcc.getMoney() == 0){
                    accounts.remove(logAcc);
                    System.out.println("已为您注销当前账户~~");
                    return true;
                }else {
                    System.out.println("您的账户中还存有钱，请转移后重试。");
                    return false;
                }
            default:
                System.out.println("好的，为您保留当前账户。");
                return false;
        }
    }
}




























