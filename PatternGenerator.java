//Derin Soysal 
//Period 4
//10/30/25
//This program
public class PatternGenerator{
    public static void main(String[] args){

        





    }

    public static void stars(int rows){
        int i = 0;
        String stars = "";
        
        
            if (rows == 1){
            System.out.println("*");
            } else if (rows > 1) {
                do {
                    System.out.println("*");
                } while(rows == 1);
                    while (rows > 1 && rows <= i){
                        System.out.println("**");
                        i++;
                    }
                
            } 
        System.out.println(stars(3));



    }
}