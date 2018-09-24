package szu.vander.beat;
/**
* @author : Vander Choi
* @date : 2018-09-16
* @description :
*/
public class Main {

	public static void main(String args[]) {
		BaseBeatModel model = new BeatModel();
		BaseController beatController = new BeatController(model);
	}
	
}
