package com.hpe.kevin.mediator.generic;

public abstract class Colleague {
	protected Mediator mediator;

	public Colleague(Mediator _mediator) {
		this.mediator = _mediator;
	}
}
