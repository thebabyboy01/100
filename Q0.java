import java.util.*;

class Student {
   int rollNumber;
   Student(int roll_number) {
      rollNumber=roll_number;
   }   
}

class Test extends Student {
   float test1, test2;
   int rollNumber;
   Test(float test1, float test2, int roll_number) {
      super(roll_number);
      this.test1=test1;
      this.test2=test2;
   }
}

interface Sport {
   float sportWt=6.0F;
   // void putWt();
}

class Result extends Test implements Sport {

   float totalMarks;
   float average;
   Scanner sc=new Scanner(System.in);
   Result(float test1, float test2, int roll_number) {
      super(test1, test2, roll_number);
      totalMarks=super.test1+super.test2;
   }

   void displayMarks() {
      System.out.println("Do you have Sports Marks Credebility ?? (1 - Yes, 2 - No)\nEnter Choice: ");
      int sports=sc.nextInt();
      if (sports==1) {
         totalMarks=totalMarks + sportWt;
      }
      average=(totalMarks/2);
      System.out.println("Student Roll No.: "+super.rollNumber+"\nAverage Score (Marks): "+average+".");
   }
}

class Q0 {
   public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);   
      System.out.println("Enter Roll Number: ");
      int rn=sc.nextInt();
      System.out.print("Enter Test 1 Marks: ");
      float test1=sc.nextFloat();
      System.out.print("Enter Test 2 Marks: ");
      float test2=sc.nextFloat();

      Result r = new Result(test1, test2, rn);
      r.displayMarks();
   }
}
