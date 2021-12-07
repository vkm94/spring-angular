package com.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="hotelmenu")
@Table(name="hotelmenu")
public class HotelMenu {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	String id;
	String pid;
	String hid;
	String price;
	String status;
	String hname;
	String img;
	String mname;
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getHname() {
		return hname;
	}
	public void setHname(String hname) {
		this.hname = hname;
	}
	String pname;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPid() {
		return pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}
	public String getHid() {
		return hid;
	}
	public void setHid(String hid) {
		this.hid = hid;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	
	
	public HotelMenu() {
		super();
		// TODO Auto-generated constructor stub
	}
	public HotelMenu(String id, String pid, String hid, String price, String status,String hname, String pname,String img,String mname) {
		super();
		this.id = id;
		this.pid = pid;
		this.hid = hid;
		this.price = price;
		this.status = status;
		this.hname = hname;
		this.pname = pname;
		this.img=img;
		this.mname=mname;
	}
	@Override
	public String toString() {
		return "HotelMenu [id=" + id + ", pid=" + pid + ", hid=" + hid + ", price=" + price + ", status=" + status
				+ ", hname=" + hname + ", pname=" + pname + ",img="+img+",mname="+mname+"]";
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
}
