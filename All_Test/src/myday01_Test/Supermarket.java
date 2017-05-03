package myday01_Test;
/*	�ڿ���̨��ӡ���µ���Ϣ:
	-----------------------���ǲ��ͳ���--------------------------
	��Ʒ���	��Ʒ����	��������	��Ʒ����	��������
	1			����		����		3.0			6		
	2			�����		��ʦ��		2.5     	5
	3			����		�ְ���		4.0         12 
	-------------------------------------------------------------
	���������Ʒ�ܽ��Ϊ: 78.5 Ԫ 

 * 
 */
public class Supermarket {
	private int id;
	private String name;
	private String product;
	private double price;
	private int num;
	
	public Supermarket(int id, String name, String product, double price, int num) {
		super();
		this.id = id;
		this.name = name;
		this.product = product;
		this.price = price;
		this.num = num;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getNum() {
		return num;
	}

	@Override
	public String toString() {
		return "Supermarket [id=" + id + ", name=" + name + ", product=" + product + ", price=" + price + ", num=" + num
				+ "]";
	}

	public void setNum(int num) {
		this.num = num;
	}

	public Supermarket() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + num;
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((product == null) ? 0 : product.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Supermarket other = (Supermarket) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (num != other.num)
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		if (product == null) {
			if (other.product != null)
				return false;
		} else if (!product.equals(other.product))
			return false;
		return true;
	}
	
	
	
}
