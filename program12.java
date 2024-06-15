/*Method overloading (Compile time Polymorphism):
Write a Java program to create a class called
ArrayDemo and overload arrayFunc() function.
void arrayFunc(int [], int) To find all pairs of elements in an
Array whose sum is equal to a givennumber :
Array numbers= [4, 6, 5, -10, 8, 5, 20], target=10
Output :
Pairs of elements whose sum is 10 are :4 + 6 = 10
5 + 5 = 10
-10 + 20 = 10
void arrayFunc(int A[], int p, int B[], int q) Giventwo sorted arrays A
and B of size p and q, Overload method arrayFunc() to merge elements of
A with B bymaintaining the sorted order i.e. fill A with first p smallest
elements and fill B with remaining elements.
Example:
Input :
2
int[] A = { 1, 5, 6, 7, 8, 10 }
int[] B = { 2, 4, 9 }
Output:
Sorted Arrays:
A: [1, 2, 4, 5, 6, 7]
B: [8, 9, 10]
(Use Compile time Polymorphism MethodOverloading)*/
import java.util.*;

class ArrayDemo {
    // Overloaded method for finding pairs with a given sum
    void arrayFunc(int arr[], int target) {
        System.out.println("Pairs of elements whose sum is " + target + " are:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println(arr[i] + " + " + arr[j] + " = " + target);
                }
            }
        }
    }

    // Overloaded method for merging two sorted arrays
    void arrayFunc(int A[], int p, int B[], int q) {
        int[] mergedArray = new int[p + q];
        int i = 0, j = 0, k = 0;
        while (i < p && j < q) {
            if (A[i] < B[j]) {
                mergedArray[k++] = A[i++];
            } else {
                mergedArray[k++] = B[j++];
            }
        }
        while (i < p) {
            mergedArray[k++] = A[i++];
        }
        while (j < q) {
            mergedArray[k++] = B[j++];
        }

        // Update A and B with first p smallest elements and remaining elements respectively
        System.arraycopy(mergedArray, 0, A, 0, p);
        System.arraycopy(mergedArray, p, B, 0, q);

        // Print sorted arrays
        System.out.println("Sorted Arrays:");
        System.out.println("A: " + Arrays.toString(A));
        System.out.println("B: " + Arrays.toString(B));
    }
}

public class program12 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        // Find pairs with a given sum
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
        int[] numbers = new int[n];
        
        System.out.println("Enter elements of array:");
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }
        
        System.out.println("Enter the target sum:");
        int target = sc.nextInt();
        
        ArrayDemo obj = new ArrayDemo();
        obj.arrayFunc(numbers, target);
        
        // Merge two sorted arrays
        System.out.println("Enter size for first sorted array:");
        int p = sc.nextInt();
        int[] A = new int[p];
        
        System.out.println("Enter elements for first sorted array:");
        for (int i = 0; i < p; i++) {
            A[i] = sc.nextInt();
        }
        
        System.out.println("Enter size for second sorted array:");
        int q = sc.nextInt();
        int[] B = new int[q];
        
        System.out.println("Enter elements for second sorted array:");
        for (int i = 0; i < q; i++) {
            B[i] = sc.nextInt();
        }
        
        obj.arrayFunc(A, p, B, q);
    }
}
