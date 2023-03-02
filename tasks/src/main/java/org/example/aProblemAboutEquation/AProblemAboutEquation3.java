package org.example.aProblemAboutEquation;

import lombok.extern.slf4j.Slf4j;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;


/**
 * https://codeforces.com/problemset/problem/174/A
 */

@Slf4j
public class AProblemAboutEquation3 {
    // private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(AProblemAboutEquation3.class);
    public static void main(String[] args) {
        AProblemAboutEquation3 myMain = new AProblemAboutEquation3();
        /**
         * A ten sposób to nie z Lombocka??
         * log("");
         */
//        log("something");
        log.info("something else");
//        log.debug("what??");
        myMain.aProblemAboutEquationWithFastScan();

    }

    List<Float> aProblemAboutEquationWithFastScan() {
        FastReader sc = new FastReader();
        int numberOfFriends = sc.nextInt();
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
