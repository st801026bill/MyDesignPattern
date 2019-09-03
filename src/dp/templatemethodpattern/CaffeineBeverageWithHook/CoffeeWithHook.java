/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.templatemethodpattern.CaffeineBeverageWithHook;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author st801
 */
public class CoffeeWithHook extends CaffeineBeverageWithHook{

    @Override
    protected void brew() {
        System.out.println("用沸水沖泡咖啡");
    }

    @Override
    protected void addCondiments() {
        System.out.println("加糖和牛奶");
    }
    
    @Override
    public boolean customerWantsCondiments() {
        String answer = getUserInput();
        
        if("yes".equals(answer))
            return true;
        else
            return false;
    }
    
    private String getUserInput() {
        String answer = null;
        System.out.println("請問需要糖和牛奶嗎?(yes/no)");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            answer = br.readLine();
        } catch(IOException e) {
            e.printStackTrace();
        }
        if(answer == null)
            return "no";
        return answer;
    }
    
}
