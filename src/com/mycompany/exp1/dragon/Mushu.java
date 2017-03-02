/**
 * 
 */
package com.mycompany.exp1.dragon;

import com.mycompany.exp1.village.Village;

/**
 * @author Kathleen Falcon
 *
 */
public class Mushu implements Dragon {
	
	/* (non-Javadoc)
	 * @see com.mycompany.exp1.dragon.Dragon#breatheFire()
	 */
	@Override
	public boolean breatheFire() {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mycompany.exp1.dragon.Dragon#canFly()
	 */
	@Override
	public Boolean canFly() {
		// TODO Auto-generated method stub
		return new Boolean(false);
	}

	/* (non-Javadoc)
	 * @see com.mycompany.exp1.dragon.Dragon#eatVillage(com.mycompany.exp1.village.Village)
	 */
	@Override
	public boolean eatVillage(Village village) {
		// TODO Auto-generated method stub
		return false;
	}

}
