package me.kafeitu.activiti.chapter6.form;

import org.activiti.engine.form.AbstractFormType;

/**
 * Javascript表单字段
 *
 * @author henryyan
 */
public class JavascriptFormType extends AbstractFormType {

	/**
	 * 
	 */
	private static final long serialVersionUID = -209366304275125772L;

	@Override
	public String getName() {
		return "javascript";
	}

	@Override
	public Object convertFormValueToModelValue(String propertyValue) {
		return propertyValue;
	}

	@Override
	public String convertModelValueToFormValue(Object modelValue) {
		return (String) modelValue;
	}
}
