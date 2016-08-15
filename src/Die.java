/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author karas_000
 */
public class Die{
        
        public int dvariable;
        private int uniquedie;
     
    public Die(){    
    }

        
    public int Die(int uniquedie) {
       //this.dvariable = dvariable;
       dvariable = (int) ((Math.random()*uniquedie) + 1); 
       return dvariable;
    }
    
    public int getDie(){
        return dvariable;
    }
               
    }
