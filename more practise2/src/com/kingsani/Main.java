package com.kingsani;

public class PatientDemo {

    public static void main(String[] args) {

        Patient john = new Patient();
        john.name = "john";
        john.age = 30;
        john.height = 180;
        System.out.println(john.name + "" + john.age + "" + john.height);

        Patient alice = new Patient();
        alice.name = "Alice";
        alice.age = 25;
        alice.height = 165;
        System.out.println(alice.name + "" + alice.age + "" + alice.height);
    }
}
class Patient{
    String name;
    int age;
    float height;
}