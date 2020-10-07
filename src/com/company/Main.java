package com.company;

public class Main {

    public static void main(String[] args) {
        SortingStudentByGPA[] s = new SortingStudentByGPA[5];
        s[0] = new SortingStudentByGPA("Lopatina Kristina", 12, 80);
        s[1] = new SortingStudentByGPA("Lopatina Polina", 3, 90);
        s[2] = new SortingStudentByGPA("Cheglakova Margorita", 4, 60);
        s[3] = new SortingStudentByGPA("Kopcova Dary", 6, 65);
        s[4] = new SortingStudentByGPA("Kolomarov Vladimir", 25, 60);
        quickSort(s, 0, 4);
        for (int i=0; i<5; i++){
            System.out.println(s[i]);
        }
    }

    public static int compareTo(int o, int o1) {
        return (o-o1);
    }
    public static void quickSort(SortingStudentByGPA[] array, int low, int high) {
        int leftMarker = low;
        int rightMarker = high;
        int pivot = array[(leftMarker + rightMarker) / 2].GPA;
        do {
            while ((compareTo(array[leftMarker].GPA, pivot))<0) {
                leftMarker++;
            }
            while (compareTo(array[rightMarker].GPA , pivot) >0) {
                rightMarker--;
            }
            if (compareTo(leftMarker, rightMarker) <=0) {
                if (compareTo(leftMarker, rightMarker) <0) {
                    int tmp = array[leftMarker].GPA;
                    array[leftMarker].GPA = array[rightMarker].GPA;
                    array[rightMarker].GPA = tmp;
                }
                leftMarker++;
                rightMarker--;
            }
        } while (compareTo(leftMarker, rightMarker) <=0);
        
        if (compareTo(leftMarker, high) <0) {
            quickSort(array, leftMarker, high);
        }
        if (compareTo(low, rightMarker) <0) {
            quickSort(array, low, rightMarker);
        }
    }



}
