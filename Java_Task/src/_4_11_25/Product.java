package _4_11_25;

public class Product {
	String productName;
	int productId;
	double productPrice;
	public void addProductDetails(String name,int id,double price) {
		productName=name;
		productId=id;
		productPrice=price;
	}
	public String displayDetails() {
		return "product name:"+productName+" ,"+"product id:"+productId+","+"product price: "+productPrice;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product obj=new Product();
		obj.addProductDetails("dot & key", 3, 455);
		String res=obj.displayDetails();
		System.out.println(res);

	}

}
