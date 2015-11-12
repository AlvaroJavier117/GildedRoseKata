package gildedrose;

public class Normal extends Item{
	
	ReducirCalidad reducir = new ReducirCalidad();

	public Normal(String name, int quality, int sellIn) {
		super("NORMAL ITEM", quality, sellIn);
		// TODO Auto-generated constructor stub
	}
	
	public void Evaluacion(Item item){
		
		if(item.getQuality() != 80){
			reducir.ReducirUnoCalidad(item);
		}
}

}