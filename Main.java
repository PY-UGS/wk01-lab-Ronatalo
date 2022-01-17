public class Main {
    public static void main(String[] args)
    {
        System.out.println ("Hello, I am Ronnie Ng!");

        String modulecode = "CSC1009";   
        switch(modulecode)   
        {   
            case "CSC1006":   
            System.out.println("Mathematics 2"); 
            break;  

            case "CSC1007":   
            System.out.println("Operating Systems"); 
            break;  

            case "CSC1008":   
            System.out.println("Data Structures and Algorithmns"); 
            break;  

            case "CSC1009":   
            System.out.println("Object-Oriented programming"); 
            break;   

            case "CSC1010":   
            System.out.println("Computer Networks"); 
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
