package com.mycompany.javalessons.ThirdWeek.OOPStream;

public class MilitaryCreditManager extends BaseCreditManager{

    @Override
    public void calculate() {
        System.out.println("Military Credit Calculated");
    }
    
    @Override
    public void save(){
        super.save();
        System.out.println("Special Military save");
    }    
}
