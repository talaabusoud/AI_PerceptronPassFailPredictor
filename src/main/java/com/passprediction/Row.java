/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.passprediction;

public class Row {

    public float[] marks;
    public boolean pass;
    
    public boolean isPass(){
        return pass;
    }
    
    public float[] normalizeMarks(int mid){
        float[] normalizedMarks = new float[marks.length];
        for(int i = 0; i < marks.length; i++){
            normalizedMarks[i] = (marks[i]-mid)/(float)(100-mid);
        }
        return normalizedMarks;
    }
}
