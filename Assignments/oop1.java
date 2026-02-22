import java.util.*;
class complex{
    int real;
    int img;
    public complex(int real , int img){ //datatype creation
        this.real = real;
        this.img = img;
    }
    public static complex add(complex a, complex b){
        return new complex(a.real+b.real , a.img+b.img);
    }
    public static complex sub(complex a , complex b){
        return new complex(a.real-b.real , a.img-b.img);
    }
    public  void printcomplex(){ //as static method cant directly access non static variables , hence it is kept non-static
        System.out.println(real+"+"+img+"i");
    }

}


class oop1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int r1 = sc.nextInt();
        int i1 = sc.nextInt();
        int r2 = sc.nextInt();
        int i2 = sc.nextInt();

        
        complex c = new complex(r1,i1);
        complex d = new complex(r2,i2);

        complex e =  complex.add(c,d); //storing the summed up complex number 
        e.printcomplex();

        complex f = complex.sub(c,d);
        f.printcomplex();
    }
}