
public class orderContainer {
	    /**
	     * 
	     */
	String order;
	String Size; 
	String Bread;
	String Flavour;
	String Sauces1,Sauces2,sauces3,sauces4 =" .";
	String Veggi1,Veggi2, Veggi3, Veggi4= " .";
	String Drink;
	int Cookie1, Cookie2, Cookie3 =0;
	private int activePane;
	
	
	public int getActivePane() {
		return activePane;
	}
	public void setActivePane(int activePane) {
		this.activePane = activePane;
	}
	public String getSize() {
		return Size;
	}
	public void setSize(String size) {
		Size = size;
	}
	public String getBread() {
		return Bread;
	}
	public void setBread(String bread) {
		Bread = bread;
	}
		
	public String getFlavour() {
		return Flavour;
	}
	public void setFlavour(String flavour) {
		Flavour = flavour;
	}
		
	public String getSauces1() {
		return Sauces1;
	}
	public void setSauces1(String sauces1) {
		Sauces1 = sauces1;
	}
	public String getSauces2() {
		return Sauces2;
	}
	public void setSauces2(String sauces2) {
		Sauces2 = sauces2;
	}
	public String getSauces3() {
		return sauces3;
	}
	public void setSauces3(String sauces3) {
		this.sauces3 = sauces3;
	}
	public String getSauces4() {
		return sauces4;
	}
	public void setSauces4(String sauces4) {
		this.sauces4 = sauces4;
	}

	public String getVeggi1() {
		return Veggi1;
	}
	public void setVeggi1(String veggi1) {
		Veggi1 = veggi1;
	}
	public String getVeggi2() {
		return Veggi2;
	}
	public void setVeggi2(String veggi2) {
		Veggi2 = veggi2;
	}
	public String getVeggi3() {
		return Veggi3;
	}
	public void setVeggi3(String veggi3) {
		Veggi3 = veggi3;
	}
	public String getVeggi4() {
		return Veggi4;
	}
	public void setVeggi4(String veggi4) {
		Veggi4 = veggi4;
	}
	
	public String getDrink() {
		return Drink;
	}
	public void setDrink(String drink) {
		Drink = drink;
	}
	public int getCookie1() {
		return Cookie1;
	}
	public void setCookie1(int cookie1) {
		Cookie1 = cookie1;
	}
	public int getCookie2() {
		return Cookie2;
	}
	public void setCookie2(int cookie2) {
		Cookie2 = cookie2;
	}
	public int getCookie3() {
		return Cookie3;
	}
	public void setCookie3(int cookie3) {
		Cookie3 = cookie3;
	}
	public String order()
	{
		//String pane= String.valueOf(getActivePane());
		String output = getSize()+"\n"+getBread()+"\n"+getFlavour()+"\n"+getSauces1()+" "+getSauces2()+" "+getSauces3()+""+getSauces4()
		+"\n"+getVeggi1()+" "+getVeggi2()+" "+getVeggi3()+" "+getVeggi4()+"\n"+getDrink()+"\n Choclate:"+getCookie1()+" Raspberry:"+getCookie2()+" Mecdemia:"+getCookie3();
		return output;
	}
	public String getOrder() {
		
		order= "Size:"+getSize()+","+getBread()+","+getFlavour()+","+getSauces1()+","+getSauces2()+","+getSauces3()+","+getSauces4()
		+","+getVeggi1()+","+getVeggi2()+getVeggi3()+getVeggi4()+getDrink()+"Choclate:"+getCookie1()+" Raspberry:"+getCookie2()+" Mecdemia:"+getCookie3();
		
		 return order;
	}
	public void setOrder(String order) {
		this.order = order;
	}
	
	
	
		}
