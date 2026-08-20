package com.qiyuesan.demo;
/*
  展示系统中的全部电影(每部电影展示: 名称、价格)。
  允许用户根据电影编号(id) 查询出某个电影的详细信息。
  目标: 完成电影信息展示功能; 根据电影id查询该电影详情。

  电影数据:
  1,"水门桥", 38.9, 9.8, "徐克", "吴京","12万人想看"
  2, "出拳吧", 39, 7.8, "唐晓白", "田雨","3.5万人想看"
  3,"月球陨落", 42, 7.9, "罗兰", "贝瑞","17.9万人想看"
  4,"一点就到家", 35, 8.7, "许宏宇", "刘昊然","10.8万人想看"
 */

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Movie[] movies = new Movie[4];
        movies[0] = new Movie(1,"水门桥", 38.9, 9.8, "徐克", "吴京","12万人想看");
        movies[1] = new Movie(2, "出拳吧", 39, 7.8, "唐晓白", "田雨","3.5万人想看");
        movies[2] = new Movie(3,"月球陨落", 42, 7.9, "罗兰", "贝瑞","17.9万人想看");
        movies[3] = new Movie(4,"一点就到家", 35, 8.7, "许宏宇", "刘昊然","10.8万人想看");

        MovieOperate movie = new MovieOperate(movies);
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("---------电影展示系统---------");
            System.out.println("1.查看全部电影。");
            System.out.println("2.输入id,查看详细信息。");
            int command = sc.nextInt();
            switch (command){
                case 1:
                    movie.showAllMovies();
                    break;
                case 2:
                    System.out.println("请输入要查询的电影的ID：");
                    int id = sc.nextInt();
                    movie.showMovie(id);
                    break;
                default:
                    System.out.println("输入有误，请重试~~");
            }
        }

    }
}
