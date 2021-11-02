package com.company.laboratorka2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserList {
    private List<User> list;

    UserList(){
        list = new ArrayList<>();
    }

    //////////////////для хардкода///////////////////////
    public void addUser(String login, String password){
        list.add(new User(login,password));
    }

    public void removeUser(String login){
        int index;
        boolean hasUser = false;
        for (User temp:list) {
            if(temp.getLogin().equals(login)){
                index = list.indexOf(temp.getLogin());
                list.remove(index);
                hasUser = true;
                System.out.println("Пользователь с таким логином удален");
            }
        }
        if(!hasUser) System.out.println("Пользователя с таким логином нету");
    }

    public void containsUser(String login){
        boolean hasUser = false;
        for (User temp :list) {
            if(login.equals(temp.getLogin())){
                System.out.println("есть пользователь с таким именем");
                hasUser = true;
            }
        }
        if (!hasUser) System.out.println("нет такого пользователя");
    }

    public void reWriteLogin(String login, String newLogin){
        boolean hasUser = false;
        int index;
        User user = new User();
        for (int i = 0; i < list.size(); i++) {
            if(login.equals(list.get(i).getLogin())){
                index = i;
                user.setPassword(list.get(i).getPassword());
                user.setLogin(newLogin);
                list.set(index, user);
            }else{
                System.out.println("пользователя с таким логином нету");
            }
        }
    }

    public void reWritePass(String login, String newPassword){
        boolean hasUser = false;
        int index;
        User user = new User();
        for (int i = 0; i < list.size(); i++) {
            if(login.equals(list.get(i).getLogin())){
                index = i;
                user.setLogin(list.get(i).getLogin());
                user.setPassword(newPassword);
                list.set(index, user);
            }else{
                System.out.println("пользователя с таким логином нету");
            }
        }
    }

    @Override
    public String toString() {
        String line ="";
        for (int i = 0; i < list.size(); i++) {
            line += "индекс: "+ i +" логин: " + list.get(i).getLogin() + " пароль :" + list.get(i).getPassword()+"\n";
        }
        return line;
    }

    //////////////////для консольного ввода//////////////////////////
    public void consoleAddUser(){
        Scanner s = new Scanner(System.in);
        User user = new User();
        System.out.println("впишите логин пользователя");
        user.setLogin(s.next());
        System.out.println("впишите пароль пользователя");
        user.setPassword(s.next());
        list.add(user);
    }

    public void consoleRemoveUser(){
        Scanner s = new Scanner(System.in);
        removeUser(s.next());
    }

    public void consoleContainsUser(){
        Scanner s = new Scanner(System.in);
        containsUser(s.next());
    }

    public void consoleRewriteLogin(){
        Scanner s = new Scanner(System.in);
        System.out.println("впишите старый логин");
       String old = s.next();
        System.out.println("впишите новый логин");
        String newLogin = s.next();
        reWriteLogin(old, newLogin);
    }

    public void consoleRewritePass(){
        Scanner s = new Scanner(System.in);
        System.out.println("впишите логин пользователя");
        String login = s.next();
        System.out.println("впишите новый пароль пользователя");
        String newPassword = s.next();
        reWritePass(login, newPassword);
    }
}
