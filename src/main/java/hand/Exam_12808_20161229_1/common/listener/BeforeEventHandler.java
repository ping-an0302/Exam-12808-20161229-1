package hand.Exam_12808_20161229_1.common.listener;

import org.springframework.context.ApplicationListener;

import hand.Exam_12808_20161229_1.common.event.BeforeInsertFilmEvent;

public class BeforeEventHandler implements ApplicationListener<BeforeInsertFilmEvent>{

	@Override
	public void onApplicationEvent(BeforeInsertFilmEvent event) {
		//事件出发后的逻辑代码
		System.out.println("Before Insert Film Data");
	}

}
