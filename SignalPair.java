package com.company;

public class SignalPair {
    double[] firstArray;
    double[] secondArray;
    public SignalPair(double[] a, double[]b){
        this.firstArray=a;
        this.secondArray=b;
    }
    public int maxAutoCorrelate(){
        return autocorrelate();
    }
    //dot product of the two arrays
    public double correlate(double[]a, double[]b){
        double num = 0.0;
        for(int i = 0; i < a.length; i++){
            num+=(a[i]*b[i]);
        }
        return num;
    }
    public int autocorrelate(){
        double maxVal= 0;
        int rotation = 0;
        int val = 0;

        for(int i = 0; i < firstArray.length;i++){
            rotation++;
            double last;
            int j;
            last = firstArray[firstArray.length-1];
            for(j = firstArray.length-1; j >0; j--){
                firstArray[j] = firstArray[j-1];
                firstArray[0] = last;
            }
            if(correlate(firstArray, secondArray)>maxVal){
                maxVal = correlate(firstArray,secondArray);
                val = rotation;
            }
        }
        return val;
    }
}
