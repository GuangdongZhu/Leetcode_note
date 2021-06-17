package leetcode_test;

class Emp{
    private long empNo;
    private String empName;
    private String state;
    private double salary;
    private double comm;
    private Dept dept;
    private Emp Man;

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    public Dept getDept() {
        return dept;
    }

    public void setMan(Emp man) {
        this.Man = man;
    }

    public Emp getMan() {
        return Man;
    }

    public Emp(long empNo, String empName, String state, double salary, double comm)
    {
        this.empNo = empNo;
        this.empName =empName;
        this.state = state;
        this.salary = salary;
        this.comm = comm;
    }

    public String getInfo(){
        return "员工编号："+empNo+"、员工姓名："+empName+"、员工位置："+state+"、基本工资："+ salary +"、绩效："+comm;
    }

    public void setComm(double comm) {
        this.comm = comm;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public void setEmpNo(long empNo) {
        this.empNo = empNo;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getEmpName() {
        return empName;
    }

    public double getComm() {
        return comm;
    }

    public double getSalary() {
        return salary;
    }

    public long getEmpNo() {
        return empNo;
    }

    public String getState() {
        return state;
    }

}
class Dept{
    private long deptNo;
    private String deptName;
    private String deptAddress;
    private Emp[] emps;
    private Emp Man;

    public Emp getMan() {
        return Man;
    }

    public Emp[] getEmps() {
        return emps;
    }

    public void setMan(Emp man) {
        Man = man;
    }

    public void setEmps(Emp[] emps) {
        this.emps = emps;
    }

    public Dept(){

    }
    public Dept(long deptNo, String deptName, String deptAddress)
    {
        this.deptNo = deptNo;
        this.deptName = deptName;
        this.deptAddress = deptAddress;
    }

    public void setDeptAddress(String deptAddress) {
        this.deptAddress = deptAddress;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public void setDeptNo(long deptNo) {
        this.deptNo = deptNo;
    }

    public long getDeptNo() {
        return deptNo;
    }

    public String getDeptAddress() {
        return deptAddress;
    }

    public String getDeptName() {
        return deptName;
    }

    public String getInfo()
    {
        return "部门编号："+deptNo+"、部门名称："+deptName+"、部门地址："+deptAddress;
    }

}

public class java_learn {
    public static void main(String[] args) {
        Emp emp1 = new Emp(73011L,"jack", "cleck",800.00,0.00);
        Emp emp2 = new Emp(73121L,"tom", "manner",2800.00,800.00);
        Emp emp3 = new Emp(73512L,"rose", "president",8000.00,8000.00);

        Dept dept = new Dept(0001L,"财务部","上海");

        emp1.setDept(dept);
        emp1.setMan(emp2);
        emp2.setMan(emp3);

        dept.setEmps(new Emp[]{emp1,emp2,emp3});

        for(int i = 0;i<dept.getEmps().length;i++) {
            System.out.println(dept.getEmps()[i].getInfo());
            if (dept.getEmps()[i].getMan() != null)
                System.out.println("\t\t"+dept.getEmps()[i].getMan().getInfo());
        }

    }
}
