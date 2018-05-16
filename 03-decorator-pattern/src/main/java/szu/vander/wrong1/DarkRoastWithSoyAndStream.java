package szu.vander.wrong1;
/**
* @author : Vander Choi
* @date : 2018-04-15
* @description :
*/
public class DarkRoastWithSoyAndStream extends Beverage {

	/**
	 * soy:$1 + stream:$1
	 */
	@Override
	public float cost() {
		return 15.0f + 1 + 1;
	}

}
