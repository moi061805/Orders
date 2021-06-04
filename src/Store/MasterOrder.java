package Store;

import java.util.ArrayList;

import cont.JOP;

public class MasterOrder {
	//This class creates a Master order
	private ArrayList<Order> orders;
	
	public MasterOrder() {
		orders = new ArrayList<Order>();
		
	}
	//This method adds an order
	public void addOrder(Order o) {
		orders.add(o);
	}
	//This method prints all the orders
	public void printOrders() {
		String orderStr = "";
		for(Order o : orders) {
			orderStr += o;
		}
		JOP.msg(orderStr);
	}
	//This method prints the order of an specific buyer
	public void printOrders(String buyer) {
		String orderStr = "";
		for(Order o : orders) {
			if(o.getBuyer().equals(buyer)) {
				orderStr += o;
			}
		}
		JOP.msg(orderStr);
	}
	//This method clears a product from the orders
	public void clearProduct(String product) {
		for(int i = 0; i < orders.size(); i++) {
			if(orders.get(i).getProduct().equals(product)) {
				orders.remove(i);
				i--;
			}
		}
	}
	//This method clears a buyer from the orders
	public void clearBuyer(String buyer) {
		for(int i = 0; i < orders.size(); i++) {
			if(orders.get(i).getBuyer().equals(buyer)) {
				orders.remove(i);
				i--;
			}
		}
	}
	//This method removes a product and a buyer from the orders
	public void remove(String product, String buyer) {
		for(int i = 0; i < orders.size(); i++) {
			if(orders.get(i).getBuyer().equals(buyer) && orders.get(i).getProduct().equals(product)) {
				orders.remove(i);
			}
		}
	}
	
}
