package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class TopScorers {

	public static void main(String[] args) {
		System.out.println(getMinimumTravelTime("1,2,5,8,10"));
	}

	public static int getMinimumTravelTime(String weightsOfPeople) {
        String[] weightCharArr = weightsOfPeople.split(",");
        int[] weightArr = new int[weightCharArr.length];
        int timeCount = 0;

        for(int i=0;i<weightCharArr.length;i++) {
            weightArr[i] = Integer.parseInt(weightCharArr[i]);
        }

        Arrays.sort(weightArr);

        System.out.println(Arrays.toString(weightArr));

        int minWeight = weightArr[0];
        if(weightArr.length > 1) {
            for(int i=1; i<weightArr.length;i++) { 
                if(i==weightArr.length-1) {
                    timeCount = timeCount + weightArr[i];
                }
                else {           
                    timeCount = timeCount + weightArr[i] + minWeight;
                }
            }
            return timeCount;
        }
        else {
            return minWeight;
        }
    }

}
