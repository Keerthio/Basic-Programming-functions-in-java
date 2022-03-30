package com.company;
import java.util.*;
import java.util.Scanner;
public class Main {
    static boolean aesNumber(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        if (count == 4) {
            return true;
        } else {
            return false;
        }
    }

    static int friendships(int n) {
        Scanner scan = new Scanner(System.in);
        int day[] = new int[n];
        int count = 0;
        for (int i = 0; i < day.length; i++) {
            day[i] = scan.nextInt();
        }
        int num = 0;
        int temp = 0;
        for (int i = 0; i < day.length - 1; i++) {
            for (int j = i + 1; j < day.length; j++) {
                if (day[i] > day[j]) {
                    temp = day[i];
                    day[i] = day[j];
                    day[j] = temp;
                }
            }
        }
        for (int i = 0; i < day.length - 1; i++) {
            if (day[i] != day[i + 1]) {
                count++;
            }
        }
        return count;
    }

    static int linearSearch(int arr[], int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    static int binarySearch(int arr[], int key) {
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("the array after sorting is:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (high + low) / 2;
            if (key == arr[mid]) {
                return mid;
            } else if (key < arr[mid]) {
                low = 0;
                high = mid - 1;
            } else {
                low = mid + 1;
                high = arr.length-1;
            }
        }
        return -1;
    }

    static int spanArray(int arr[]) {
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        int span = arr[arr.length - 1] - arr[0];
        return span;
    }

    static int secondLargest(int arr[]) {
        int max1 = 0;
        int max2 = 0;
        if (arr[0] > arr[1]) {
            max1 = arr[0];
            max2 = arr[1];
        } else {
            max1 = arr[1];
            max2 = arr[0];
        }

        for (int i = 2; i < arr.length; i++) {
            if (arr[i] > max1) {
                max2 = max1;
                max1 = arr[i];
            } else if (arr[i] > max2) {
                max2 = arr[i];
            }
        }
        return max2;
    }

    static int ceil(int arr[], int key) {
        int low = 0;
        int high = arr.length - 1;
        int mid = 0;
        while (low <= high) {
            mid = (low + high) / 2;
            if (key == arr[mid]) {
                return arr[mid];
            } else if (key < arr[mid]) {
                low = 0;
                high = mid - 1;
            } else {
                low = mid + 1;
                high = arr.length - 1;
            }
        }
        if (low < arr.length) {
            return arr[low];
        } else {
            return -1;
        }
    }

    static int floor(int arr[], int key) {
        int low = 0;
        int high = arr.length - 1;
        int mid = 0;
        while (low <= high) {
            mid = (low + high) / 2;
            if (key == arr[mid]) {
                return arr[mid];
            } else if (key < arr[mid]) {
                low = 0;
                high = mid - 1;
            } else {
                low = mid + 1;
                high = arr.length - 1;
            }
        }
        if (high >= 0) {

            return arr[high];
        } else {
            return -1;
        }
    }

    static int firstAndLast(int arr[], int target) {
        int res[] = {-1, -1};
        int low = 0, high = arr.length - 1, mid = 0;

        while (low <= high) {
            mid = (high + low) / 2;
            if (target == arr[mid]) {
                res[0] = mid;
                high = mid - 1;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        low = 0;
        high = arr.length - 1;
        mid = 0;
        while (low <= high) {
            mid = (high + low) / 2;
            if (target == arr[mid]) {
                res[1] = mid;
                low = mid + 1;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        System.out.println("the first occurence of" + target + ":" + res[0]);
        System.out.println("the last occurence of" + target + ":" + res[1]);
        return 0;
    }

    static int minimumConsecutiveFlips(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                if (arr[i] != arr[0]) {
                    System.out.print(i + "-");
                } else {
                    System.out.println(i - 1);
                }

            }
        }
        if (arr[0] != arr[arr.length - 1]) {
            System.out.println(arr.length - 1);
        }
        return 0;
    }

    static int MinMax(int arr[]) {
        int maxsum = 0;
        int minsum = 0;
        int sum = 0;
        int big = arr[0];
        int small = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > big) {
                big = arr[i];
            }
            if (arr[i] < small) {
                small = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println("the maximum sum is;" + (sum - small));
        System.out.println("the minimum sum is;" + (sum - big));
        return 0;
    }

    static int minimumDistance(int arr[], int x, int y) {
        int xindex = 0, yindex = 0, difference = 0;
        for (int i = 0; i < arr.length; i++) {
            if (x == arr[i]) {
                xindex = i;
            }
            if (y == arr[i]) {
                yindex = i;
            }
        }
        if (xindex < yindex) {
            difference = yindex - xindex;

        } else {
            difference = xindex - yindex;
        }
        return difference;
    }

    static int MajorityElement(int arr[], int n) {
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        int count = n / 2;
        int count1 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == arr[i + 1]) {
                count1++;
            }
            if (count1 > count) {
                return arr[i];
            }
        }
        return -1;
    }

    static int Caterpillar(int leaves, int arr[], int n) {
        /* Hackerrank problem */
        int leaveseaten = 0;
        for (int i = 1; i <= 10; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i % arr[j] == 0) {
                    leaveseaten++;
                    break;
                }
            }
        }
        System.out.println("the leftover leaves are:" + (leaves - leaveseaten));

