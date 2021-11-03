package com.company.laboratorka1;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<User> userList = new PriorityQueue<>(5, new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return o2.getPriority() - o1.getPriority();
            }
        });

        userList.add(new User(123, "user"));
        userList.add(new User(333, "admin"));
        userList.add(new User(99, "bob"));
        userList.add(new User(45, "tom"));
        userList.add(new User(135, "manager"));


        while (!userList.isEmpty()){
            System.out.println(userList.poll().getLogin());
        }
    }


}
