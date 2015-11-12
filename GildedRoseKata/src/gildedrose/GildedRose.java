package gildedrose;

import java.util.List;

public class GildedRose {

	AumentarCalidad aumentar = new AumentarCalidad();
	ReducirCalidad reducir = new ReducirCalidad();
	
	Backstage backstage = new Backstage(null, 0, 0);
	AgedBrie agedbrie = new AgedBrie(null, 0, 0);
	Sulfuras sulfuras = new Sulfuras(null, 0, 0);
	Conjured conjured = new Conjured(null, 0, 0);
	Normal normal = new Normal(null, 0 , 0);
		
public void updateQuality(List<Item> items) {		
		for (Item item : items) {
			
//////////////////////////////--------------------------------------/////////////////////////////////
			if (!item.getName().equals(agedbrie.getName()) && !item.getName().equals(backstage.getName())) {
				 if(!item.getName().equals(sulfuras.getName())){
				if (item.getQuality() > 0) {					
					reducir.ReducirUnoCalidad(item);					
					}
				}
				 
				 ////////////////////INICIO NUEVO////////////////////////
				//se reducio a conjured mana cake aqui para reducir en 2 su Calidad
				if(item.getName().equals(conjured.getName())){
					if (item.getQuality() > 0){
						reducir.ReducirUnoCalidad(item);
					}
 				}
				/////////////////////FIN NUEVO//////////////////////////
				/* esto quedo fuera
				   if (!item.getName().equals("Sulfuras, Hand of Ragnaros")) {
-						item.setQuality(item.getQuality() - 1);
-					}
				 */
 			} 
//////////////////////////////--------------------------------------/////////////////////////////////
			else {
 				if (item.getQuality() < 50) {
 					aumentar.AumentarUnoCalidad(item);
 						if (item.getName().equals(backstage.getName())) {
 							if (item.getSellIn() < 11){
 								if(item.getQuality() < 50) {
 									aumentar.AumentarUnoCalidad(item);				
 							}
 						}
 							if (item.getSellIn() < 6){
 								if(item.getQuality() < 50) {
 									aumentar.AumentarUnoCalidad(item);
 							}
						}
 					}
 				}
 			}
//////////////////////////////--------------------------------------/////////////////////////////////
			if (item.getName() != sulfuras.getName()) {
 				item.setSellIn(item.getSellIn() - 1);
 			}
			if (item.getSellIn() < 0) {
 				if (item.getName() != agedbrie.getName()) {
 					if (item.getName() != backstage.getName()) {
 						
 						/*  //esto queda fuera
 							   if (item.getQuality() > 0) {
									if (item.getName() != "Sulfuras, Hand of Ragnaros") {
										operacion.ReducirUnoCalidad(item);
							}
 							   }
 							*/ 
										
 						//////////////////////INICIO NUEVO///////////////////////
 						//esto soluciona los dos ultimos test donde se ha reducio en 4 la calidad de 
 						// conjured
						 	
						 	 if(item.getQuality() > 0){
						 	 
								if(item.getQuality() != 80){
									reducir.ReducirUnoCalidad(item);
								}
								if(item.getName().equals(conjured.getName())){
									if(item.getQuality() > 0){
											reducir.ReducirUnoCalidad(item);
										}
									}
								}
							
						/////////////////////FIN NUEVO//////////////////////////
 						
 						} else {
 						item.setQuality(item.getQuality() - item.getQuality());
 					}
 				} else {
 					if (item.getQuality() < 50) {
 						aumentar.AumentarUnoCalidad(item);
 					}
 				}
	}				
		}		
}
}