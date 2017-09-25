package com.github.rayluoluo.snippet.s06_TestOverwrite;

class WheatMill extends Mill {
	Wheat process() {
		return new Wheat();
	}
}
