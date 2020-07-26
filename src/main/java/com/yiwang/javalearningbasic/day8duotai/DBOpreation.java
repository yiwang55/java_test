package com.yiwang.javalearningbasic.day8duotai;//package com.java.day8duotai;
//
///*
//* 1.连接数据库   JDBC  Hibernate
//* 2.操作数据库  CRUD
//* 3.关闭数据库连接
//* */
//
//interface UserInfoDao{
//    void add(User user);
//    void delete(User user);
//}
//
//public class DBOpreation {
//    public static void main(String[] args){
//            UserInfoDao ui = new UserInfoByJDBC();
//        UserInfoDao ui = new UserInfoByHibernate();
////        UserInfoByJDBC ui = new UserInfoByJDBC();
////        ui.add(user);
////        ui.delete(user);
////        ui.select(user);
////        ui.update(user);
//    }
//
//    class UserInfoByJDBC implements UserInfoDao{
//        public void add(User user){
////        1.连接数据库
////        2.使用sql语句添加数据
////        3.关闭连接
//        }
//
//        public void delete(User user){
////        1.JDBC连接数据库
////        2.使用sql语句删除数据
////        3.关闭连接
//        }
//
//        public void update(User user){
////        1.连接数据库
////        2.使用sql语句更新数据
////        3.关闭连接
//        }
//
//        public void select(User user){
////        1.连接数据库
////        2.使用sql语句查询数据
////        3.关闭连接
//        }
//    }
//
//    class UserInfoByHibernate implements UserInfoDao{
//        public void add(User user){
////        1.Hibernate连接数据库
////        2.使用sql语句添加数据
////        3.关闭连接
//        }
//
//        public void delete(User user){
////        1.Hibernate连接数据库
////        2.使用sql语句删除数据
////        3.关闭连接
//        }
//
//        public void update(User user){
////        1.连接数据库
////        2.使用sql语句更新数据
////        3.关闭连接
//        }
//
//        public void select(User user){
////        1.连接数据库
////        2.使用sql语句查询数据
////        3.关闭连接
//        }
//    }
//
//
//}