package hand.Exam_12808_20161229_1.common.event;

import org.springframework.context.ApplicationEvent;

public class AfterInsertFilmEvent extends ApplicationEvent{

	public AfterInsertFilmEvent(Object source) {
		super(source);
	}

}
