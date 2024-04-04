package com.app.geometry;
import java.lang.Math;

public class Point2D {
	private double xaxis;
	private double yaxis;
	
	public Point2D(){}
	
	public Point2D(double xaxis, double yaxis){
		this.xaxis = xaxis;
		this.yaxis = yaxis;
	}
	
	public double getXaxis() {
		return xaxis;
	}

	public void setXaxis(double xaxis) {
		this.xaxis = xaxis;
	}

	public double getYaxis() {
		return yaxis;
	}

	public void setYaxis(double yaxis) {
		this.yaxis = yaxis;
	}
	
	public String getDetails() {
		return "Point : ("+ xaxis + "," + yaxis + ")";
	}
	
	public boolean isEqual() {
		if(xaxis == yaxis) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public double calculateDistance(Point2D p2) {
		double Distance= 0;
		Distance = Math.sqrt(Math.pow(p2.getXaxis() - this.getXaxis(),2) + Math.pow(p2.getYaxis() - this.getYaxis(), 2));
		return Distance;
	}
	
	public boolean isEqual(Point2D p2) {
		return (this.getXaxis() == p2.getXaxis() && this.getYaxis() == p2.getYaxis());
	}

}
