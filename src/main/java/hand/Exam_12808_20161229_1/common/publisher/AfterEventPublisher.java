package hand.Exam_12808_20161229_1.common.publisher;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

import hand.Exam_12808_20161229_1.common.event.AfterInsertFilmEvent;
import hand.Exam_12808_20161229_1.common.event.BeforeInsertFilmEvent;

public class AfterEventPublisher implements ApplicationEventPublisherAware {

	private ApplicationEventPublisher publisher;

	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
		this.publisher = applicationEventPublisher;
	}

	public void publish(){
		AfterInsertFilmEvent afterEvent = new AfterInsertFilmEvent(this);
		publisher.publishEvent(afterEvent);
	}


}
