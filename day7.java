// encapsulation

// putting the data inside the method is called as an encapsulation



class vasu{
     private String Name = "vasu";
    private int age ;

    public String getname()
{
return Name ;
}

public int getage()
{
    return age;
}

public void setage(int x){

   age=x;
}
// public int getage()
// {
//  retrun age ;
// }
}

public class day7 {

    public static void main(String[] args) {
        vasu va=new vasu();

        String str= va.getname();
          va.setage(90);

          int i=va.getage();


        System.out.println(str+" : "+i);
    }
}
  

