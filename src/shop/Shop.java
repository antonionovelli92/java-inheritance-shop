package shop;

public class Shop {
public static void main(String[] args) {
	 Smartphone ip = new Smartphone(1, "iPhone 12", "Apple", 999, 22, 1234567890, 128);
     Televisore sm = new Televisore(2, "Samsung Smart TV", "Samsung", 799, 22, 55.0, true);
     Cuffie air = new Cuffie(3, "AirPods Pro", "Apple", 249, 22, "Bianco", true);
     
     System.out.println("------------------------------------\n");
     
     System.out.println(ip);     
     System.out.println("------------------------------------\n");     
     System.out.println(sm);     
     System.out.println("------------------------------------\n");     
     System.out.println(air);
     System.out.println("------------------------------------\n");
     
//     Creo un arrey con i miei prodotti dello shop
     
     Prodotto[] prodArr = {ip, sm, air};
     
     for (int x=0;x<prodArr.length;x++) {
			
			Prodotto p = prodArr[x];
			System.out.println(p.toString());
			
			System.out.println("\n------------------------------------\n");
			if (p instanceof Smartphone) {
				
				Smartphone s = (Smartphone) p;
				System.out.println(s.getPrezzoBase());
				System.out.println(s.getPrezzoConIva());
				System.out.println("\n------------------------------------\n");
			} else if (p instanceof Televisore) {
				Televisore t = (Televisore) p;
				System.out.println(t.getPrezzoBase());
				System.out.println(t.getPrezzoConIva());
				System.out.println("\n------------------------------------\n");
			}else if (p instanceof Cuffie) {
				
				Cuffie c = (Cuffie) p;
				System.out.println(c.getPrezzoBase());
				System.out.println(c.getPrezzoConIva());
				System.out.println("\n------------------------------------\n");
			}
		}
     

}
}
