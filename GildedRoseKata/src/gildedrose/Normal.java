package gildedrose;

public class Normal extends Item{
	
	AumentarCalidad aumentar = new AumentarCalidad();
	ReducirCalidad reducir = new ReducirCalidad();		
	public Normal(String name, int quality, int sellIn) {
		super("Normal", quality, sellIn);
		// TODO Auto-generated constructor stub
	}
	
	public void Evaluacion(Item item){
		
			if (item.getQuality() < 50) {
					aumentar.AumentarUnoCalidad(item);
	}

}

}