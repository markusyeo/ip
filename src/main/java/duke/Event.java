package duke;

import java.time.LocalDateTime;

/**
 * Represents an Event entered by the user.
 */
public class Event extends Task {

    private final LocalDateTime fromTime;
    private final LocalDateTime toTime;

     /**
     * Constructor for the Event.
     *
     * @param taskDescription Description of the Event.
     * @param fromTime The Time and Date the deadline is from.
     * @param toTime The Time and Date the deadline is to.
     */
    public Event(String taskDescription, LocalDateTime fromTime, LocalDateTime toTime) {
        this.taskDescription = taskDescription;
        this.fromTime = fromTime;
        this.toTime = toTime;
    }

    @Override
    public String toString() {
        return String.format("[D]%s from: %s to: %s", super.toString(),
                fromTime.format(formatter), toTime.format(formatter));
    }
}
