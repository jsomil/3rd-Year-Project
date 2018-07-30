/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package artificial_d;

/**
 *
 * @author Freeware Sys
 */
public class BBC implements java.io.Serializable {
 float BMI,BFC,IWC,BMR;

    public float getBMI(int weight,double height) {
        height=height/100;
        BMI = (float) (weight/height*height);
        
        return BMI;
    }

    public void setBMI(float BMI) {
        this.BMI = BMI;
     
    }

    public float getBFC(int weight,double height,int age,String Gender) {
        height=height/100;
        if(Gender.equals("Male")) {
        BFC = (float) (1.20*weight/height*height - 0.23*age -10.8 -5.4);  
        }
        else
            BFC = (float) (1.20*weight/height*height - 0.23*age -5.4);
        
        return BFC;
    }

    public void setBFC(float BFC) {
        this.BFC = BFC;
    }

    public float getIWC(double height,String Gender) {
        if(Gender.equals("Male")) {
            IWC = (float) (52 + (1.9)*(height-150));
        }
        else
            IWC = (float) (52 + (1.7)*(height-150));
        
        return IWC;
    }

    public void setIWC(float IWC) {
        this.IWC = IWC;
    }

    public float getBMR(int weight,double height,int age) {
        BMR=(float) (10*weight+6.25*height - 5*age + 5);
        return BMR;
    }

    public void setBMR(float BMR) {
        this.BMR = BMR;
    }
 
    
}
