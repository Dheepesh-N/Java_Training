import java.util.*;

abstract class Alarm {
    private String time;
    private String label;
    private boolean isActive;

    public Alarm(String time, String label) {
        if (!time.matches("\\d{2}:\\d{2}")) {
            throw new IllegalArgumentException("Invalid time format (HH:MM)");
        }
        this.time = time;
        this.label = label;
        this.isActive = true;
    }

    public String getTime() {
        return time;
    }

    public String getLabel() {
        return label;
    }

    public boolean isActive() {
        return isActive;
    }

    public void deactivate() {
        isActive = false;
    }

    public abstract void ring();
}

class MorningAlarm extends Alarm {

    public MorningAlarm(String time, String label) {
        super(time, label);
    }

    @Override
    public void ring() {
        System.out.println("Wake up! Morning Alarm: " + getLabel());
    }
}

class MeetingAlarm extends Alarm {

    public MeetingAlarm(String time, String label) {
        super(time, label);
    }

    @Override
    public void ring() {
        System.out.println("Meeting Alert: " + getLabel());
    }
}

class User {
    private String name;

    public User(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("User name cannot be empty");
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class AlarmManager {
    private List<Alarm> alarms;
    private User user;

    public AlarmManager(User user) {
        this.user = user;
        this.alarms = new ArrayList<>();
    }

    public void addAlarm(Alarm alarm) {
        alarms.add(alarm);
        System.out.println(user.getName() + " added alarm: " + alarm.getLabel());
    }

    public void showAlarms() {
        if (alarms.isEmpty()) {
            System.out.println("No alarms set.");
            return;
        }

        System.out.println("\nAlarms for " + user.getName() + ":");
        for (Alarm a : alarms) {
            System.out.println(a.getTime() + " - " + a.getLabel());
        }
    }

    public void triggerAlarms() {
        System.out.println("\nTriggering alarms...");
        for (Alarm a : alarms) {
            if (a.isActive()) {
                a.ring();
            }
        }
    }

    public void snoozeAlarm(Alarm alarm) {
        System.out.println("Snoozing alarm: " + alarm.getLabel() + " for 5 minutes...");
    }

    public void removeAlarm(Alarm alarm) {
        alarms.remove(alarm);
        System.out.println("Removed alarm: " + alarm.getLabel());
    }
}
public class SmartAlarmSystem {
    public static void main(String[] args) {

        try {

            User user = new User("Dheepesh");
            AlarmManager manager = new AlarmManager(user);

            Alarm a1 = new MorningAlarm("07:00", "Gym Time");
            Alarm a2 = new MeetingAlarm("10:30", "Project Meeting");

            manager.addAlarm(a1);
            manager.addAlarm(a2);
            manager.showAlarms();
            manager.triggerAlarms();
            manager.snoozeAlarm(a1);
            manager.removeAlarm(a2);
            manager.showAlarms();

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}