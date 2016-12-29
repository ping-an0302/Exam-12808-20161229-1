package hand.Exam_12808_20161229_1.common.listener;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStoppedEvent;



public class StopEventHandler implements ApplicationListener< ContextStoppedEvent>{

	@Override
	public void onApplicationEvent(ContextStoppedEvent event) {
		System.out.println("Context Stop");		
	}

}
