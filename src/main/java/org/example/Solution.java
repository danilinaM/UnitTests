package org.example;

public class Solution {
    public static String makeStringSmall(String str) {
        StringBuilder builder = new StringBuilder();
        int n = 1;
        char[] arr = str.toCharArray();

        for (int i = 0; i <= arr.length - 1; i++) {
            if ((i == arr.length - 1)) {
                builder.append(arr[i]);
                builder.append(n);
                break;
            } else {
                if (arr[i] == arr[i + 1]) {
                    n++;
                } else {
                    builder.append(arr[i]);
                    builder.append(n);
                    n = 1;
                }
            }
        }
        System.out.println(builder);
        return (builder.toString());
    }
    public static void main(String[] args) {

    }
}
