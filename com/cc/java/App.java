package com.cc.java;

public class App {
    
    public static void main(String[] args) {
     
        HoneyBee queen = new Queen();
        HoneyBee worker = new Worker();
        HoneyBee drone = new Drone();

        // output(queen.doYourJob());
        // output(queen.fly());
        // output("------------------------"); // alles ersetzt mit pollObj(queen);
        // pollObj(queen);
        // output(worker.doYourJob());
        // output(worker.fly());
        // output("------------------------");
        // output(drone.doYourJob());
        // output(drone.fly());
        // output("------------------------");

        pollObj(queen);
        pollObj(worker);
        pollObj(drone);
        
    }

    // private static void pollObj(Queen obj){
    //     output(obj.doYourJob());
    //     output(obj.fly());
    //     output("------------------------");
    // }

    // 4. Iteration Polymorphie
    private static void pollObj(HoneyBee obj){
        output(obj.doYourJob());
        output(obj.fly());
        output("------------------------");
    }
   
    private static void output(String outputStr) {
        System.out.println(outputStr);
    }



}

