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
		Province sd = new Province(37,"ɽ��");
		Province hb = new Province(42,"����");
		Province hn = new Province(41,"����");
		
		sd.getCitys().add(new City(01,"����"));
		sd.getCitys().add(new City(02,"�ൺ"));
		sd.getCitys().add(new City(03,"�Ͳ�"));
		
		hb.getCitys().add(new City(01,"�人"));
		hb.getCitys().add(new City(02,"�Ƹ�"));
		hb.getCitys().add(new City(03,"����"));
		
		hn.getCitys().add(new City(01,"֣��"));
		hn.getCitys().add(new City(02,"����"));
		hn.getCitys().add(new City(03,"����"));
		
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
