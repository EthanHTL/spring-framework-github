package cn.htl.spring.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @author h.t.l
 * @since 2023/3/23 17:37
 */
public class BeanCondition implements Condition {

	@Override
	public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
		// ConditionContext容器上下文，当前Class上下文
		System.out.println("--- BeanCondition ---");
		return false;
	}

}
