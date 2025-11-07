//Derin Soysal Period 4
//10/30/25
//This program will create different shapes with input, typically determining the number of rows. 


public class Patterns{

//This is the main method where the methods will be called to produce shapes based off of input
    public static void main(String[] args){

//arguments for each method shape
    stars(4);
    triangle(5);
    odds(7);
    eo(5);
    pyramid(6);
    }

//Precondition: Any integer number 
//Postcondition: A half pyramid of asterisks, with the number 
//of rows given, with the number of asterisks increasing by 2 after each row
    public static void stars(int rows){
        int i = 0;
        String temp = "*";
        
         
        
           while (i < rows){
            System.out.println(temp);
            temp += "**";
            i++;
           }
        
    }

//Precondition: Any integer number
//Postcondition: A half pyramid of integers where the number in each row
//represents how many integers are in that row. The numbers in the rows 
//increase by 1 and include 1 more number for each row added
    public static void triangle(int rows){
        int i = 1;
        String temp = "";
        int j = 0;

        if (rows == 1){
            System.out.println(1);
        } else {
            System.out.println(1);
            while (i < rows){
                i++;
                temp += i;
                while(j < i){
                    System.out.print(temp);
                    j++;
                }
            j = 0;
            temp = "";
            System.out.println();
            }
        }
    }
//Precondition: Any odd integer
//Postcondition: An upside down triangle that begins with the start input for start times
//and decreases by 2 for each row until there is only one 1
    public static void odds(int start){
    String temp = "";
    


    for(int i = 0; i < start;){ 
        for(int j = 0; j < start; j++){ 
            temp += start;
        }
        System.out.println(temp);
        start -= 2;
        temp = "";
    }
    }
//Precondition: Any integer number
//Postcondition: A sideways pyramid with rows of Es and Os that always has the row of 
//Es as the largest row. The beginning of the pyramid is determined by if the argument
//is even (starts with O) or odd (starts with E).
    public static void eo(int maxE){
        String temp = "";

        if(maxE % 2 == 0){
        temp = "O";
        } else {
            temp = "E";
        }
    
            
        for(int i = 1; i <= maxE; i++){
            for(int j = 0; j < i; j++){
                System.out.print(temp);
            }
        System.out.println();
            if (temp.equals("O")){
                temp = "E";
            } else{
                temp = "O";
            }

            }

            for(int i = maxE - 1; i >= 1; i--){
                for(int j = 0; j < i; j++){
                    System.out.print(temp);
                }
            System.out.println();
                if (temp.equals("O")){
                    temp = "E";
                } else{
                    temp = "O";
                }
            } 

    }

    //Precondition: Any integer number
//Postcondition: An upside-down pyramid with rows of numbers that start with 1 and increase
//by 1 for each row. The number of integers in the first row is determined by 2 * rows - 1, and decreases
//by 2 for each row
    public static void pyramid(int rows){
        int i = 0;
        int j = 1;
        int k = 0;
        int l = 0;
        String temp = "";
        int start = 2 * rows - 1;

        for(i = 0; i < rows; i++){
            k = 0;
            while(k < i){
                temp += " ";
                k++;
            }
        l = 0;
        while (l < start) {
            temp += j;
            l++;
        }
        System.out.println(temp);
        temp = "";
        j += 1;
        start -= 2;
        }

    }
}