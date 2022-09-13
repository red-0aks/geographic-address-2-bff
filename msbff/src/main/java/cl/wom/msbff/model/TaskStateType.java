package cl.wom.msbff.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Class TaskStateType.
 *
 * @author nttdata
 */
public enum TaskStateType {

    @JsonProperty("accepted")
    ACCEPTED("accepted"),
    @JsonProperty("terminatedWithError")
    TERMINATEDWITHERROR("terminatedWithError"),
    @JsonProperty("inProgress")
    INPROGRESS("inProgress"),
    @JsonProperty("done")
    DONE("done");

	/** The state. */
	private String state;

	/**
	 * Instantiates a new task state type.
	 *
	 * @param state the state
	 */
	private TaskStateType(String state) {
		this.state = state;
	}

	/**
	 * Gets the state.
	 *
	 * @return the state
	 */
	public String getState() {
		return state;
	}

}