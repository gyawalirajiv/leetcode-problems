package com.rajiv.gasStation;

public class GasStation {
    public static void main(String[] args) {
        System.out.println(canCompleteCircuit(new int[]{3,3,4},
                new int[]{3,4,4}));
    }

    public static int canCompleteCircuit(int[] gas, int[] cost) {
        for (int i = 0; i < gas.length; i++) {
            if(gas[i] - cost[i] < 0) continue;
            int j = i + 1 == gas.length ? 0 : i+1;
            int remainingGas = gas[i] - cost[i];
            while (j != i && remainingGas >= 0){
                remainingGas += gas[j];
                remainingGas -= cost[j];

                if(j + 1 >= gas.length) j = 0;
                else j++;
            }
            if(j == i && remainingGas >= 0) return i;
        }
        return -1;
    }
}
