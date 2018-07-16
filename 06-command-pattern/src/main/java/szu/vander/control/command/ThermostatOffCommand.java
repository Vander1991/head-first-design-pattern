package szu.vander.control.command;

import szu.vander.control.appliance.Thermostat;

/**
* @author : Vander Choi
* @date : 2018-06-17
* @description :
*/
public class ThermostatOffCommand implements Command {

	private Thermostat thermostat;
	
	public ThermostatOffCommand(Thermostat thermostat) {
		this.thermostat = thermostat;
	}
	
	public void excute() {
		thermostat.off();
	}
	
}
