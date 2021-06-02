package Store;

import java.util.ArrayList;

import cont.JOP;

public class MasterOrder {
	private ArrayList<Order> orders;
	
	public MasterOrder() {
		orders = new ArrayList<Order>();
		
	}
	
	public void addOrder(Order o) {
		orders.add(o);
	}
	
	public void printOrders() {
		String orderStr = "";
		for(Order o : orders) {
			orderStr += o;
		}
		JOP.msg(orderStr);
	}
	
	public void printOrders(String buyer) {
		String orderStr = "";
		for(Order o : orders) {
			if(o.getBuyer().equals(buyer)) {
				orderStr += o;
			}
		}
		JOP.msg(orderStr);
	}
	
	public void clearProduct(String product) {
		for(int i = 0; i < orders.size(); i++) {
			if(orders.get(i).getProduct().equals(product)) {
				orders.remove(i);
				i--;
			}
		}
	}
	
	public void clearBuyer(String buyer) {
		for(int i = 0; i < orders.size(); i++) {
			if(orders.get(i).getBuyer().equals(buyer)) {
				orders.remove(i);
				i--;
			}
		}
	}
	
	public void remove(String product, String buyer) {
		for(int i = 0; i < orders.size(); i++) {
			if(orders.get(i).getBuyer().equals(buyer) && orders.get(i).getProduct().equals(product)) {
				orders.remove(i);
			}
		}
	}
	
}