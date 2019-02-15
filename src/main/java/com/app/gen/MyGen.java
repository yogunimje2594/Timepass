package com.app.gen;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SessionImplementor;
import org.hibernate.id.IdentifierGenerator;

public class MyGen implements IdentifierGenerator{

	@Override
	public Serializable generate(SessionImplementor session, Object object) throws HibernateException {
		String date=new SimpleDateFormat("dd-mm-yyyy").format(new Date());
		int num=new Random().nextInt(1000);
		String prefix="ST";
		String suffix="HIB";
		return prefix+date+suffix+"-"+num;
	}

}
