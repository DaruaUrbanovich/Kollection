package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        allElimentFromList();
        notMultiples();
        queueOfIntegers();
        notDuplicates();
        word();
        collectionSet("hello java, hello word");

    }


    public static void allElimentFromList() {
//        1.Написать программу, которая выведет все элементы листа
        List<Integer> num = new ArrayList<>();
        num.add(1);
        num.add(5);
        num.add(9);
        num.add(3);
        for (Integer number : num) {
            System.out.println("allElimentFromList " + number);
        }
    }

    public static void notMultiples() {
//        Даны числа от 1 до 100 (цикл).Необходимо создать список и добавить в него все числа, которые не кратны 3 и 5
        List<Integer> num = new ArrayList<>();
        for (int i = 1; i < 101; i++) {
            if (i % 3 != 0 && i % 5 != 0) {
                num.add(i);
            }

        }
        System.out.println("notMultiples"+num);
    }

    public static void queueOfIntegers() {
        //Элементы целочисленного массива записать в очередь.
//        Написать функцию извлечения элементов из очереди до тех пор, пока первый элемент очереди не станет четным.
        int[] arr = new int[20];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(30);
        }
        Queue<Integer> num = new LinkedList<>();
        for (int j : arr) {
            num.add(j);
        }
        for (int number : num) {
            if (number % 2 != 0) {
                num.poll();
            } else {
                break;
            }
        }
        System.out.println("queueOfIntegers"+num);
    }

    public static void notDuplicates() {
//Дан List, который содержит дубликаты, необходимо избавиться от них.
        List<Integer> number = new LinkedList<>();
        number.add(2);
        number.add(2);
        number.add(3);
        number.add(5);
        HashSet<Integer> newNumber = new HashSet<>(number);
        for (int o : newNumber) {
            System.out.println("notDuplicates "+o);
        }
    }

    public static void word() {
//    Дан Set слов, необходимо вывести все слова, содержащие 5 букв.
        HashSet<String> myHashSet = new HashSet<>();
        myHashSet.add("This");
        myHashSet.add("is");
        myHashSet.add("words");
        myHashSet.add("string");
        for (String wordFive : myHashSet) {
            if (wordFive.length() == 5) {
                System.out.println("word consisting of 5 letters "+wordFive);
            }

        }
    }

    //    Написать метод, который принимает строку и возвращает коллекцию, содержащую уникальные буквы в слове
    public static Collection collectionSet(String abc) {

        String []words=abc.split("");
        Set<String>uniqueWord=new LinkedHashSet<>();
        for (String i: words){
            uniqueWord.add(i);
        }
        System.out.println( uniqueWord);
        return uniqueWord;

    }
}
