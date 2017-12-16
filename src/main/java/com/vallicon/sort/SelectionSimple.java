/*
 * Copyright 2017 nghiatc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.vallicon.sort;

import java.util.Arrays;

/**
 *
 * @author Vallicon
 * @since Dec 16, 2017
 */
public class SelectionSimple {

    public static void sort(int[] a) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (a[j] < a[min]) {
                    min = j;
                }
            }
            if(min != i){
                swap(a, i, min);
            }
        }
    }
    
    // exchange a[i] and a[j]
    private static void swap(int[] a, int i, int j) {
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] a = {8, 2, 6, 1, 9, 3, 7, 5, 4};
        System.out.println("Before Selection Sort: " + Arrays.toString(a));
        sort(a);
        System.out.println("After Selection Sort: " + Arrays.toString(a));
    }

}




