package com.itheima.test;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.itheima.domain.City;
import com.itheima.domain.Province;
import com.thoughtworks.xstream.XStream;

public class XStreamDemo1 {
	@Test
	public void test1(){
		List<Province> provinces = new ArrayList<Province>();
		Province sd = new Province(37,"山东");
		Province hb = new Province(42,"湖北");
		Province hn = new Province(41,"河南");
		
		sd.getCitys().add(new City(01,"济南"));
		sd.getCitys().add(new City(02,"青岛"));
		sd.getCitys().add(new City(03,"淄博"));
		
		hb.getCitys().add(new City(01,"武汉"));
		hb.getCitys().add(new City(02,"黄冈"));
		hb.getCitys().add(new City(03,"襄阳"));
		
		hn.getCitys().add(new City(01,"郑州"));
		hn.getCitys().add(new City(02,"开封"));
		hn.getCitys().add(new City(03,"洛阳"));
		
		provinces.add(sd);
		provinces.add(hb);
		provinces.add(hn);
		
		XStream xs = new XStream();
		xs.autodetectAnnotations(true);
		xs.alias("provinces", List.class);
		String xml = xs.toXML(provinces);
		System.out.println(xml);
	}
}
