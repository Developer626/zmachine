/***
 *  Copyright (C) 2011 Bernhard Amann
 *
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU Affero General Public License version 3 as
 *  published by the Free Software Foundation.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU Affero General Public License for more details.
 *
 *  You should have received a copy of the GNU Affero General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 ***/


package de.lilawelt.zmachine.client.machine;

import java.io.Serializable;

public class Dimension implements Serializable {
	private static final long serialVersionUID = 1L;
	public int height;
	public int width;

	public Dimension(int height, int width) {
		this.height = height;
		this.width = width;
	}
	

}
