package python;
    

public class math extends org.python.types.Module {
     @org.python.Method(
            __doc__ = "sqrt(number) -> floating point number\n" +
	    "\n",
	    default_args = {"number"}
                    
    )
    public static org.python.types.Float sqrt(org.python.types.Object number) {
	 
	 Double numberd = new Double(number.toString());
	 if(numberd < 0 ) throw new org.python.exceptions.AssertionError("math domain error");
	 return new org.python.types.Float(java.lang.Math.sqrt(numberd));
     }
}















































//if(java.lang.Math.exp(number) == 1) return org.python.types.NoneType.NONE;
	

	
	//double x = java.lang.Math.exp(self);
	//throw new org.python.exceptions.NotImplementedError("exp has not been implemented");
	//return new org.python.types.Int(exp());
