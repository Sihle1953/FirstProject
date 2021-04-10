package carDealership;

public class Car {
	
public class Make extends CarDealership{
		
	}
public class Model extends CarDealership{
		
	}
public class ModelDetails extends CarDealership{
	
}
	
	String Make="BMW, origin Germany";
    String Model="E46 320i, 2008";
    String ModelDetails="Right, 2, white";
    
	public void setMake(String make) {
		Make = make;
	}
	public void setModel(String model) {
		Model = model;
	}
	public void setModelDetails(String modelDetails) {
		ModelDetails = modelDetails;
	}
	public String getModel() {
		return Model;
	}

}
	
