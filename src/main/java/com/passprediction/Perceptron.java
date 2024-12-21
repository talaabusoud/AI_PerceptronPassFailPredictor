/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.passprediction;

import java.util.Random;

/**
 *
 * @author RayaThawabe
 */
public class Perceptron {
    double[] inputWeights;
    double output;
    double threshold;
    double error;
    private final int numberOfInputs;
    
    public Perceptron(int numberOfInputs){
        Random rand = new Random();
        this.numberOfInputs = numberOfInputs;
        inputWeights = new double[numberOfInputs];
        for(int i = 0; i < numberOfInputs; i++){
            inputWeights[i] = rand.nextFloat()*2 -1;
        }
        threshold = rand.nextFloat()*2 -1;
    }
    
    public void calculateOutput(float... inputs){
        if(inputs.length != numberOfInputs){
            return;
        }
        float sum = 0;
        for(int i = 0; i < numberOfInputs; i++){
            sum += inputs[i] * inputWeights[i];
        }
            if((sum+threshold) >= 0){
                output = 1;
            }else
                output = 0;
    }
    
    public void calculateError(float expected){
        error = expected-output;
    }
    
    public void weightCorrection(double learningRate, float... inputs){
        if(inputs.length != numberOfInputs){
            return;
        }
        for(int i = 0; i < numberOfInputs; i++){
            inputWeights[i] += learningRate*error*inputs[i];
        }
        threshold += learningRate*error;
    }
    
}
