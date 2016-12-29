package hand.Exam_12808_20161229_1.common.event;

import org.springframework.context.ApplicationEvent;

public class BeforeInsertFilmEvent extends ApplicationEvent{

	public BeforeInsertFilmEvent(Object source) {
		super(source);
	}

}
