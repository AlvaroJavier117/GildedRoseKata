package gildedrose;

public class Backstage extends Item{
	
	AumentarCalidad aumentar = new AumentarCalidad();

	public Backstage(String name, int quality, int sellIn) {
		super("Backstage passes to a TAFKAL80ETC concert", quality, sellIn);
		// TODO Auto-generated constructor stub
	}

	public void Evaluacion(Item item){
				
		if (item.getSellIn() < 11){  
			aumentar.AumentarUnoCalidad(item);				  
			}if (item.getSellIn() < 6){  
					if(item.getQuality() < 50) {  
							aumentar.AumentarUnoCalidad(item);  
						}  
				}
		}
	}
