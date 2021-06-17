import java.util.*;
public class java_learn_test {
    public static void main(String[] args) {
//        revSort at = new revSort(5);
//        at.insertLength(3);
//        System.out.println(at.add(1));
//        System.out.println(at.add(3));
//        System.out.println(at.add(8));
//        System.out.println(at.add(4));
//        System.out.println(at.add(8));
//        System.out.println(at.add(4));
//        System.out.println(at.add(6));
//        System.out.println(at.add(2));
//
//        int sortA[] =at.getSort();
//
//        for (int i : sortA)
//            System.out.print(i+"、");
//        int rev[] = at.getRev();
//        for (int i : rev)
//            System.out.print(i+"、");


//        Message m = new DataBaseMessage();
//        m.print();
//        System.out.println("---一般情况---");
//        Person p = new Superman();
//        p.daily();
//        System.out.println("---遇到危机---");
//        Superman s = (Superman) p;
//        s.fly();
//        s.fire();
        Person p = new Person();
        System.out.println(p instanceof Person);
        System.out.println(p instanceof Superman);

        Person per = new Superman();
        System.out.println(per instanceof Person);
        System.out.println(per instanceof Superman);

    }
}
class Person{
    public void daily(){
        System.out.println("吃饭，睡觉");
    }
}
class Superman extends Person{
    public void fly() {
        System.out.println("fly");
    }
    public void fire(){
        System.out.println("fire");
    }
}

class Message{
    public void print(){
        System.out.println("Message");
    }
}
class DataBaseMessage extends Message{
    public void print(){
        System.out.println("DatabaseMessage");
    }
}
class WebMessage extends Message{
    public void print(){
        System.out.println("WebMessage");
    }
}

class revSort extends sortArray{
    public revSort(int len) {
        super(len);
    }
    public int[] getRev(){
        int length = super.getSort().length / 2;
        int head = 0;
        int tail = super.getSort().length-1;
        for(int i=0;i<length;i++)
        {
            int temp = super.getData()[head];
            super.getData()[head]=super.getData()[tail];
            super.getData()[tail]=temp;
            head++;
            tail--;
        }
        return super.getData();
    }
}

class sortArray extends Array_test{

    public sortArray(int len){
        super(len);
    }

    public int[] getSort()
    {
        int res[] = super.getData();
        Arrays.sort(res);
        return res;
    }

}

class Array_test{
    private int[] data;
    private int foot;
    private int len;

    public Array_test(int len) {
        this.len = len;
        if(len > 0)
            this.data = new int[len];
        else
            this.data = new int[1];
    }
    public boolean add(int num)
    {
        if(foot<this.data.length)
        {
            this.data[foot++]=num;
            return true;
        }
        else
            return false;
    }
    public void insertLength(int n)
    {
        int newArrat[] = new int[this.data.length+n];
        System.arraycopy(this.data,0,newArrat,0,this.data.length);
        this.data = newArrat;
    }

    public int[] getData(){
        return this.data;
    }
}