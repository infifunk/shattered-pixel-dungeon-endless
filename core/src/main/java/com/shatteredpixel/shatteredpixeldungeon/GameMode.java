/*
 * Pixel Dungeon
 * Copyright (C) 2012-2015 Oleg Dolya
 *
 * Shattered Pixel Dungeon
 * Copyright (C) 2014-2026 Evan Debenham
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>
 */

package com.shatteredpixel.shatteredpixeldungeon;

/**
 * Identifies which ruleset and save namespace is currently active.
 *
 * Original mode deliberately keeps the historical save paths unchanged so
 * existing installations and saved games remain compatible. Endless mode
 * stores its runs beneath its own directory.
 */
public enum GameMode {

	ORIGINAL(""),
	ENDLESS("endless/");

	private final String saveDirectory;

	public static GameMode current = ORIGINAL;

	GameMode(String saveDirectory) {
		this.saveDirectory = saveDirectory;
	}

	public String saveDirectory() {
		return saveDirectory;
	}

	public static void select(GameMode mode) {
		current = mode == null ? ORIGINAL : mode;
	}
}
