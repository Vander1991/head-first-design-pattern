package szu.vander.control.command;

import szu.vander.control.appliance.Thermostat;

/**
* @author : Vander Choi
* @date : 2018-06-17
* @description :
*/
public class ThermostatOnCommand implements Command {

	private Thermostat thermostat;
	
	public ThermostatOnCommand(Thermostat thermostat) {
		this.thermostat = thermostat;
	}
	
	public void excute() {
		thermostat.on();
	}
	
}
