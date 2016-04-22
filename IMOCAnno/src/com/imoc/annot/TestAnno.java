package com.imoc.annot;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestAnno {
	public static void main(String[] args) {
		Filter ter = new Filter();
		ter.setId(10);
		ter.setUserName("sb");
		System.out.println(query(ter));
	}

	public static String query(Filter filter) {
		StringBuffer buffer = new StringBuffer();
		Class<? extends Filter> class1 = filter.getClass();
		Table table = class1.getAnnotation(Table.class);
		if (null != table) {
			String value = table.value();
			buffer.append("select * from ").append(value).append(" where 1=1 ");
		}
		Field[] fields = class1.getDeclaredFields();
		if (null != fields) {
			for (Field field : fields) {
				try {
					Method method = class1.getMethod("get" + field.getName().substring(0, 1).toUpperCase() + field.getName().substring(1));
					Object object = method.invoke(filter);
					Column column = field.getAnnotation(Column.class);
					if (object instanceof String && null != object) {
						buffer.append("and ").append(column.value().toLowerCase()).append(" like '%").append(object).append("%' ");
					} else if (object instanceof Integer && 0 != (Integer) object) {
						buffer.append("and ").append(column.value().toLowerCase()).append(" = ").append(object).append(" ");
					}
				} catch (NoSuchMethodException e) {
					e.printStackTrace();
				} catch (SecurityException e) {
					e.printStackTrace();
				} catch (IllegalAccessException e) {
					e.printStackTrace();
				} catch (IllegalArgumentException e) {
					e.printStackTrace();
				} catch (InvocationTargetException e) {
					e.printStackTrace();
				}
				System.out.println(field.getName());
			}
		}
		return buffer.toString();
	}
}
