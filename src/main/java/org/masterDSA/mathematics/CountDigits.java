package org.masterDSA.mathematics;

public class CountDigits {

    public int getCount(int n){
        int remainder = 0;
        if (n <=9){
            return 1;
        }else{
            while (n > 0){
                n = n/10;
                remainder++;
            }
        }
        return remainder;
    }
}
