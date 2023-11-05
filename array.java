public class array{
    public static void main(String[] args){
        // there are 3 main ways to create an array in java
        //1.Declaration and memory allocation
        // int [] marks = new int [5];

        //2.Declaration and then memory allocation
        // int [] marks;
        // marks = new int[5];
        // marks[0]= 100;
        // marks[1]= 60;
        // marks[2]= 70;
        // marks[3]= 90;
        // marks[4]= 86;


        // 3.Declaration,memory allocation and intialization together
//        int [] marks={98,45,79,99,89};
        float [] marks ={98,45,79,99,89};
        System.out.println("printing using for loop");
        for(int i=0;i<marks.length;i++){
        System.out.println(marks[i]);}
        //Displaying the array in reverse order (for loop)
        System.out.println("printing using for loop in reverse order");
        for(int i=marks.length-1;i>=0;i--){
            System.out.println(marks[i]);
        }
//        System.out.println(marks[2]);
//        String [] student = {"ankit"};
//        System.out.println(student.length);
//        System.out.println(student[0]);
    }
}

