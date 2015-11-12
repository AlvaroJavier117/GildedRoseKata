package gildedrose;

public class ReducirCalidad {
	
	//esta clase reduce la calidad 
	
	public void ReducirUnoCalidad(Item item){
		item.setQuality(item.getQuality() - 1);
	}

}
