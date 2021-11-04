package com.company.laboratorka;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        String[] categories = {"car", "bike", "telephone", "ship", "helicopter"};

        Product[] arr = new Product[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Product(categories[(int)(Math.random()*4)], (int)(Math.random()*100), (int)(Math.random()*10));
        }

        Arrays.sort(arr, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                int equalsNames = o1.getName().compareTo(o2.getName());
                int equalPrices = o1.getPrice() - o2.getPrice();
                int equalPieces = o1.getPieces() - o2.getPieces();

                if(equalsNames != 0){
                    return equalsNames;
                }else{
                    if(equalPrices != 0){
                        return equalPrices;
                    }else{
                        return equalPieces;
                    }
                }

            }
        });

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].toString());
        }

        System.out.println("........................................");
        List<Product> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(new Product(categories[(int)(Math.random()*4)],(int)(Math.random()*100), (int)(Math.random()*10)));
        }

        Collections.sort(list, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                int equalsNames = o1.getName().compareTo(o2.getName());
                int equalPrices = o1.getPrice() - o2.getPrice();
                int equalPieces = o1.getPieces() - o2.getPieces();

                if(equalsNames != 0){
                    return equalsNames;
                }else{
                    if(equalPrices != 0){
                        return equalPrices;
                    }else{
                        return equalPieces;
                    }
                }
            }
        });

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).toString());
        }

    }
}
