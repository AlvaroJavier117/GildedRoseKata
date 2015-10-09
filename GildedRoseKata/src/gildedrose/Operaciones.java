package gildedrose;

public class Operaciones {
	
	//esta clase reduce la duplicidad de codigo en el MainActivity
	
	public void ReducirUno(Item item){
		item.setQuality(item.getQuality() - 1);
	}
	
	public void AumentarUno(Item item){
		item.setQuality(item.getQuality() + 1);
	}
	
}
