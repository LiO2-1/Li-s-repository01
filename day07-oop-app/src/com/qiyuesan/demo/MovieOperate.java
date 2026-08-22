package com.qiyuesan.demo;

public class MovieOperate {
    private Movie[] movies;
    public MovieOperate(Movie[] movies){
        this.movies = movies;
    }

    public void showAllMovies(){
        System.out.println("--------系统全部电影如下----------");
        for (int i = 0; i < movies.length; i++) {
            Movie m = movies[i];
            System.out.println("编号：" + m.getId());
            System.out.println("片名：" + m.getName());
            System.out.println("价格：" + m.getPrice());
            System.out.println("-------------------------------");
        }
    }

    public void showMovie(int id){
        for (int i = 0; i < movies.length; i++) {
            Movie m = movies[i];
            if(id == m.getId()){
                System.out.println("----------该电影详细信息如下----------");
                System.out.println("编号:"+ m.getId());
                System.out.println("片名:"+ m.getName());
                System.out.println("价格:"+ m.getPrice());
                System.out.println("评分:"+ m.getScore());
                System.out.println("导演:"+ m.getDirector());
                System.out.println("主演:"+ m.getActor());
                System.out.println("其他信息:"+ m.getInFor());
                System.out.println("----------------------------------");
                return;
            }
        }
        System.out.println("您的数据有误~~");
    }
}
