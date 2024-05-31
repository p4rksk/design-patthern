package ex10.command;

import ex10.Alarm.Alarm;

public class AlarmCommand implements Command {

    private Alarm alarm;

    public AlarmCommand(Alarm alarm) {
        this.alarm = alarm;
    }

    @Override
    public void execute() {
        alarm.alarmOn();
    }
}