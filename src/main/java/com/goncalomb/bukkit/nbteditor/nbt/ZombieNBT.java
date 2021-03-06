/*
 * Copyright (C) 2013 - Gonçalo Baltazar <http://goncalomb.com>
 *
 * This file is part of NBTEditor.
 *
 * NBTEditor is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * NBTEditor is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with NBTEditor.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.goncalomb.bukkit.nbteditor.nbt;

import com.goncalomb.bukkit.nbteditor.nbt.variable.BooleanVariable;
import com.goncalomb.bukkit.nbteditor.nbt.variable.IntegerVariable;
import com.goncalomb.bukkit.nbteditor.nbt.variable.NBTGenericVariableContainer;

public class ZombieNBT extends MobNBT {
	
	static {
		NBTGenericVariableContainer variables = new NBTGenericVariableContainer("Zombie");
		variables.add("is-villager", new BooleanVariable("IsVillager"));
		variables.add("is-baby", new BooleanVariable("IsBaby"));
		variables.add("conversion-time", new IntegerVariable("ConversionTime", -1));
		variables.add("can-break-doors", new BooleanVariable("CanBreakDoors"));
		EntityNBTVariableManager.registerVariables(ZombieNBT.class, variables);
	}
	
}
