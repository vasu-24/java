// class object method


class mystring{

    public int vasu(int n1,int n2){

        return n1+n2;
    }
}


public class day4 {

    public static void main(String[] args) {
        
    mystring str =new mystring();

    int result=str.vasu(10,200);

    System.out.println("sum : " +result);
    }
}



// example 2  method overloading 

class overlod{

    public int add(int n1,int n2){
       
        return n1+n2;}

        public int add(int n1,int n2,int n3){
       
            return n1+n2+n3;
    }
public int add (int n1,int n2,int n3,int n4){

    return n1+n2+n3+n4;

}
}


public class day4 {

    public static void main(String[] args) {
        
    overlod over =new overlod();

    int result = over.add(10,100,500,50);

    int result1= over.add(10,100);

    int result2= over.add(100,200,300);

    System.out.println("sum  :"+result);
    System.out.println("sum  :"+result1);
    System.out.println("sum  :"+result2);
    }
}



public class day4 {

    public static void main(String[] args) {

        pen pe =new pen();

        String result= pe.getpen(8);

        System.out.println(result);
        

    }
}

class pen{
    public String getpen(int cost){

       if(cost<9){
      return     " pen is 10 rupess";
       }
       else{

       return "you can get ";
       }
    }
}