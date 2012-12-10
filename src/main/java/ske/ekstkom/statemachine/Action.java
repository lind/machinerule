package ske.ekstkom.statemachine;

public abstract class Action {

	private String name;

	// TODO: add support for chaining actions.
	// private Action nextAction;

	public Action() {

	}

	public Action(String name) {
		this.name = name;
	}

	public void execute(final Signal signal, boolean testScope) {
		// Todo: Any preaction needed?
		// Signal preActionSignal = doPreAction(stateMashine, signal);

		doAction(signal, testScope);

		// if (null != nextAction) {
		// nextAction.execute(stateMashine, signal);
		// }
		// doPostAction(stateMashine, signal);
	}

	protected abstract void doAction(final Signal signal, boolean testScope);

	public String getNname() {
		return name;
	}

}
