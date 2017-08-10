package com.example.helloworld;

import designpatterns.observer.custom.WeatherApp;
import designpatterns.observer.builtin.WeatherApp1;
import designpatterns.strategy.ducks.DuckSimulator;
import designpatterns.decorator.sturbuzz.StarBuzzApp;
import designpatterns.factory.pizza.first.PizzaStore;

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
        PizzaStore.orderPizza();
    }
}
