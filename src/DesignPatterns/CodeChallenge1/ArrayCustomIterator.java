package DesignPatterns.CodeChallenge1;

import java.util.NoSuchElementException;

public class ArrayCustomIterator {
   private int currentIndex;
   private final int[] array;

   public ArrayCustomIterator(int[] array) {
      this.currentIndex = 0;
      this.array = array;
   }
   public boolean hasNext(){
      return currentIndex < array.length;
   }
   public Integer next(){
      if(!hasNext()){
         throw new NoSuchElementException();
      }
      return array[currentIndex++];
   }

   public static void main(String[] args) {
      int[] arr = new int[]{1,2,3};
      ArrayCustomIterator it  = new ArrayCustomIterator(arr);
      while (it.hasNext()){
         System.out.println(it.next());
      }
   }
}
