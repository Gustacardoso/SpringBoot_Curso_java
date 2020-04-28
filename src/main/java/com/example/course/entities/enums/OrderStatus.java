package com.example.course.entities.enums;

public enum OrderStatus {
	
	WAITING_PAYMENT(1),
	PAID(2),
	SHIPPED(3),
	DELIVERED(4),
	CANCELED(5);
	
	private int code; // precisamos dessse code para futuras manutenção
	
	//vamos criar o  contructors
	private OrderStatus(int code) {
		this.code = code;
	}
	
	//temos que criar tambem  o get, para ser usado no mundo  exterior
	
	public int getCode() {
		return code;
	}
	//para verificar se o code é valido
	public static OrderStatus valueOf(int code) {
		//fazer um for para pecorrer toda o order status
		for(OrderStatus value : OrderStatus.values()) {
			if(value.getCode() == code) {
				return value;
			}
		}
		throw new IllegalArgumentException("Invalid OrderStatus code");
	}
}
