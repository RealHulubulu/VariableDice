/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author karas_000
 */
public class DiceRoller {
    
    private int faces;
    private int Roll;
    
    private DiceRoller(){
        
    }
    
    public DiceRoller(int faces){
        Roll = (int) ((Math.random()*faces) + 1);
        
    }
    
    public int getRoll(){
        return Roll;
}
}
