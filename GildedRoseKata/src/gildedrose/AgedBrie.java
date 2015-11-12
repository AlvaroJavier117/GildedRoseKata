package gildedrose;

public class AgedBrie extends Item{
	
	AumentarCalidad aumentar = new AumentarCalidad();
	ReducirCalidad reducir = new ReducirCalidad();

	public AgedBrie(String name, int quality, int sellIn) {
		super("Aged Brie", quality, sellIn);
		// TODO Auto-generated constructor stub
	}
	
	public void Evaluacion(Item item){
		
		if (item.getQuality() < 50) {
				aumentar.AumentarUnoCalidad(item);
			}
	
	}
}
