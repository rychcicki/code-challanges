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
public class AProblemAboutEquation {
    float aProblemAboutEquation() {
        AProblemAboutEquation.FastReader sc = new AProblemAboutEquation.FastReader();
        int numberOfFriends = sc.nextInt();
        int millilitersOfTheDrinkInTheBottle = sc.nextInt();

        float sumVolumeOfTheDrinkInAllMugs = 0;
        List<Integer> volumeOfTheDrinkInTheMugs = new ArrayList<>();
        for (int i = 0; i < numberOfFriends; i++) {
            volumeOfTheDrinkInTheMugs.add(sc.nextInt());
            sumVolumeOfTheDrinkInAllMugs += volumeOfTheDrinkInTheMugs.get(i);
        }

        List<Float> volumeOfTheDrinkToAdd = new ArrayList<>();
        float averageVolumeOfTheDrinkInMug = (sumVolumeOfTheDrinkInAllMugs + millilitersOfTheDrinkInTheBottle) / numberOfFriends;
        for (int i = 0; i < numberOfFriends; i++) {
            volumeOfTheDrinkToAdd.add(averageVolumeOfTheDrinkInMug - volumeOfTheDrinkInTheMugs.get(i));
            if (volumeOfTheDrinkToAdd.get(i) < 0) {
                return -1;
            }
        }

        for (int i = 0; i < numberOfFriends; i++) {
            return volumeOfTheDrinkToAdd.get(i);
        }
        return 0;
    }

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(
                    new InputStreamReader(System.in));
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
