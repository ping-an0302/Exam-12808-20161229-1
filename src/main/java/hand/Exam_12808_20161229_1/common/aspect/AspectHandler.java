package hand.Exam_12808_20161229_1.common.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

import hand.Exam_12808_20161229_1.common.publisher.AfterEventPublisher;
import hand.Exam_12808_20161229_1.common.publisher.BeforeEventPublisher;

public class AspectHandler {
	
	//注入发布事件对象
	private BeforeEventPublisher beforepublisher;
	private AfterEventPublisher afterpublisher;
	
	//环绕通知
	public Object aroundTest(ProceedingJoinPoint pjp)throws Throwable{
		
		//方法前触发 BeforeInsertFilmEvent事件
		beforepublisher.publish();

		//调用到连接点方法
		Object obj = pjp.proceed();
		
		//方法后触发 AfterInsertFilmEvent事件
		afterpublisher.publish();
		
		return obj;
	}
	
	
	//get/set
	public BeforeEventPublisher getBeforepublisher() {
		return beforepublisher;
	}
	public void setBeforepublisher(BeforeEventPublisher beforepublisher) {
		this.beforepublisher = beforepublisher;
	}
	public AfterEventPublisher getAfterpublisher() {
		return afterpublisher;
	}
	public void setAfterpublisher(AfterEventPublisher afterpublisher) {
		this.afterpublisher = afterpublisher;
	}
}
