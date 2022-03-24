/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EmpApp.pojo;

/**
 *
 * @author User
 */
public class Emp {

    public Emp() {
    }

    public Emp(int empId, String name, double sal) {
        this.empId = empId;
        this.name = name;
        this.sal = sal;
    }
    

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }
    private int empId;
    private String name;
    private double sal;
}
