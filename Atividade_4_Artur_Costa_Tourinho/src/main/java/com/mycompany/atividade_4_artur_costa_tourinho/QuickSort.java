package com.mycompany.atividade_4_artur_costa_tourinho;
import java.io.IOException;

/**
 *
 * @author artur
 */
public class QuickSort {

    public static int partition(int a[], int inicio, int fim){  
          
        int esquerda, direita, mistura, posicao, aux;     
        posicao = esquerda = inicio;  
        direita = fim;  
        aux = 0;  
        while(aux != 1){  
            while((a[posicao] <= a[direita]) && (posicao!=direita))  
                direita--;  
            if(posicao==direita)  
                aux =1;  
            else if(a[posicao]>a[direita]){  
                mistura = a[posicao];  
                a[posicao] = a[direita];  
                a[direita] = mistura;  
                posicao = direita;  
            }  
            if(aux!=1){  
                while((a[posicao] >= a[esquerda]) && (posicao!=esquerda))  
                esquerda++;  
                if(posicao==esquerda)  
                    aux =1;  
                if(a[posicao] <a[esquerda]){  
                    mistura = a[posicao];  
                    a[posicao] = a[esquerda];  
                    a[esquerda] = mistura;  
                    posicao = esquerda;  
                }  
            }  
        }  
        return posicao;  
    }  
    static void quickSort(int a[], int inicio, int fim){  
          
        int posicao;  
        
        if(inicio<fim){  
            posicao = partition(a, inicio, fim);  
            quickSort(a, inicio, posicao-1);  
            quickSort(a, posicao+1, fim);  
        }  
    }  

}
   