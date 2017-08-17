package com.example.helloworld;

import designpatterns.factory.pizza.method.PizzaApp;
import designpatterns.factory.pizza.abstr.PizzaAppAF;
import designpatterns.observer.custom.WeatherApp;
import designpatterns.observer.builtin.WeatherApp1;
import designpatterns.strategy.ducks.DuckSimulator;
import designpatterns.decorator.sturbuzz.StarBuzzApp;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        DuckSimulator.strategy();
        System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||");
        WeatherApp.observer();
        WeatherApp1.observer();
        System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||");
        StarBuzzApp.decorator();
        System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||");
        System.out.println("Factory Method Pizza");
        PizzaApp.orderPizza();
        System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||");
        System.out.println("Abstract Factory Pizza");
        PizzaAppAF.orderPizza();
    }
}
