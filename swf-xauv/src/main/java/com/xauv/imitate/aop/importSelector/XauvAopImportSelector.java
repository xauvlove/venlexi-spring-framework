package com.xauv.imitate.aop.importSelector;

import com.xauv.imitate.aop.postProcessor.XauvAopBeanPostProcessor;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

public class XauvAopImportSelector implements ImportSelector {
	@Override
	public String[] selectImports(AnnotationMetadata importingClassMetadata) {
		return new String[] {XauvAopBeanPostProcessor.class.getName()};
	}
}
