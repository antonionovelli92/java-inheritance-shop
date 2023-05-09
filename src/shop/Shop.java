package shop;

public class Shop {
public static void main(String[] args) {
	 Smartphone ip = new Smartphone(1, "iPhone 12", "Apple", 999, 22, 1234567890, 128);
     Televisore sm = new Televisore(2, "Samsung Smart TV", "Samsung", 799, 22, 55.0, true);
     Cuffie air = new Cuffie(3, "AirPods Pro", "Apple", 249, 22, "Bianco", true);
     
     System.out.println(ip);
     
     System.out.println("------------------------------------\n");     
     System.out.println(sm);     
     System.out.println("------------------------------------\n");     
     System.out.println(air);
     System.out.println("------------------------------------\n");
     
     
     
//     for (int x=0;x<pArr.length;x++) {
//			
//			Persona p = pArr[x];
//			System.out.println(p.toString());
//			
//			System.out.println("\n------------------------------------\n");
//			if (p instanceof Employee) {
//				
//				Employee e = (Employee) p;
//				System.out.println(e.getStipendio());
//			} else if (p instanceof Boss) {
//				
//				Boss b = (Boss) p;
//				System.out.println(b.getDividendo());
//			}
//		}
//     

}
}
