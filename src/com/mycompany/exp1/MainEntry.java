/**
 * 
 */
package com.mycompany.exp1;

import com.mycompany.exp1.dragon.Dragon;
import com.mycompany.exp1.dragon.Mushu;
import com.mycompany.exp1.dragon.Spyro;
import com.mycompany.exp1.village.Village;

/**
 * @author Kathleen Falcon
 *
 */
public class MainEntry {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dragon dragonMushu = new Mushu();
		
		Village village2eat = new Village(2);
		Dragon dragonSpyro = new Spyro(village2eat);
		
	}

}
