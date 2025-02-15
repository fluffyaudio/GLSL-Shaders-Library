package GLSLShaders.library;
import processing.core.*;

public class Param {
	String name;
	  float value;
	  PVector value2;
	  float minValue, maxValue;
	  PVector minValue2, maxValue2;
	  boolean is2d;
	  boolean isInt;
	  
	 PApplet parent; 
	 public Param(String name, float minValue, float maxValue, boolean isInt) {
		    
		    this.name = name;
		    this.isInt = isInt;
		    this.minValue = minValue;
		    this.maxValue = maxValue;
		    this.value = (float) (0.5 * (minValue + maxValue));
		    is2d = false;    
		  }
		  
	public	Param(String name, float minValue1, float maxValue1, float minValue2, float maxValue2, boolean isInt) {
		    
		    this.name = name;
		    this.isInt = isInt;
		    this.minValue2 = new PVector(minValue1, minValue2);
		    this.maxValue2 = new PVector(maxValue1, maxValue2);
		    this.value2 = new PVector((float) 0.5 * (this.minValue2.x + this.maxValue2.x), 
		                             (float) 0.5 * (this.minValue2.y + this.maxValue2.y) );
		    is2d = true;
		  }
		  
	public	  void set(float value) {
		    this.value = value;
		  }
		  
	public	  void set(float[] value) {
		    this.value2.set(value[0], value[1]);
		  }


}
