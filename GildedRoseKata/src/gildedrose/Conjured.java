package gildedrose;

public class Conjured extends Item{
	
	AumentarCalidad aumentar = new AumentarCalidad();
	ReducirCalidad reducir = new ReducirCalidad();
	
	public Conjured(String name, int quality, int sellIn) {
		super("Conjured Mana Cake", quality, sellIn);
		// TODO Auto-generated constructor stub
	}
			
	public void Evaluacion(Item item){
		
			if (item.getQuality() > 0) {					
				reducir.ReducirUnoCalidad(item);
				}
		
		}
} 

