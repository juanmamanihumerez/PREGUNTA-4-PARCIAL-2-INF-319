object Primos {
  def main(args: Array[String]): Unit = {
  var n = 5 
  var c = 2
  var i = 1   
    	while (i <= n) { 
    		if (c==2 ||c== 3) {
    			println(c) 
    			i=i+1
    		}	
    		else  if(ss(c)){ 
    			println(c) 
    			i=i+1
    		      }
    		      
    	c=c+1
    	}
    def ss(i:Int):Boolean = {
    	for (j <- 2 until i) {
    		if ((i%j)==0) 
    		return false 
    		}; 
    		return true
    }
  }
}
