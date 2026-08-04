/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package about_interface;

/**
 *
 * @author limis
 */
public class InterfaceAndSorting {
      public static void main(String[] argv){
        int[] data = {80, 30, 50, 70, 20, 10};
        sortNumber(data);
        for (int value : data)
            System.out.print(value + " ");
        System.out.println();        
    }
    public static void sortNumber(int[] data){
        // Bubble sort
        for (int i = 0; i < data.length - 1; i++ ){
            for (int curr = 0; curr < data.length - 1; curr++){
                if (data[curr] > data[curr+1]){
                    int temp = data[curr];
                    data[curr] = data[curr+1];
                    data[curr+1] = temp;
                }
            }
        }        
    }
}
