package gildedrose;

import java.util.List;

public class GildedRose {

	AumentarCalidad aumentar = new AumentarCalidad();
	ReducirCalidad reducir = new ReducirCalidad();
	ReducirSellin reducirsell = new ReducirSellin();
	
	Backstage backstage = new Backstage(null, 0, 0);
	AgedBrie agedbrie = new AgedBrie(null, 0, 0);
	Sulfuras sulfuras = new Sulfuras(null, 0, 0);
	Conjured conjured = new Conjured(null, 0, 0);
	Normal normal = new Normal(null, 0 , 0);
		
public void updateQuality(List<Item> items) {		
		for (Item item : items) {
			
			if (item.getName().equals(conjured.getName()) || item.getName().equals(normal.getName())) { 
					 conjured.Evaluacion(item);
			
			if(item.getName().equals(conjured.getName())){
					conjured.Evaluacion(item);
				}				
			} else {
				if (item.getQuality() < 50) {  
					aumentar.AumentarUnoCalidad(item);  
					 	if (item.getName().equals(backstage.getName())) {  
					 		backstage.Evaluacion(item);  					 				
					  			}  
					  		}  
					  	}  

			if (item.getName() != sulfuras.getName()) {
 				reducirsell.ReducirUnoSellin(item);
 			}
			if (item.getSellIn() < 0) {
 				if (item.getName() != agedbrie.getName()) {
 					if (item.getName() != backstage.getName()) {			
						 	 if(item.getQuality() > 0){
						 	 	 normal.Evaluacion(item);
							
						 	 if(item.getName().equals(conjured.getName())){
							     conjured.Evaluacion(item);
									}
								}

 						} else {
 						item.setQuality(item.getQuality() - item.getQuality());
 					}
 				} else {
 					agedbrie.Evaluacion(item);
 				}
	}				
		}		
}
}