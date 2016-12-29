package hand.Exam_12808_20161229_1.common.listener;

import org.springframework.context.ApplicationListener;

import hand.Exam_12808_20161229_1.common.event.AfterInsertFilmEvent;


public class AfterEventHandler implements ApplicationListener<AfterInsertFilmEvent>{

	@Override
	public void onApplicationEvent(AfterInsertFilmEvent event) {
		//事件出发后的逻辑代码
		System.out.println("After Insert Film Data");
	}

}
