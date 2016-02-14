package unity0;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mayerlin_Yandar
 */
public class List {
    private int[] data;
    private int top;
     
    public List(){
        data= new int[100];
        top=0;
        
    }
    public void add(int d, int index){
        top++;//hago el espacio
        if(index<top){
            for(int i=top-1;i>=index;i--){
            data[i+1]=data[i];
            }
            data[index]=d;
        }
    }
    public int Remove(int num){
       int da;
       da=data[num];
        System.out.println(da);
       for(int i=num;i<top;i++){
           data[i]=data[i+1];
       }
       top--;
        return da;
    }
    public void print(){
        for(int i=0;i<top;i++){
            System.out.print("  "+data[i]);
        }
        System.out.println();
    }
     
}
    

