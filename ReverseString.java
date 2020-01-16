/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author oluwasakinoluwatobi
 */
public class ReverseString {
    
    public static void main (String[] args){
        String result = reverse("I am me");
        System.out.println(result);
    }
    
       //This method accepts a string and reads the string from the back
    public static String reverse(String s){
        String reverse = "";
        
        for (int i=0; i<s.length(); i++){
            reverse = s.charAt(i)+reverse;
        }
        return reverse;
    }
    
    
    
}

