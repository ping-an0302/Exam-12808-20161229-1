package hand.Exam_12808_20161229_1.common.listener;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStartedEvent;



public class StartEventHandler implements ApplicationListener< ContextStartedEvent>{

	@Override
	public void onApplicationEvent(ContextStartedEvent event) {
		System.out.println("Context Start");
	}

}
