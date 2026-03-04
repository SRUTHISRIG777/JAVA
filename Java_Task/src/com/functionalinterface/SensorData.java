package com.functionalinterface;

import java.util.function.Function;




public class SensorData {
	private double temperature;
	private double humidity;
	public SensorData(double temperature, double humidity) {
		
		this.temperature = temperature;
		this.humidity = humidity;
	}
	public double getTemperature() {
		return temperature;
	}
	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}
	public double getHumidity() {
		return humidity;
	}
	public void setHumidity(double humidity) {
		this.humidity = humidity;
	}


	public static void main(String[] args) {
		
		SensorData obj=new SensorData(50,37);
		double th=25.0;
//		Function<SensorData,Double> fun=new Function<SensorData,Double>(){
//			public Double apply(SensorData s) {
//				return s.getTemperature();
//			}
//			
//		};
		Function<SensorData,Double>fun=s->s.getTemperature();
	 System.out.println(fun.apply(obj));

		Function<Double,Boolean> fun1=new Function<Double,Boolean>(){
			public Boolean apply(Double temp) {
				return temp>th;
			}
			
		};
		System.out.println(fun1.apply(obj.getTemperature()));
	 
		
	}

}
