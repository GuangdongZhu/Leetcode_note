package leetcode_test;

import org.junit.internal.InexactComparisonCriteria;

public class help_class {
}
class Person{
    private String name;
    private String addr;
    private char sex;
    private int age;
    public Person(){}
    public Person(String name, String addr)
    {
        this(name, addr,'男',0);
    }

    public Person(String name, String addr, char sex, int age)
    {
        this.name = name;
        this.addr = addr;
        this.sex = sex;
        this.age = age;
    }

    public String getInfo()
    {
        return "姓名："+ this.name + "、地址："+ this.addr + "、性别："+ this.sex + "、年龄："+ this.age ;
    }

}
class Student extends Person{
    private double Math;
    private double English;

    public Student(){}

    public Student(String name, String addr){
        super(name, addr);
    }

    public Student(String name, String addr, char sex, int age, double Math, double English)
    {
        super(name,addr,sex,age);
        this.Math = Math;
        this.English = English;
    }

    public String getInfo()
    {
        return super.getInfo()+ "、数学成绩："+ this.Math+ "、英语成绩："+ this.English ;
    }

}
class Employee{
    private String name;
    private int age;
    private char sex;
    public Employee(){}
    public Employee(String name, int age, char sex){
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public String getInfo(){
        return "姓名："+ this.name + "、性别："+ this.sex + "、年龄："+ this.age ;
    }
}
class Clark extends Employee{
    private String dept;
    private double money;
    public Clark(){}
    public Clark(String name, int age, char sex)
    {
        super(name,age,sex);
    }
    public Clark(String name, int age, char sex, String dept, double money)
    {
        super(name,age,sex);
        this.dept = dept;
        this.money = money;
    }
    public String getInfo(){
        return super.getInfo()+ "、部门："+ this.dept + "、月薪："+ this.money ;
    }
}
class ListNode{
    int val;
    ListNode next;
    ListNode(){};
    ListNode(int x)
    {
        this.val = x;
    }
    ListNode(int x, ListNode t)
    {
        this.val = x;
        this.next = t;
    }
}
class Trie {
    // 左子树指向表示 0 的子节点
    Trie left = null;
    // 右子树指向表示 1 的子节点
    Trie right = null;
}
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
class serverState{
    int idx;
    int weight;
    int ending;
    public serverState(int idx, int weight, int ending)
    {
        this.idx = idx;
        this.weight = weight;
        this.ending = ending;
    }
}
