//Pratique a implantação de um programa de ordenação: selecion sort

import java.util.Arrays;

class SelectionSort {
    public static void main (String[] args){
        int[] arr = {9, 0, 8, 1, 7, 2, 6, 3, 5, 4};
        for(int i=0; i<arr.length; i++){
            // Inicialmente, defina o menor índice como o índice atual
            int min_index = i;
            // Encontre o menor elemento na sublista restante
            for(int j=i+1; j<arr.length; j++){
                if (arr[j]<arr[min_index]){ 
                min_index = j;
                }
            // Troque o menor elemento encontrado com o elemento no índice atual
            }
        int temp = arr[i];
        arr[i] = arr[min_index];
        arr[min_index] = temp;    
        }
        System.out.println("A Lista ordenada é:");
        System.out.println(Arrays.toString(arr));
    }
}