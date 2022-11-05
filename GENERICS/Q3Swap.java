package GENERICS;

public class Q3Swap {

  public <T> void swap(T[] arr, int i, int j) {

    T temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }

  public static void main(String args[]) {

    Q3Swap s = new Q3Swap();
    Integer[] arr = { 1, 2, 3, 4, 5 };
    System.out.println("Before Exchanging Positions:");
    for (int i : arr) {
      System.out.print(i + " ");
    }
    System.out.println();
    System.out.println("After Exchanging Positions:");
    s.<Integer> swap(arr, 0, 3);
    for (int i : arr) {
      System.out.print(i + " ");
    }
    String[] array = { "Hi", "Hello" };
    System.out.println("Before Exchanging Positions:");
    for (String i : array) {
      System.out.print(i + " ");
    }
    System.out.println();
    System.out.println("After Exchanging Positions:");
    s.swap(array, 0, 1);
    for (String i : array) {
      System.out.print(i + " ");
    }

  }

}