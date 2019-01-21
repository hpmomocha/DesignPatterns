package com.hpe.kevin.mediator;

public class Mediator extends AbstractMediator {

	@Override
	public void execute(String str, Object... objects) {
		// 中介者最重要的方法
		if(str.equals("purchase.buy")){ //采购电脑
			this.buyIBMComputer((Integer)objects[0]); 
		} else if(str.equals("sale.sell")){ //销售电脑
			this.sellIBMComputer((Integer)objects[0]);
		} else if (str.equals("sale.offsell")) { // 折价销售
			this.offSale();
		} else if(str.equals("stock.clear")){ //清仓处理
			this.clearStock();
		}
	}

	// 采购IBM电脑
	private void buyIBMComputer(int number) {
		// 电脑的销售情况
		int saleStatus = super.sale.getSaleStatus();
		if (saleStatus>80) { //销售情况良好
			System.out.println("采购IBM电脑:"+number + "台");
			super.stock.increase(number);
		} else { // 销售情况不好
			int buyNumber = number/2; //折半采购
			System.out.println("采购IBM电脑："+buyNumber+ "台");
			super.stock.increase(buyNumber);
		}
	}
	
	private void sellIBMComputer(int number){
		if (super.stock.getStockNumber() < number) { // 库存数量不够销售
			super.purchase.buyIBMComputer(number);
		}
		stock.decrease(number);
	}
	
	// 折价处理
	private void offSale(){
		// 库房有多少卖多少
		System.out.println("折价销售IBM电脑"+super.stock.getStockNumber()+"台");
	}
	
	// 存货压力大了，就要通知采购人员不要采购，销售人员要尽快销售
	private void clearStock(){
		// 要求折价销售
		super.sale.offSale();
		// 要求采购人员不要采购
		super.purchase.refuseBuyIBM();
	}
}
