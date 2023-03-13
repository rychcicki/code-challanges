package org.example.aProblemAboutEquation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;


/**
 * https://codeforces.com/problemset/problem/174/A
 */

public class AProblemAboutEquation3 {
    boolean numberOfFriendsVerifier(int numberOfFriends) {
        return numberOfFriends >= 2 && numberOfFriends <= 100;
    }

    boolean millilitersOfTheDrinkInTheBottleVerifier(int millilitersOfTheDrinkInTheBottle) {
        return millilitersOfTheDrinkInTheBottle >= 1 && millilitersOfTheDrinkInTheBottle <= 100;
    }

    List<Float> aProblemAboutEquationWithFastScan() {
        FastReader sc = new FastReader();
        int numberOfFriends = sc.nextInt();
//        numberOfFriendsVerifier(numberOfFriends);
        int millilitersOfTheDrinkInTheBottle = sc.nextInt();

        List<Integer> volumeOfTheDrinkInTheMugs = new ArrayList<>();
        for (int i = 0; i < numberOfFriends; i++) {
            volumeOfTheDrinkInTheMugs.add(sc.nextInt());
        }
        return aProblemAboutEquation(numberOfFriends, millilitersOfTheDrinkInTheBottle, volumeOfTheDrinkInTheMugs);
    }

    List<Float> aProblemAboutEquation(int numberOfFriends, int millilitersOfTheDrinkInTheBottle, List<Integer> volumeOfTheDrinkInTheMugs) {
        float sumVolumeOfTheDrinkInAllMugs = 0;
        for (int i = 0; i < numberOfFriends; i++) {
            sumVolumeOfTheDrinkInAllMugs += volumeOfTheDrinkInTheMugs.get(i);
        }

        List<Float> volumeOfTheDrinkToAdd = new ArrayList<>();
        float averageVolumeOfTheDrinkInMug = (sumVolumeOfTheDrinkInAllMugs + millilitersOfTheDrinkInTheBottle) / numberOfFriends;
        for (int i = 0; i < numberOfFriends; i++) {
            volumeOfTheDrinkToAdd.add(averageVolumeOfTheDrinkInMug - volumeOfTheDrinkInTheMugs.get(i));
            if (volumeOfTheDrinkToAdd.get(i) < 0) {
                System.out.println(-1);
                return List.of(-1f);
            }
        }
        System.out.println(volumeOfTheDrinkToAdd);
        return volumeOfTheDrinkToAdd;
    }

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }
    }
}
