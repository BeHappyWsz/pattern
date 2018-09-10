package command;

import org.junit.Test;

import command.command.AddRequirementCommand;
import command.command.Command;
import command.command.DeletePageCommand;
import command.invoker.Invoker;

public class Client {

	@Test
	public void addRequire() {
		Invoker in = new Invoker();
		AddRequirementCommand arm = new AddRequirementCommand();
		in.setCommand(arm);
		in.action();
	}
	
	@Test
	public void deletePage() {
		Invoker in = new Invoker();
		Command command = new DeletePageCommand();
		in.setCommand(command);
		in.action();
	}
}
