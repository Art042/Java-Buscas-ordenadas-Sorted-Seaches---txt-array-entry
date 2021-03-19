package com.mycompany.atividade_4_artur_costa_tourinho;

import java.io.IOException;
import static java.lang.Thread.sleep;

/**
 *
 * @author artur
 */
public class HeapSorting {
    static void heapify(int[] array, int tam, int i){  
        int maior = i;    
        int esquerda = 2*i + 1;    
        int direita = 2*i + 2;    
        int aux;  

        if (esquerda < tam && array[esquerda] > array[maior])  
            maior = esquerda;  
            
        if (direita < tam && array[direita] > array[maior])  
            maior = direita;  

        if (maior != i){  
            aux = array[i];  
            array[i]= array[maior];   
            array[maior] = aux;  
            heapify(array, tam, maior);  //recursão

        }  
}  
  
    static void heapSort(int[] array, int tam){  
        int i;  
        int aux;  
        for (i = tam; i >= 0; i--)  //começo do algoritimo
            heapify(array, tam, i);  //Aplicação da propriedade Heap
        for (i=tam-1; i>=0; i--){  
            aux = array[0];  
            array[0]= array[i];   
            array[i] = aux;  
            heapify(array, i, 0);  
            //Para Exibição
            System.out.print(" "+array[i] + " ");
            for(int s=0; s<3; s++){
                System.out.print(".");
                //sleep(1000);
            }
            //Fim Exibição
        }  
    }  
    
}
 