        return 0;
    }

    static int nextGreaterElement(int arr[]) {
        int largest = 0;
        int b[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            largest = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > largest) {
                    largest = arr[j];
                    if (arr[j] < largest && arr[j] > arr[i]) {
                        largest = arr[j];
                    }

                }
                if (largest == arr[i]) {
                    b[i] = -1;
                } else {
                    b[i] = largest;
                }
            }
        }
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
        return 0;
    }
    static void BubbleSort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    arr[j] = arr[j] + arr[j + 1];
                    arr[j + 1] = arr[j] - arr[j + 1];
                    arr[j] = arr[j] - arr[j + 1];
                }
            }
        }
    }
    static void InsertionSort(int arr[])
    {
        for(int i=1;i<arr.length;i++)
        {
            int key=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>key)
            {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
    }
    static void swap(int a,int b)
    {
        int temp=0;
        temp=a;
        a=b;
        b=temp;
    }
    static void SelectionSort(int arr[])
    {

         for(int i=0;i<arr.length;i++)
         {
             int min_i=i;
             int temp=0;
             for(int j=i+1;j<arr.length;j++)
             {
                 if(arr[j]<arr[min_i])
                 {
                     min_i=j;
                 }
             }
             temp=arr[i];
             arr[i]=arr[min_i];
             arr[min_i]=temp;
         }
    }


    //STRING QUESTING SOLVED;

     static String toUpperCase(String str)
     {
         String s="";
         for(int i=0;i<str.length();i++)
         {
             char c=str.charAt(i);
             if(c>='a' && c<='z')
             {
                 s=s+(char)(c-32);
             }
             else
             {
                s=s+c;
             }
         }
         return s;
     }

     static String toLowerCase(String str)
     {
         String s="";
         for(int i=0;i<str.length();i++) {
             char ch = str.charAt(i);
             if (ch >= 'A' && ch <= 'Z') {
                 s = s + (char) (ch + 32);
             } else {
                 s = str + ch;
             }
         }
         return s;
     }
     static int indexOf(String str,int ch)
     {
         for(int i=0;i<str.length();i++)
         {
             char c=str.charAt(i);
             if(c==ch)
             {
                 return i;
             }
         }
         return -1;
     }
    static int SecondindexOf(String str,String ch)
    {
        char key=ch.charAt(0);
        int k=2;
        int count=0;
        for(int i=0;i<str.length();i++)
        {
            char c=str.charAt(i);
            if(c==key)
            {
               count++;
               if(count==k)
                {
                    return i;
                }
            }
        }
        return -1;
    }

     static int lastIndex(String str) {
         Scanner scan = new Scanner(System.in);
         System.out.println("Enter the character ypu wan to find the index of");
         char key = scan.next().charAt(0);
         for (int i = str.length()-1; i >= 0; i--) {
             char ch=str.charAt(i);
             if (ch == key) {
                 return i;
             }
         }
         return -1;
     }
     static char[] tocharArray(String str)
     {
         char a[]=new char[str.length()];
         for(int i=0;i<str.length();i++)
         {

             a[i]=str.charAt(i);
         }
         return a;
     }
     static boolean stringequal(String s1,String s2)
     {
         if(s1.length()!=s2.length())
         {
             return false;
         }
         else
         {
             for(int i=0;i<s1.length();i++)
             {
                 if(s1.charAt(i)!=s2.charAt(i))
                 {
                     return false;
                 }
             }
         }
         return true;
     }
     static boolean startsWith(String s1,String s2)
     {
         int count=0;
         for(int i=0;i<s2.length();i++)
         {
             if(s1.charAt(i)==s2.charAt(i))
             {
                count++;
             }
         }
         if(count==s2.length())
         {
             return true;
         }


         return false;
     }
     static boolean endswith(String s1,String s2)
     {
         int count=0;
         int index=s1.length()-s2.length();
         for(int i=index;i<s1.length();i++)
         {
             if(s2.charAt(count)==s1.charAt(i))
             {
                 count++;
             }
         }
         if(count==s2.length())
         {
             return true;
         }
         return false;
     }
        static boolean contains(String s1,String s2)
        {
            int count=0;
            if(s1.length()<s2.length())
            {
                return false;
            }
            for(int i=0;i<s1.length();i++)
            {
                if(s1.charAt(i)==s2.charAt(count))
                {
                    count++;
                }
                else
                {
                    count=0;
                }
            }
            if(s2.length()==count)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        static String replace(String s1,char old_char,char new_char)
        {

            char[] c=tocharArray(s1);
            for(int i=0;i<c.length;i++)
            {
                if(c[i]==old_char)
                {
                    c[i]=new_char;
                }
            }
            return new String(c);
        }
        static int camelCase(String str) {
            int count = 1;
            for (int i = 1; i < str.length(); i++)
            {
                if(str.charAt(i)>='A' && str.charAt(i)<='Z')
                {
                    count++;
                }
            }
            return count;
        }


    public static void main(String[] args) {
        // write your code here
       
       }
    }

