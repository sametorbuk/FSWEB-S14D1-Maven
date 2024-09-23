package com.workintech.developers;

public class HRManager extends Employee{
    private String[] juniors;
    private String[] mids;
    private String[] seniors;


    public HRManager(int id, String name, double salary) {
        super(id, name, salary);
    }


    public void work(){
        System.out.println("HRManager starts to working");
    }


    public void addEmployee(String employeeNameAndTitle){
        String[] parts = employeeNameAndTitle.split(" ");

        if(parts[0].equals("Junior")){

        }
    }




}
