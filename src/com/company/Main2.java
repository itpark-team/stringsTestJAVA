package com.company;

public class Main2 {
    public static void main(String[] args) {
        String str = "яблоко"; //блок око
        System.out.println(str);

        System.out.println(str.substring(1, 5));
        System.out.println(str.substring(3));

        String str2 = "вертикаль";//тир ветка

        System.out.println(str2.substring(3, 5) + str2.charAt(2));
        System.out.println(str2.substring(0, 2) + str2.charAt(3) + str2.substring(5, 7));

        String str3 = "Спартак";
        for (int i = 0; i < str3.length(); i++) {
            System.out.println(str3.charAt(i));
        }

        String str4 = "";
        for (int i = 0; i < str3.length(); i++) {
            if (i % 2 == 0) {
                str4 += str3.charAt(i);
            }
        }

        System.out.println(str4);

        String str5 = "*".repeat(5);
        System.out.println(str5);

        String str6 = "мама молоко приносила";//а<->о
        String str7 = "";

        str6 = str6.replace('о', '~');
        str6 = str6.replace('а', 'о');
        str6 = str6.replace('~', 'а');

        System.out.println(str6);

        for (int i = 0; i < str6.length(); i++) {
            if (str6.charAt(i) == 'а') {
                str7 += 'о';
            } else if (str6.charAt(i) == 'о') {
                str7 += 'а';
            } else {
                str7 += str6.charAt(i);
            }
        }

        System.out.println(str7);

        String str8 = "1 2 3 100 5";
        String[] tempNumbers = str8.split(" ");
        int sum = 0;
        for (int i = 0; i < tempNumbers.length; i++) {
            sum += Integer.parseInt(tempNumbers[i]);
        }
        System.out.println("sum = " + sum);
        
    }
}
