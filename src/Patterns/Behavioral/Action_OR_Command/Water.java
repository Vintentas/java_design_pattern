package Patterns.Behavioral.Action_OR_Command;

class Water {
    Command command;

    public void setCommand(Command command) {
        this.command = command;
        command.execute();
    }
}
