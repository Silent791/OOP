package com.company;

import java.util.Arrays;

public class game {
    public static void main(String[] args) {
        String[] m = {"dote", "dotes", "toes", "set", "dot", "dots", "sted"};
        System.out.print(totalPoints(m, "tossed"));
    }

    public static int totalPoints(String[] m, String s) {
        int k = -1; int sum = 0;
        for (int i = 0; i < m.length; i++) {
            k = 0;
            String sCopy = s;
            String b = m[i];
            for (int j = 0; j < b.length(); j++) {
                for (int n = 0; n < sCopy.length(); n++) {
                    if (b.charAt(j) == sCopy.charAt(n)) {
                        k++;
                        sCopy = sCopy.substring(0, n) + sCopy.substring(n + 1, sCopy.length());
                        break;
                    }
                }
            }
            if (k == b.length()) {
                if (k == s.length())
                    sum = sum + 50;
                switch (k) {
                    case (3):
                        sum = sum + 1;
                        break;
                    case (4):
                        sum = sum + 2;
                        break;
                    case (5):
                        sum = sum + 3;
                        break;
                    case (6):
                        sum = sum + 4;
                        break;
                }
            }
        }
        return (sum);
    }
}
