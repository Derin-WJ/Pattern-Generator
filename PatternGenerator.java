//Derin Soysal 
//Period 4
//10/30/25
//This program
public class PatternGenerator{
    public static void main(String[] args){

    stars(4);
    //triangle(4);
    odds(9);

    }

    public static void stars(int rows){
        int i = 0;
        String temp = "*";
        
         
        
           while (i < rows){
            System.out.println(temp);
            temp += "**";
            i++;
           }
        
    }


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

    public static void odds(int start){
    String temp = "";
    

//start -=2, j=0, temp = ""
    for(int i = 0; i < start;){ //runs 3 times
        for(int j = 0; j < start; j++){ //runs 3, then 1
            temp += start;
        }
        System.out.println(temp);
        start -= 2;
        temp = "";
    }



    }
}