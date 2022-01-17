public class Main {
    public static void main(String[] args)
    {
        System.out.println ("Hello, I am Ronnie Ng!");

        String modulecode = "CSC1009";   
        switch(modulecode)   
        {   
            case "CSC1009":   
                System.out.println("Object-Oriented programming"); 
                break;      
        }   
        System.out.println("After switch"); 

        for(int x = 102; x >= 66; x--)
        {
            if(x%2==1)
            {
            System.out.print("Value of x: " + x);
            System.out.print("\n");
            }
        }
    }
}