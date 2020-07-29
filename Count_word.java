//Accept a String input
// Print the count of words in the String. Space is assumed to be the separator between words
// Print all numbers that are present in the String and also if they are odd or even. Numbers which are together should be counted as one number.



import java.utili.*;
public class Count_word{
    
     static String extractInt(String str) 
      { 
            str = str.replaceAll("[^\\d]", " ");
            str = str.trim(); 
            str = str.replaceAll(" +", " "); 
            if (str.equals("")) 
                return "-1"; 
           
           return str; 
      } 
    
     static void CountingEvenOdd(int arr[], int arr_size) 
    { 
        int even_count = 0;          
        int odd_count = 0;          
              
        for(int i = 0 ; i < arr_size ; i++)  
        { 
            if ((arr[i] & 1) == 1) 
                odd_count ++ ;      
            else                
                even_count ++ ;      
        } 
      
        System.out.println( "Even numbers: "+ even_count);  
        System.out.println( "Odd numbers: "+ odd_count);  

                   
    } 

     public static void main(String []args){
        System.out.println("Hello World");
        Scanner sc= new Scanner(System.in);       
        System.out.print("Enter a string: ");  
         String str= sc.nextLine();        
        String[] words = str.split("\\s+");
        for(int i = 0; i < words.length; i++) {
           words[i] = words[i].replaceAll("[^\\w]", "");
        }
        System.out.println("words in string: "+words.length); 

        String numberString = extractInt(str);
        System.out.println("numbers in string: "+ numberString);
        if(!numberString.equals("-1")){
            String[] numbers = numberString.split("\\s+");
            for(int i = 0; i < numbers.length; i++) {
            numbers[i] = numbers[i].replaceAll("[^\\w]", "");
            }
            
            int size = numbers.length;
              int [] arr = new int [size];
              for(int i=0; i<size; i++) {
                 arr[i] = Integer.parseInt(numbers[i]);
              }
              int n = arr.length;
              CountingEvenOdd(arr, n); 
        }
        
        


     }
}
