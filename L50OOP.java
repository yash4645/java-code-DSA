public class L50OOP {
    // for user define data type,where we can define a datatype and we can store multiple premitive value in one datatype

    // class creation-> our new datatype of student
    // class is a blue print,its imaginary
   public static class Student{
        String name;
       private int rno;
        double percent;

        public Student(String name,double per){
           this.name=name;
            percent=per;
        }



// getter to get the value of private
        public int getrno(){
            return rno;
        }
        // setter to set the value of private
        public void setrno(int roll){
            rno=roll;
        }
    }
    public static void main(String[] args) {
        // Scanner is also a class by using we create a object to take input ,in which like nextInt is a method
        // class has pass by refrence,it will change another


        // creating an object of the class,its an instance of the class,its real
        Student a = new Student("radhe",76.2);
        // a.name="yash";
        // a.rno=62;
        // a.percent=84;
        System.out.println(a.name);
        // System.out.println(a.rno);

        // access modifier ...1.public-> all packages ...2.private->same class....3.default->same package
        
        // getters and setters are functions of class that is used to accsee or change in private 
        a.setrno(72);
        System.out.println(a.getrno());

        // this keyword -> to locate the data in class

        // constructer is a method in class has same name as the class,we can pass the argument in it

        System.out.println(a.name+" "+a.percent);

        // final keyword -> used to make no change

        // static keyword -> use when we want to access the mrthod without creating an object of the class



        
    }
}
