public class Endlessarray {
    private Object a[];
    private boolean full = false;
        
     
    public void remove (int i) {
        if ((i >= 0) && (i < a.length)){
            a[i] = null;
        }
    }
    
    
    public Object getEndlessarray (int i){
        return a[i];
    }
    
    
    public void add (Object c) {
        if (full) {  
            Object b[] =  new Object [a.length + 1];
            for(int i = 0; i < a.length; i++){
                b[i] = a[i];
            }
            b[a.length] = c;
            a = b;
        }
        else {
            a = new Object[1];
            a[0] = c;
            full = true;
        }
    }    
}