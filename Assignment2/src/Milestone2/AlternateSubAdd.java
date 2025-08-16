package Milestone2;


import java.io.*;
import java.util.*;

class UserMainCode {
    public int AddSub(int input1, int input2) {
        int result = 0;

        if (input2 == 1) { 
            // N - (N-1) + (N-2) - (N-3) + ...
            boolean add = true;
            for (int i = input1; i >= 1; i--) {
                if (add) {
                    result += i;
                } else {
                    result -= i;
                }
                add = !add; 
            }
        } else if (input2 == 2) { 
            // N + (N-1) - (N-2) + (N-3) - ...
            boolean add = true;
            for (int i = input1; i >= 1; i--) {
                if (add) {
                    result += i;
                } else {
                    result -= i;
                }
               
                if (i == input1 - 1) { 
                    add = false;
                } else {
                    add = !add;
                }
            }
        }

        return result;
    }
}



