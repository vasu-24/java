// array
// when we need to store the large number or multiple numbers in the one veiable we use array 

// *to define arrray er use int *num[] ={};*

// to create an array with ficed size *int num []=new int[5];*

// exxample 1

// public class day5 {

//     public static void main(String[] args) {
//         int array[]={1,50,60,5,};

//         System.out.println(array[1]);
//     }
// }

// example 2

// public class day5 {

//     public static void main(String[] args) {
//          int array[] = new int[5];

//          array[1]=10;
//          array[4]=10;
//          array[3]=100;

//          System.out.println(array[0]);

//     }
// }


// example 3

public class day5 {

    public static void main(String[] args) {
        
        int array[]= {1,2,3,4,4,5,6,7,8,9,};

        for (int i=0;i<10;i++){
            System.out.println(array[i]);
        }
    }
}



// multi dimensional array

// public class day5 {

    
// public static void main(String[] args) {
//     int a[][]= new int [3][5];

//   for (int i =0;i<3;i++){
//     for(int j=0;j<5;j++){
//         System.out.print(a[i][j]+"  ");
//       }
//       System.out.println();

//   }
 
// }
// }


// example 3 2d array

// public class day5 {

//     public static void main(String[] args) {
//         int a[][]=new int[4][5];

//         for(int i=0;i<4;i++){

//             for(int j=0;j<5;j++){
//                 System.out.print(a[i][j]+" ");

//             }
// System.out.println();
//         }
//     }
// }


// three dimensional array

public class day5 {

    public static void main(String[] args) {
        int a[][][] = new int[3][4][5];

        for (int i = 0; i < 3; i++) {  
            System.out.println("Layer " + (i + 1) + ":");  
            
            for (int j = 0; j < 4; j++) {  
                for (int k = 0; k < 5; k++) {  
                    System.out.print(a[i][j][k] + " ");  
                }
                System.out.println();  
            }
            
            System.out.println("Layer " + (i + 1) + " Completed\n");  
        }
    }
}


//  when we dont about the n length of array just use varaible .length 



// working with obje array and foe each loopp is pending 


