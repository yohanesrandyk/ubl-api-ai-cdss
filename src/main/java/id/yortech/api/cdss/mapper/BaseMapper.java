package id.yortech.api.cdss.mapper;

import java.lang.reflect.Field;

public class BaseMapper {
	protected void map(Object source, Object destination) {
		Field[] sourceFields = source.getClass().getDeclaredFields();

		for (Field sourceField : sourceFields) {
			try {
				sourceField.setAccessible(true);
				Object value = sourceField.get(source);

				if (value != null) {
					Field destField = destination.getClass().getDeclaredField(sourceField.getName());
					destField.setAccessible(true);

					if (destField.getType().isAssignableFrom(sourceField.getType())) {
						destField.set(destination, value);
					}
				}
			} catch (NoSuchFieldException e) {
			} catch (IllegalAccessException e) {
			}
		}
	}
}
