public class JudgeCircle{


public boolean judgeCircle(String moves) {
        
        int xplane = 0;
        int yplane = 0;
        
        
        for (int i = 0; i < moves.length(); i++){
            
            char c = moves.charAt(i);
            
            
            if (c == 'U'){
                
                yplane ++;
                
            }
             if (c == 'D'){
                
                yplane --;
                
            }
             if (c == 'L'){
                
                xplane --;
                
            }
             if (c == 'R'){
                
                xplane ++;
                
            }
            
        }
        
        if(xplane == 0 && yplane == 0){
            
            return true;
            
        }
        else{
            
            return false;
        }
        
    }

}