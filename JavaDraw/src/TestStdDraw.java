public class TestStdDraw{
  public static void main(String[] args){
    int n1=100;
    StdDraw.setCanvasSize(500,500);
    StdDraw.setXscale(0,n1);
    StdDraw.setYscale(0,n1*n1);
    StdDraw.setPenRadius(0.01);
    for (int i=1; i<n1; i++){
    	StdDraw.setPenColor(255,   0,   0); 
        StdDraw.line(i,50*i, i+1, 50*(i+1));
        StdDraw.setPenColor(  0,   0, 255); 
        StdDraw.line(i,100*i, i+1, 100*(i+1));
    	

    }

    
    
  }
  
}
