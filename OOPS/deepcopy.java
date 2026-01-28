class deepcopy{
    
    
    static class Student{
        int roll;
        String name;
        int marks[] = new int[3];

        Student(){

        }
        Student(Student s1){
            this.name = s1.name; //shallow copy
            this.marks = new int[3];
            
            for(int i=0 ; i<3 ; i++){
                this.marks[i] = s1.marks[i];//deep copy
            }
        }
    }
    
    
    public static void main(String args[]){ .
        Student s1 = new Student();
        s1.name = "Rajbir";
        s1.roll = 30;
        s1.marks[0]=100;
        s1.marks[1]=52;
        s1.marks[2]=34;


        Student s2 = new Student(s1);

        System.out.println(s2.name);//shalow copy output

        System.out.println(s2.marks[0]);//deep copy output

        s1.marks[0] = 34;

        System.out.println(s2.marks[0]);//value reamins unchnaged(deep copy- copy of values not reference)

    }
}